package String;

public class String3 {

    public static void main(String[] args) {
        System.out.println("String3");
    }

    /*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
    but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
    (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)*/
    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')
                    && (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))))
                count++;
        return count;
    }

    /*Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
    You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".*/
    public static String withoutString(String base, String remove) {
        base = base.replaceAll(remove, "");
        remove = remove.toLowerCase();
        base = base.replaceAll(remove, "");
        remove = remove.toUpperCase();
        return base.replaceAll(remove, "");
    }

    /*Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).*/
    public static boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        str = str + "X";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")){
                is++;
            }
            if (str.substring(i, i + 3).equals("not")){
                not++;
            }
        }
        return (is == not);
    }

    /*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.*/
    public static boolean gHappy(String str) {
        int len = str.length();
        boolean res = true;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i-1) == 'g')
                    res = true;
                else if (i < len-1 && str.charAt(i+1) == 'g')
                    res = true;
                else
                    res = false;
            }
        }
        return res;
    }

    /*We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.*/
    public static int countTriple(String str) {
        int len = str.length();
        int count = 0;

        for (int i = 0; i < len-2; i++){
            char ch = str.charAt(i);
            if (ch == str.charAt(i+1) && ch == str.charAt(i+2))
                count++;
        }
        return count;
    }


    /*Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
    Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    Integer.parseInt(string) converts a string to an int.)*/
    public static int sumDigits(String str) {
        int len = str.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(str.charAt(i))) {
                String number = str.substring(i,i + 1);
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    /*Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
     For example, sameEnds("abXab") is "ab".*/
    public static String sameEnds(String string) {
        String res = "";
        int len = string.length();
        for (int i = 0; i <= len / 2; i++)
            for (int j = len / 2; j < len; j++)
                if (string.substring(0, i).equals(string.substring(j)))
                    res = string.substring(0, i);
        return res;
    }

    /*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
    In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping).
    For example, the string "abXYZba" has the mirror end "ab".*/
    public static String mirrorEnds(String string) {
        int len = string.length();
        String res = "";
        for(int i = 0; i < len; i++){
            if(string.charAt(i) == string.charAt(len - i - 1)){
                res += string.substring(i, i+1);
            }
            else{
                break;
            }
        }
        return res;
    }

    /*Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.*/
    public static int maxBlock(String str) {
        if(str.isEmpty()){
            return 0;
        }
        int max = 0;
        int tmp = 1;
        for(int i = 1 ; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i - 1)){
                tmp ++;
            }
            else{
                if(tmp >= max){
                    max = tmp;
                }
                tmp = 1;
            }
        }
        if(tmp > max){
            return tmp;
        }

        return max;
    }

    /*Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
    A number is a series of 1 or more digit chars in a row.
    (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    Integer.parseInt(string) converts a string to an int.)*/
    public static int sumNumbers(String str) {
        String[] strings = str.split("\\D+");

        int res = 0;
        for(String s : strings){
            if(!s.isEmpty())
                res += Integer.parseInt(s);
        }

        return res;
    }

    /*Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
    The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
    (Note: Character.isLetter(char) tests if a char is a letter.)*/
    public static String notReplace(String str) {
        return str.replaceAll("(\\b)(is)(\\b)", "$1$2 not$3");
    }

}
