package Warmup;

import java.util.Arrays;

public class Warmup2 {

    public static void main(String[] args) {
        System.out.println("Warmup2");
    }

    /*
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     */
    public static String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }


    /*
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
     */
    public static String frontTimes(String str, int n) {
        int len = str.length();
        StringBuilder sb = new StringBuilder("");
        if (len < 3) {
            for (int i = 0; i < n; i++) {
                sb.append(str);
            }
            return sb.toString();
        } else {
            for (int i = 0; i < n; i++) {
                sb.append(str.substring(0, 3));
            }
            return sb.toString();
        }
    }

    /*
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     */
    public static String stringBits(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i = i + 2) {
            s += str.charAt(i);
        }
        return s;
    }

    /*
    Given a non-empty string like "Code" return a string like "CCoCodCode".
     */
    public static String stringSplosion(String str) {
        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            tmp += str.substring(0, i);
        }
        return tmp + str;
    }

    /*
    Given a string, return the count of the number of times that a substring length 2 appears in the string
    and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
     */
    public static int last2(String str) {
        int len = str.length();
        if (len < 2) return 0;

        String tmp = str.substring(len - 2);
        int c = 0;

        for (int i = 0; i < len - 2; i++) {
            String s = str.substring(i, i + 2);
            if (s.equals(tmp)) {
                c++;
            }
        }

        return c;
    }

    /*
    Given an array of ints, return the number of 9's in the array.
     */
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 9) {
                count++;
            }
        }
        return count;
    }

    /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.
     */
    public static boolean arrayFront9(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        return str.indexOf('9') > -1 && str.indexOf('9') < 4;
    }

    /*
    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
     */
    public static int stringMatch(String a, String b) {

        int len = Math.min(a.length(), b.length());
        int c = 0;

        for (int i = 0; i < len - 1; i++) {
            String sa = a.substring(i, i + 2);
            String sb = b.substring(i, i + 2);
            if (sa.equals(sb)) {
                c++;
            }
        }

        return c;
    }

    /*
    Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.
     */
    public static String stringX(String str) {
        String rp = str.replaceAll("x", "");
        String ret = "";
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            ret += "x";
        }
        ret += rp;
        if (str.charAt(str.length() - 1) == 'x') {
            ret += "x";
        }

        return ret;
    }

    /*
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     */
    public static boolean array123(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        return str.contains("123");
    }

    /*
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     */
    public static String altPairs(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            s = s + str.substring(i, end);
        }

        return s;
    }

    /*
    Given an array of ints, return the number of times that two 6's are next to each other in the array.
    Also count instances where the second "6" is actually a 7.
     */
    public static int array667(int[] nums) {
        int c = 0;
        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    c++;
                }
            }
        }
        return c;
    }

    /*
    Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1.
    Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
     */
    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i + 1] == nums[i] + 5)
                    && ((nums[i + 2] >= nums[i] - 3) && (nums[i + 2] <= nums[i] + 1))) {
                return true;
            }
        }
        return false;
    }


    /*
    Suppose the string "yak" is unlucky.
    Given a string, return a version where all the "yak" are removed, but the "a" can be any char.
    The "yak" strings will not overlap.
     */
    public static String stringYak(String str) {
        return str.replace("yak", "");
    }

    /*
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     */
    int countXX(String str) {
        int count = 0;
        while (str.indexOf("xx") > -1) {
            str = str.replaceFirst("xx", "x");
            count++;
        }
        return count;
    }

    /*
    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    Return true if the array does not contain any triples.
     */
    public static boolean noTriples(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        for (int num : nums) {
            String tmp = Integer.toString(num);
            if (str.contains(tmp + tmp + tmp)) {
                return false;
            }
        }

        return true;
    }

    /*
    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     */
    boolean doubleX(String str) {
        int target = str.indexOf("xx");
        int check = str.indexOf("x");

        return (target <= check && target > -1) || (check == -1 && target > 0);
    }


}
