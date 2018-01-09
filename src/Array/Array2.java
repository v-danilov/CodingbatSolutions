package Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        System.out.println("Array2");
    }

    /*Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.*/
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    /*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.*/
    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return max - min;
    }


    /*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array.
    If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value.
    Use int division to produce the final average.
    You may assume that the array is length 3 or more.*/
    public static int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return (sum - min - max) / (nums.length - 2);
    }


    /*Return the sum of the numbers in the array, returning 0 for an empty array.
    Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.*/
    public static int sum13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i = i + 1;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }


    /*Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
    Return 0 for no numbers.*/
    public static int sum67(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 7) {
                        i = j;
                        break;
                    }
                }
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }


    /*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.*/
    public static boolean has22(int[] nums) {
        String str = Arrays.toString(nums);
        return str.contains("2, 2");
    }

    /*Given an array of ints, return true if the array contains no 1's and no 3's.*/
    public static boolean lucky13(int[] nums) {
        String str = Arrays.toString(nums);
        return !(str.contains("1") || str.contains("3"));
    }


    /*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.*/
    public static boolean sum28(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            if (num == 2)
                sum += num;
        }
        return sum == 8;

    }

    /*Given an array of ints, return true if the number of 1's is greater than the number of 4's*/
    public static boolean more14(int[] nums) {
        int one = 0;
        int four = 0;

        for (int num : nums) {
            if (num == 1)
                one++;
            if (num == 4)
                four++;
        }
        return one > four;
    }

    /*Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    The given n may be 0, in which case just return a length 0 array.
    You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works.
    The syntax to make a new int array is: new int[desired_length]*/
    public static int[] fizzArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = i;
        return res;
    }


    /*Given an array of ints, return true if every element is a 1 or a 4.*/
    public static boolean only14(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        str = str.replaceAll("[14]", "");

        return str.isEmpty();
    }

    /*Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1.
    N may be 0, in which case just return a length 0 array.
    Note: String.valueOf(xxx) will make the String form of most types.
    The syntax to make a new string array is: new String[desired_length] */
    public static String[] fizzArray2(int n) {
        String[] res = new String[n];
        for (int i = 0; i < n; i++)
            res[i] = String.valueOf(i);
        return res;
    }

    /*Given an array of ints, return true if it contains no 1's or it contains no 4's.*/
    public static boolean no14(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");


        return !str.contains("1") || !str.contains("4");
    }


    /*We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value.
    Return true if the given value is everywhere in the array.*/
    public static boolean isEverywhere(int[] nums, int val) {
        if (nums.length == 0) {
            return true;
        }

        int i;
        if (nums[0] == val) {
            i = 0;
        } else {
            i = 1;
        }

        for (; i < nums.length; i += 2) {
            if (nums[i] != val) {
                return false;
            }
        }
        return true;
    }

    /*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.*/
    public static boolean either24(int[] nums) {
        String str = Arrays.toString(nums);
        return (str.contains("2, 2") && !str.contains("4, 4")) || (!str.contains("2, 2") && str.contains("4, 4"));
    }

    /*Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.*/
    public static boolean has77(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        String tmp = str.replaceAll("(77)|(7.?7)", "");

        return !tmp.equals(str);
    }

    /*Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.*/
    public static boolean has12(int[] nums) {
        boolean hasOne = false;

        for (int num : nums) {
            if (num == 1)
                hasOne = true;

            if (hasOne && num == 2)
                return true;
        }

        return false;
    }

    /*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.*/
    public static boolean modThree(int[] nums) {
        if (nums.length < 3)
            return false;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2)
                return true;
        }

        return false;
    }


    /*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.*/
    public static boolean haveThree(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        String tmp = str.replaceAll("3[^3]3[^3]3", "");

        return !tmp.equals(str) && !tmp.contains("3");
    }


    /*Given an array of ints, return true if every 2 that appears in the array is next to another 2.*/
    public static boolean twoTwo(int[] nums) {
        int index = 0;
        for (int i = 0; i < (nums.length); i++) {
            if (nums[i] == 2) {
                i++;
                if (!(i < (nums.length)) || nums[i] != 2) return false;
                while (i < nums.length && nums[i] == 2) i++;
            }
        }
        return true;
    }


    /*Return true if the group of N numbers at the start and end of the array are the same.
    For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,  and false for n=1 and n=3.
    You may assume that n is in the range 0..nums.length inclusive.*/
    public static boolean sameEnds(int[] nums, int len) {

        for (int i = 0; i < len; ++i) {
            if (nums[i] != nums[nums.length - len + i])
                return false;
        }
        return true;
    }

    /*Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.*/
    public static boolean tripleUp(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2])
                return true;
        }

        return false;
    }


    /*Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
    The end number will be greater or equal to the start number. Note that a length-0 array is valid.*/
    public static int[] fizzArray3(int start, int end) {
        int[] res = new int[end - start];

        for (int i = start; i < end; i++)
            res[i - start] = i;

        return res;
    }

    /*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.*/
    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int first = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = first;

        return nums;
    }

    /*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
    until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.*/
    public static int[] tenRun(int[] nums) {
        boolean change = false;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                tmp = nums[i];
                change = true;
            } else if (change && nums[i] % 10 != 0) {
                nums[i] = tmp;
            }
        }
        return nums;
    }


    /*
    Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array.
    The original array will contain at least one 4.
    Note that it is valid in java to create an array of length 0.*/
    public static int[] pre4(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        int index = str.indexOf("4");


        return Arrays.copyOfRange(nums, 0, index);
    }


    /*Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array.
    The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.*/
    public static int[] post4(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        int index = str.lastIndexOf("4");


        return Arrays.copyOfRange(nums, index + 1, nums.length);
    }


    /*
    We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it.
    Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.*/
    public static int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length - 1 && nums[i] == val) {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                    nums[i] = Math.max(nums[i - 1], nums[i + 1]);

            }
        }
        return nums;
    }


    /*Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array.
    The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.*/
    public static int[] zeroFront(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[count];
                nums[count] = 0;
                count++;
            }
        }
        return nums;
    }


    /*Return a version of the given array where all the 10's have been removed.
    The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
    You may modify and return the given array or make a new array.*/
    public static int[] withoutTen(int[] nums) {
        int count = 0;
        int[] res = new int[nums.length];
        for (int num : nums) {
            if (num != 10) {
                res[count] = num;
                count++;
            }
        }
        return res;
    }

    /*Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
    If there is no odd value to the right of the zero, leave the zero as a zero.*/
    public static int[] zeroMax(int[] nums) {
        int max = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0)
                max = Math.max(max, nums[i]);
            if (nums[i] == 0)
                nums[i] = max;
        }
        return nums;
    }

    /*Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers.
    Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.*/
    public static int[] evenOdd(int[] nums) {
        int even = 0;
        int odd = nums.length - 1;
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                array[even] = nums[i];
                even++;
            } else {
                array[odd] = nums[i];
                odd--;
            }
        }
        return array;
    }


    /*FizzBuzz*/
    public static String[] fizzBuzz(int start, int end) {
        String[] arr = new String[end - start];

        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                arr[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - start] = "Buzz";
            } else {
                arr[i - start] = String.valueOf(i);
            }
        }

        return arr;
    }


}
