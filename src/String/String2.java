package String;

public class String2 {

    public static void main(String[] args) {
        System.out.println("String2");
    }

    /*Given a string, return a string where for every char in the original, there are two chars.*/
    public static String doubleChar(String str) {
        str = str.replaceAll(".", "$0$0");

        return str;
    }

    /*Return the number of times that the string "hi" appears anywhere in the given string.*/
    public static int countHi(String str) {
        String findStr = "hi";
        return str.split(findStr, -2).length - 1;
    }

    /*Return true if the string "cat" and "dog" appear the same number of times in the given string.*/
    public static boolean catDog(String str) {
        String findStr = "cat";
        int c = str.split(findStr, -1).length - 1;
        findStr = "dog";
        int d = str.split(findStr, -1).length - 1;
        return c == d;
    }

    /*Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.*/
    public static int countCode(String str) {
        int i = 0;
        str = str.replaceAll("co.e", "code");

        while (str.contains("code")) {
            str = str.replaceFirst("code", "");
            i++;
        }
        return i;
    }

    /*Given two strings, return true if either of the strings appears at the very end of the other string,
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.*/
    public static boolean endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        int lastIndex1 = aLower.lastIndexOf(bLower);
        int lastIndex2 = bLower.lastIndexOf(aLower);

        if (lastIndex1 == -1 && lastIndex2 == -1) {
            return false;
        }
        return (lastIndex1 + b.length() == a.length()
                || lastIndex2 + a.length() == b.length());
    }

    /*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
    So "xxyz" counts but "x.xyz" does not.*/
    public static boolean xyzThere(String str) {
        str = str.replaceAll("\\.xyz", "rep");
        return str.contains("xyz");
    }

    /*Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.*/
    public static boolean bobThere(String str) {
        str = str.replaceAll("b.b", "bob");
        return str.contains("bob");
    }


    /*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
    So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
    Return true if the given string is xy-balanced.*/
    public static boolean xyBalance(String str) {
        int lastIndexX = str.lastIndexOf('x');
        int lastIndexY = str.lastIndexOf('y');

        return lastIndexY >= lastIndexX;
    }

    /*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on.
    Any leftover chars go at the end of the result.*/
    public static String mixString(String a, String b) {
        int c;
        if (a.length() > b.length()) {
            c = a.length();
        } else {
            c = b.length();
        }

        String ret = "";
        for (int i = 0; i < c; i++) {
            if (i <= a.length() - 1)
                ret += a.substring(i, i + 1);
            if (i <= b.length() - 1)
                ret += b.substring(i, i + 1);
        }
        return ret;
    }

    /*Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.*/
    public static String repeatEnd(String str, int n) {
        String rep = "";
        for (int i = 0; i < n; i++) {
            rep += str.substring(str.length() - n, str.length());
        }
        return rep;
    }


    /*Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on.
    You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).*/
    public static String repeatFront(String str, int n) {
        String ret = "";
        while (n > 0) {
            ret += str.substring(0, n);
            n--;
        }

        return ret;
    }

    /*Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.*/
    public static String repeatSeparator(String word, String sep, int count) {
        String ret = word;
        String sepStr = sep + word;

        if (count == 0) {
            return "";
        }

        for (int i = 1; i < count; i++) {
            ret += sepStr;
        }


        return ret;
    }


    /*Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string?
    Assume that the string is not empty and that N is in the range 1..str.length().*/
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        str = str.replaceFirst(prefix, "");
        return str.contains(prefix);
    }

    /*Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
    This problem is harder than it looks.*/
    public static boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3) return false;
        if (len % 2 == 1)
            return str.substring(len / 2 - 1, len / 2 + 2).equals("xyz");
        return str.substring(len / 2 - 2, len / 2 + 1).equals("xyz")
                || str.substring(len / 2 - 1, len / 2 + 2).equals("xyz");

    }

    /*A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string,
    or return the empty string "" if there are not two pieces of bread.*/
    public static String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first == last) {
            return "";
        }
        return str.substring(first + 5, last);
    }

    /*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.*/
    public static boolean sameStarChar(String str) {
        boolean check = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    /*Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
    Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.*/
    public static String oneTwo(String str) {
        String ret = "";
        String tmp = "";

        int i;
        for (i = 0; i < str.length(); i += 3) {
            if (i + 3 <= str.length()) {
                tmp = str.substring(i + 1, i + 3) + str.substring(i, i + 1);
            } else {
                tmp = "";
            }

            ret += tmp;
        }
        return ret;
    }

    /*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
    Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".*/
    public static String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }


    /*Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
    So "ab*cd" yields "ad" and "ab**cd" also yields "ad".*/
    public static String starOut(String str) {
        return str.replaceAll(".?\\*+.?", "");
    }

    /*Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"),
    except for appearances of the word string which are preserved unchanged.*/
    public static String plusOut(String str, String word) {
        int start = 0;
        int end = str.indexOf(word);
        while (end != -1) {
            for (int i = start; i < end; i++)
                str = str.substring(0, i) + "+" + str.substring(i + 1);
            start = end + word.length();
            end = str.indexOf(word, start);
        }
        for (int i = start; i < str.length(); i++)
            str = str.substring(0, i) + "+" + str.substring(i + 1);
        return str;
    }

    /*Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
    Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.*/
    public static String wordEnds(String str, String word) {
        //return str.replaceAll("(.?)("+ word +")(.?)","$1$3");
        String res = "";
        int index = 0;
        index = str.indexOf(word);

        while (index != -1) {
            if (index != 0) {
                res += str.charAt(index - 1);
            }
            if (index + word.length() != str.length()) {
                res += str.charAt(index + word.length());
            }
            index = str.indexOf(word, index + word.length());
        }
        return res;
    }


}
