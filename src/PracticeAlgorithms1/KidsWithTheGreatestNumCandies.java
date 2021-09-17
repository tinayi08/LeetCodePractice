package PracticeAlgorithms1;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumCandies {


//
//    There are n kids with candies. You are given an integer array candies,
//    where each candies[i] represents the number of candies the ith kid
//    has, and an integer extraCandies, denoting the number of extra
//    candies that you have.
//
//    Return a boolean array result of length n, where result[i]
//    is true if, after giving the ith kid all the extraCandies,
//    they will have the greatest number of candies among all the kids,
//    or false otherwise.
//
//    Note that multiple kids can have the greatest number of candies.

    public static void main(String[] args) {
        KidsWithTheGreatestNumCandies main = new KidsWithTheGreatestNumCandies();
        int [] candies = {12,1,12};
        main.kidsWithCandies(candies, 10);
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int kids = candies.length;
        //int valid = kids + extraCandies;
        List<Boolean> list = new ArrayList<Boolean>();

        int max = candies[0];
        for(int i = 0; i < candies.length; i++){
            if(max < candies[i])

                max = candies[i];

        }

        for (int j = 0; j < candies.length; j++) {
            int x = candies[j] + extraCandies;
            if (x >= max) {
                list.add(j, true);
            } else {
                list.add(j,false);
            }
        }

        return list;
    }

}
