package PracticeAlgorithms1;

//    Given an array nums. We define a running
//    sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//    Return the running sum of nums.

import java.util.EnumSet;

public class RunningSumOf1dArray {

    public static void main(String[] args) {
        RunningSumOf1dArray main = new RunningSumOf1dArray();

        int[] nums = {1,2,3,4};
        main.runningSum(nums);
    }

    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] newArray = new int[n];

        newArray[0] = nums[0];
        for (int i = 1; i < n; i++) {
            newArray[i] = newArray[i-1] + nums[i];
        }

        for (int j = 0; j < n; j++) {
            System.out.println("index " + j + " is " + newArray[j]);
        }

        return newArray;
    }

}
