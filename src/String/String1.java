package String;

public class String1 {

    public static void main(String[] args) {
        System.out.println("String1");
    }

    /*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".*/
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    /*Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".*/
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /*The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and word strings, create the HTML string with tags around the word, e.g.
    "<i>Yay</i>".*/
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /*Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
    Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
    */
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    /*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.*/
    public static String extraEnd(String str) {
        int len = str.length();
        if (len >= 2) {
            return str.substring(len - 2, len) + str.substring(len - 2, len) + str.substring(len - 2, len);
        }
        return "";
    }

    /*Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
    Note that str.length() returns the length of a string.*/
    public static String firstTwo(String str) {
        if (str.length() > 1) {
            return str.substring(0, 2);
        }
        return str;
    }

    /*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".*/
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /*Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.*/
    public static String withoutEnd(String str) {
        int len = str.length();
        return str.substring(1, len - 1);
    }

    /*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).*/
    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }
        return b + a + b;
    }

    /*Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.*/
    public static String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }


    /*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.*/
    public static String left2(String str) {
        if (str.length() > 2) {
            return (str.substring(2, str.length()) + str.substring(0, 2));
        }
        return str;
    }


    /*Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.*/
    public static String right2(String str) {
        int len = str.length();
        return str.substring(len - 2, len) + str.substring(0, len - 2);
    }

    /*Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.*/
    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.charAt(0) + "";
        }
        return (str.charAt(str.length() - 1)) + "";
    }

    /*Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.*/
    public static String withouEnd2(String str) {
        int len = str.length();
        if (len > 1) {
            return str.substring(1, len - 1);
        }
        return "";
    }

    /*Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.*/
    public static String middleTwo(String str) {
        int len = str.length();
        if (len > 2) {
            return str.substring(len / 2 - 1, len / 2 + 1);
        }
        return str;
    }

    /*Given a string, return true if it ends in "ly".*/
    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    /*Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.*/
    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    /*Given a string and an index, return a string length 2 starting at the given index.
    If the index is too big or too small to define a string length 2, use the first 2 chars.
    The string length will be at least 2.*/
    public static String twoChar(String str, int index) {
        int len = str.length();
        if (index + 2 > len || index < 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    /*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.*/
    public static String middleThree(String str) {
        int len = str.length();
        if (len > 3) {
            int tmp = len / 2;
            return str.substring(tmp - 1, tmp + 2);
        } else {
            return str;
        }
    }


    /*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0. Note: use .equals() to compare 2 strings.*/
    public static boolean hasBad(String str) {
        if (str.length() > 2) {
            if (str.indexOf("bad") == 0 || str.indexOf("bad") == 1) {
                return true;
            }
        }
        return false;
    }

    /*Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.*/
    public static String atFirst(String str) {
        if (str.length() < 2) {
            if (str.isEmpty()) {
                return "@@";
            }
            return str + "@";
        }
        return str.substring(0, 2);
    }

    /*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
    If either string is length 0, use '@' for its missing char.*/
    public static String lastChars(String a, String b) {
        if (!a.isEmpty()) {
            a = a.charAt(0) + "";
        } else {
            a = "@";
        }

        if (!b.isEmpty()) {
            b = b.charAt(b.length() - 1) + "";
        } else {
            b = "@";
        }
        return a + b;
    }


    /*Given two strings, append them together (known as "concatenation") and return the result.
    However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".*/
    public static String conCat(String a, String b) {
        if ((!a.isEmpty() && !b.isEmpty()) && ((a.charAt(a.length() - 1) == b.charAt(0)))) {
            return a.concat(b.substring(1, b.length()));
        } else {
            return a.concat(b);

        }
    }


    /*Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".*/
    public static String lastTwo(String str) {
        int len = str.length();
        if (len > 1) {
            return str.substring(0, len - 2) + str.charAt(len - 1) + str.charAt(len - 2);
        }
        return str;
    }

    /*Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.*/
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }

        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    /*Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".*/
    public static boolean frontAgain(String str) {
        int len = str.length();
        if (len > 1) {
            String start = str.substring(0, 2);
            String end = str.substring(len - 2, len);
            if (start.equals(end)) {
                return true;
            }

        }
        return false;
    }

    /*Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
    So "Hello" and "Hi" yield "loHi". The strings may be any length.*/
    public static String minCat(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        if (aLen == 0 || bLen == 0) {
            return "";
        }

        if (aLen < bLen) {
            return a.concat(b.substring(bLen - aLen, bLen));
        }

        return a.substring(aLen - bLen, aLen).concat(b);
    }


    /*Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.*/
    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String t = str.substring(0, 2);
            return t + t + t;
        }
    }


    /*Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
    The substring may overlap with itself, so "Hi" yields "".
    Otherwise, return the original string unchanged.*/
    public static String without2(String str) {
        int len = str.length();
        if (len > 1 && (str.substring(0, 2).equals(str.substring(len - 2, len)))) {
            return str.substring(2, len);
        }
        return str;
    }


    /*Given a string, return a version without the first 2 chars.
    Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    The string may be any length. Harder than it looks.*/
    public static String deFront(String str) {

        if (str.isEmpty()) {
            return "";
        }

        boolean firstA = (str.charAt(0) == 'a');
        //Expecting error <_<
        boolean secondB = (str.charAt(1) == 'b');

        str = str.substring(2, str.length());
        String retString = "";
        if (firstA) {
            retString += "a";
        }
        if (secondB) {
            retString += "b";
        }

        return retString + str;
    }


    /*Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly.
    On a match, return the front of the string, or otherwise return the empty string.
    So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
    The word will be at least length 1.*/
    public static String startWord(String str, String word) {
        int w_len = word.length();
        if (str.isEmpty()) {
            return ("");
        }
        if (w_len > 1) {
            String tmp = word.substring(1, w_len);
            int in = str.indexOf(tmp);
            if (in == 1) {
                return str.substring(0, w_len);
            }
            return "";
        }
        return str.charAt(0) + "";
    }

    /*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.*/
    public static String withoutX(String str) {
        String tmp = str;
        if (tmp.isEmpty()) {
            return tmp;
        }
        if (tmp.charAt(0) == 'x') {
            tmp = tmp.substring(1, tmp.length());
            if (tmp.isEmpty()) {
                return tmp;
            }
        }
        if (tmp.charAt(tmp.length() - 1) == 'x') {
            tmp = tmp.substring(0, tmp.length() - 1);
        }
        return tmp;
    }


    /*Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
    This is a little harder than it looks.*/
    public static String withoutX2(String str) {
        if (str.length() > 2) {
            String tmp = str.substring(0, 2);
            tmp = tmp.replaceAll("x", "");
            return tmp + str.substring(2, str.length());
        }
        return str.replaceAll("x", "");

    }

}
