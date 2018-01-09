package Map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    public static void main(String[] args) {
        System.out.println("Map2");
    }

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0.
    For example the string "hello" makes the pair "hello":0.
    We'll do more complicated counting later, but for this problem the value is simply 0.
    */
    public static  Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }

    /*
    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
    */
    public static  Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, s.length());
            }
        }
        return map;
    }

    /*
    Given an array of non-empty strings, create and return a Map<String, String> as follows:
    for each string add its first character as a key with its last character as the value.
    */
    public static  Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
        }
        return map;
    }

    /*
    The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string,
    with the value the number of times that string appears in the array.
    */
    public static  Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }

    /*
    Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
    with the value of all the strings starting with that character appended together in the order they appear in the array.
    */
    public static  Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {

            String charKey = s.charAt(0) + "";

            if (!map.containsKey(charKey)) {
                map.put(charKey, s);
            } else {
                map.put(charKey, map.get(charKey) + s);
            }
        }
        return map;
    }

    /*
    Loop over the given array of strings to build a result string like this:
    when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
    Return the empty string if no string appears a 2nd time.
    */
    public static  String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap();
        String ret = "";
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
            if (map.get(s) % 2 == 0) {
                ret += s;
            }
        }
        return ret;
    }

    /*
    Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.
    */
    public static  Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap();
        for(String s : strings){
            if(!map.containsKey(s)){
                map.put(s, false);
            }
            else{
                map.put(s, true);
            }

        }
        return map;
    }

    /*
    We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array.
    When a position in the array has been swapped, it no longer matches anything.
    Using a map, this can be solved making just one pass over the array. More difficult than it looks.
    */
    public static  String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for(int i = 0; i < strings.length; i++){
            String sKey = strings[i].charAt(0) + "";
            if(!map.containsKey(sKey)){
                map.put(sKey, i);
            }
            else{
                int t =  map.get(sKey);
                String tmp = strings[i];
                strings[i] = strings[t];
                strings[t] = tmp;
                map.remove(sKey);
            }

        }
        return strings;
    }

    /*
    We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array.
    A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array.
    More difficult than it looks.
    */
    public static  String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for(int i = 0; i < strings.length; i++){
            String sKey = strings[i].charAt(0) + "";
            if(!map.containsKey(sKey)){
                map.put(sKey, i);
            }
            else if(map.get(sKey) == -1){
                //skip
            }
            else{
                int t =  map.get(sKey);
                String tmp = strings[i];
                strings[i] = strings[t];
                strings[t] = tmp;
                map.put(sKey, -1);
            }

        }
        return strings;
    }

}


