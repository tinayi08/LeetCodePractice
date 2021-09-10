package PracticeAlgorithms1;


//        Given an array of integers nums and an integer target,
//        return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution,
//        and you may not use the same element twice.
//
//        You can return the answer in any order.

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        //<K,V>
        HashMap<Integer, Integer> map = new HashMap<>();
        //this puts all elements from the array into the hashmap
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int x = target - num;

            if (map.containsKey(x)) {
                int num2 = map.get(x);
                if (num2 == i) continue;
                return new int[] {num2, i};
            }
        }

        return null;
    }
}
