package Array;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {

        System.out.println("Array1");
    }

    /*Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.*/
    public static boolean firstLast6(int[] nums) {
        return ((nums[0] == 6) || (nums[nums.length - 1] == 6));
    }

    /*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.*/
    public static boolean sameFirstLast(int[] nums) {
        return nums.length >=1 && (nums[0]==nums[nums.length-1]);
    }

    /*Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.*/
    public static int[] makePi() {
        int pi[] = {3, 1, 4};
        return pi;
    }

    /*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.*/
    public static boolean commonEnd(int[] a, int[] b) {
        if((a[0] == b [0]) || (a[a.length - 1] == b [b.length - 1])){
            return true;
        }
        return false;
    }

    /*Given an array of ints length 3, return the sum of all the elements.*/
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }


    /*Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.*/
    public static int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length -1] = first;
        return nums;
    }

    /*Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.*/
    public static int[] reverse3(int[] nums) {
        int a[] = new int [nums.length];

        for(int i = 0; i < nums.length; i++){
            a[i] = nums[nums.length - i - 1];
        }

        return a;
    }

    /*Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.*/
    public static int[] maxEnd3(int[] nums) {
        int m = Math.max(nums[0], nums[2]);
        int res[] = {m,m,m};
        return res;
    }

    /*Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.*/
    public static int sum2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int s = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 2){
                break;
            }
            s += nums[i];
        }
        return s;
    }

    /*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.*/
    public static int[] middleWay(int[] a, int[] b) {
        int retMid[] = {a[1], b[1]};
        return retMid;
    }

    /*Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.*/
    public static int[] makeEnds(int[] nums) {
        int retArr[] = {nums[0], nums[nums.length-1]};
        return retArr;
    }


    /*Given an int array length 2, return true if it contains a 2 or a 3.*/
    public static boolean has23(int[] nums) {
        String str = Arrays.toString(nums);
        return (str.contains("2") || str.contains("3"));
    }

    /*Given an int array length 2, return true if it does not contain a 2 or 3.*/
    public static boolean no23(int[] nums) {
        String str = Arrays.toString(nums);
        return !(str.contains("2") || str.contains("3"));
    }

    /*Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0.
    The original array will be length 1 or more. Note: by default, a new int array contains all 0's.*/
    public static int[] makeLast(int[] nums) {
        int dLen = nums.length * 2;
        int arr[] = new int[dLen];
        arr[dLen - 1] = nums[nums.length - 1];
        return arr;
    }

    /*Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.*/
    public static boolean double23(int[] nums) {
        String str = Arrays.toString(nums);
        return str.contains("2, 2") || str.contains("3, 3");
    }

    /*Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
    Return the changed array.*/
    public static int[] fix23(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 3){
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    /*Start with 2 int arrays, a and b, of any length.
     Return how many of the arrays have 1 as their first element.*/
    public static int start1(int[] a, int[] b) {
        int ret = 0;
        if(a.length > 0 && a[0] == 1){
            ret++;
        }

        if(b.length > 0 && b[0] == 1){
            ret++;
        }

        return ret;
    }

    /*Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
    Return the array which has the largest sum.
    In event of a tie, return a.*/
    public static int[] biggerTwo(int[] a, int[] b) {

        if((a[0] + a[1]) >=  (b[0] + b[1])){
            return a;
        }
        return b;
    }

    /*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
    The original array will be length 2 or more.*/
    public static int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid]};
    }

    /*Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.*/
    public static int[] plusTwo(int[] a, int[] b) {
        int len = a.length + b.length;
        int result[] = new int[len];
        for(int i = 0; i < a.length; i++){
            result[i] = a[i];
        }
        for(int i = a.length; i < len; i++){
            result[i] = b[i - 2];
        }

        return result;

    }

    /*Given an array of ints, swap the first and last elements in the array. Return the modified array.
    The array length will be at least 1.*/
    public static int[] swapEnds(int[] nums) {
        int a = nums[0];
        nums[0] = nums[nums.length- 1];
        nums[nums.length -1] = a;
        return nums;

    }

    /*Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
    The array length will be at least 3.*/
    public static int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }


    /*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
    The array length will be a least 1.*/
    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        int middle = nums[nums.length/2];

        return Math.max( Math.max(first, last), middle);
    }

    /*Given an int array of any length, return a new array of its first 2 elements. I
    f the array is smaller than length 2, use whatever elements are present.*/
    public static int[] frontPiece(int[] nums) {
        if(nums.length > 2){
            return new int[]{nums[0], nums[1]};
        }
        return nums;
    }


    /*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.*/
    public static boolean unlucky1(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        return nums.length >= 2 && (str.indexOf("13") == 0 || str.indexOf("13") == 1 || str.lastIndexOf("13") == nums.length - 2);
    }

    /*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b.
    The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.*/
    public static int[] make2(int[] a, int[] b) {
        if(a.length >= 2){
            return new int[]{a[0], a[1]};
        }
        if(a.length == 0 && b.length >=2){
            return new int[]{b[0], b[1]};
        }

        return new int[]{a[0], b[0]};

    }

    /*Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.*/
    public static int[] front11(int[] a, int[] b) {
        if(a.length > 0){
            if(b.length > 0){
                return new int[]{a[0], b[0]};
            }
            return new int[]{a[0]};
        }

        if(b.length > 0){
            return new int[]{ b[0]};
        }
        return new int[0];

    }



}
