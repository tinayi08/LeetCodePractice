package PracticeAlgorithms1;

public class ShuffleTheArray {

//    Given the array nums consisting of 2n
//    elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//    Return the array in the form [x1,y1,x2,y2,...,xn,yn].


    public int[] shuffle(int[] nums, int n) {

        int [] newArray = new int[2*n];
        int k = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if(i%2==0) {
                newArray[i] = nums[j];
                j++;
            } else {
                newArray[i] = nums[n+k];
                k++;
            }

        }

        return newArray;
    }
}
