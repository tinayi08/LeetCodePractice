package PracticeAlgorithms1;

import java.util.Arrays;

public class DecompressRunLength {

//    We are given a list nums of integers representing a list compressed with run-length encoding.
//
//    Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
//    For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate
//    all the sublists from left to right to generate the decompressed list.
//
//    Return the decompressed list.

    public int[] decompressRLElist(int[] nums) {
        int arraySize = 0;
        for (int i = 0; i < nums.length; i+=2) {
            arraySize+= nums[i];
        }

        int[] newArray = new int[arraySize];

        int start = 0;
        int f = 0;
        int v = 0;

        for (int i = 0; i < nums.length; i+=2) {
            f = nums[i];
            v = nums[i+1];
            Arrays.fill(newArray,start, start+f,v);

            start += nums[i];

        }

        return newArray;
    }
}
