package Functional;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {

    public static void main(String[] args) {
        System.out.println("Func1");
    }

    /*
    Given a list of integers, return a list where each integer is multiplied by 2.
    */
    public static  List<Integer> doubling(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        return nums;
    }

    /*
    Given a list of integers, return a list where each integer is multiplied with itself.
     */
    public static  List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }


    /*
    Given a list of strings, return a list where each string has "*" added at its end.
     */
    public static  List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }

    /*
    Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
     */
    public static  List<String> copies3(List<String> strings) {
        strings = strings.stream()
                .map(s -> s + s + s)
                .collect(Collectors.toList());
        return strings;
    }

    /*
    Given a list of strings, return a list where each string has "y" added at its start and end.
     */
    public static  List<String> moreY(List<String> strings) {
        strings = strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
        return strings;
    }

    /*
    Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
     */
    public static  List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    /*
    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
     */
    public static  List<Integer> rightDigit(List<Integer> nums) {
        nums = nums.stream().map(n -> n % 10).collect(Collectors.toList());
        return nums;
    }

    /*
    Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
     */
    public static  List<String> lower(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }

    /*
    Given a list of strings, return a list where each string has all its "x" removed.
     */
    public static  List<String> noX(List<String> strings) {
        strings.replaceAll(s -> s.replaceAll("x", ""));
        return strings;
    }



}
