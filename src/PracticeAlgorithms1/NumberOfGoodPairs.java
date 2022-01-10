package PracticeAlgorithms1;

import java.util.EnumSet;

public class NumberOfGoodPairs {

//    Given an array of integers nums, return the number of good pairs.
//    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    public static void main(String[] args) {
        NumberOfGoodPairs main = new NumberOfGoodPairs();
        int[] nums = {1,2,3,1,1,3};
        main.numIdenticalPairs(nums);
    }
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length; j++) {

                if(nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;
    }
}
