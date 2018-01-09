package Array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        System.out.println("Array3");
    }

    /*Consider the leftmost and righmost appearances of some value in an array.
    We'll say that the "span" is the number of elements between the two inclusive.
    A single value has a span of 1. Returns the largest span found in the given array.
    (Efficiency is not a priority.)*/
    public static int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int first = str.indexOf(Integer.toString(nums[i]));
            int last = str.lastIndexOf(Integer.toString(nums[i]));
            if (last - first > max) {
                max = last - first;
            }
        }
        return max + 1;
    }

    /*Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
    Do not move the 3's, but every other number may move.
    The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.*/
    public static int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = i + 2; j < nums.length; j++)
                    if (nums[j] == 4) nums[j] = temp;
            }
        return nums;
    }


    /*
    (This is a slightly harder version of the fix34 problem.)
    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's,
    but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
    In this version, 5's may appear anywhere in the original array.*/
    public static int[] fix45(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                while (nums[j] != 5 || (j != 0 && nums[j - 1] == 4)) {
                    j++;
                }
                nums[j] = nums[i + 1];
                nums[i + 1] = 5;
            }
        }
        return nums;
    }


    /*Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side*/
    public static boolean canBalance(int[] nums) {
        int sum = 0;
        int tailSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                tailSum += nums[j];
            }
            if (sum == tailSum) {
                return true;
            }
            tailSum = 0;
        }
        return false;
    }

    /*
    Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
    The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.*/
    public static boolean linearIn(int[] outer, int[] inner) {
        String out = Arrays.toString(outer).replaceAll("\\[|\\]|,|\\s", "");
        String in = Arrays.toString(inner).replaceAll("\\[|\\]|,|\\s", "");
        for (int i = 0; i < inner.length; i++) {
            if (!out.contains(Integer.toString(inner[i]))) {
                return false;
            }
        }
        return true;
    }

    /*Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).*/
    public static int[] squareUp(int n) {
        int[] arr = new int[n * n];
        if (n == 0)
            return arr;

        for (int i = n - 1; i < arr.length; i += n) {

            for (int j = i; j >= i - i / n; j--)

                arr[j] = i - j + 1;

        }

        return arr;
    }

    /*Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
    (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
    which is known to sum to exactly n*(n + 1)/2.*/
    public static int[] seriesUp(int n) {
        int arr[] = new int[n * (n + 1) / 2];
        int c = 1;
        for (int i = 0; i < arr.length; ) {
            for (int j = 0; j < c; j++) {
                arr[j + i] = j + 1;
            }
            i += c;
            c++;
        }
        return arr;
    }

    /*We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order.
    For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
    Return the size of the largest mirror section found in the given array.*/
    public static int maxMirror(int[] nums) {
        int len = nums.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < len; i++) {
            count = 0;
            for (int j = len - 1; i + count < len && j > -1; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    if (count > 0) {
                        max = Math.max(count, max);
                        count = 0;
                    }
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }


    /*Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.*/
    public static int countClumps(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1]) {
                count++;
                for (int j = i + 1; j < nums.length; j++)
                    if (nums[j] == nums[i]) i++;
                    else break;
            }
        return count;
    }


}
