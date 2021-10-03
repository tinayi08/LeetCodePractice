package PracticeAlgorithms1;

public class HowManyNumbersSmaller {

//    Given the array nums, for each nums[i] find out how many numbers
//    in the array are smaller than it. That is, for each nums[i] you
//    have to count the number of valid j's such that j != i and nums[j] < nums[i].
//
//    Return the answer in an array.
    public static void main(String[] args) {

        HowManyNumbersSmaller m = new HowManyNumbersSmaller();
        int[] nums = {8,1,2,2,3};

        m.smallerNumbersThanCurrent(nums);
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int x : nums) {

                if (nums[i] > x) {
                    count++;

                }

                newArray[i] = count;
            }
        }
        return newArray;
    }
}
