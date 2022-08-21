import java.util.Arrays;

public class DayFourAssignments {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};

        swap(arr1,2,3);
        reverseOp(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(buildArray(new int[]{5, 0, 1, 2, 3, 4})));
        System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));

        System.out.println(Arrays.toString(getConcatenation(new int[]{1,3,2,1})));
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));

        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));


        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1},4)));


        System.out.println(Arrays.toString(shuffle(new int[]{1,1,2,2},2)));


    }


    // 1. Swap 2 nums in an array


    static void swap(int[] arr,int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // 2. Reverse an array

    // Approach 1 - Reverse traversal;
    static int[] reverse1(int[] arr){
        int[] copy = new int[arr.length];

        for (int i =0; i < arr.length; i++) {
            copy[(arr.length-1) - (i)] = arr[i];
        }
        return copy;
    }

    // Approach 2 - Two Pointer method :- Here we utilize swap method to reverse. Thereby reducing the no. of traversals to half.
    static void reverseOp(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }


    // Leetcode problems
    // 1920. Build Array from Permutation

    static  int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len ; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }

    // 1929. Concatenation of Array

    static int[] getConcatenation(int[] nums) {
        // 1,2,3,4 1,2,3,4
        int len = nums.length;
        int[] res = new int[len*2];
        for (int i = 0; i < len; i++) {
            res[i] = res[len+i] = nums[i];
        }
        return  res;
    }


    // 1480. Running Sum of 1d Array

    static int[] runningSum(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
                sum += nums[i];
                nums[i] = sum;
        }
        return nums;
    }

    // 1672. Richest Customer Wealth

    /*
    * [
    *   [1,2,3],
    *   [1,12],
    *   [2,12,2,3]
    * ]
    * */
    static int maximumWealth(int[][] accounts) {
        int len = accounts.length;
        int max = 0;
        for (int rowIdx = 0; rowIdx < len; rowIdx++) {
            int rowLen = accounts[rowIdx].length;
            int sum = 0;
            for (int colIdx = 0; colIdx < rowLen; colIdx++) {
                sum += accounts[rowIdx][colIdx];
            }
            max = sum > max ? sum : max;
        }
        return max;
    }



    // Leetcode 1470. Shuffle the Array
    // Sample Input [2,5,1,3,4,7] ,n=3
    static int[] shuffle(int[] numbers, int n) {
        int len = numbers.length;
        int[] shuffled = new int[len];
        int s = 0;
        for (int i = 0; i < len / 2; i++) {
            shuffled[s] = numbers[i];
            shuffled[s+1] = numbers[n];
            n++;
            s+=2;
        }
        return shuffled;
    }
}
