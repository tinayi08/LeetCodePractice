package PracticeAlgorithms1;

//        Given an array of integers nums which is sorted in ascending order,
//        and an integer target, write a function to search target in nums.
//        If target exists, then return its index. Otherwise, return -1.
//
//        You must write an algorithm with O(log n) runtime complexity.

public class BinarySearch {

    public int search(int[] nums, int target) {

        int middle;
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            middle = left + (right - left)/2; // middle == 2;
            if (nums[middle] == target) { // if nums[2] == target then return index
                return middle;
            }
            if (target < nums[middle]) { // if target is less than middle
                right = middle -1;      // now we just use 1st half
            } else
                left = middle +1; // if target is more than middle
        }                           //we just use 2nd half
        return -1;
    }
}
