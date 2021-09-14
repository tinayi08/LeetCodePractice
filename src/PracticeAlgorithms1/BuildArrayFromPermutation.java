package PracticeAlgorithms1;

//    Given a zero-based permutation nums (0-indexed),
//    build an array ans of the same length where
//    ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//
//    A zero-based permutation nums is an array of distinct
//    integers from 0 to nums.length - 1 (inclusive).

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.EnumSet;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        BuildArrayFromPermutation main = new BuildArrayFromPermutation();
        int[] nums = {0, 2, 1, 5, 3, 4};
        main.buildArray(nums);
    }
    public int[] buildArray(int[] nums) {
        int x = 0;
        int n = nums.length;
        int[]ans = new int[n];
        while (x < n) {
            ans[x] = nums[nums[x]];
            x++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("ans at " + i + " is " + ans[i]);
        }
        return ans;
    }
}
