package PracticeAlgorithms1;

public class RichestCustomerWealth {

//    You are given an m x n integer grid accounts where accounts[i][j] is
//    the amount of money the i-th customer has in the j-th
//    bank. Return the wealth that the richest customer has.
//
//    A customer's wealth is the amount of money they have in
//    all their bank accounts. The richest customer is the customer
//    that has the maximum wealth.


    public int maximumWealth(int[][] accounts) {
        int w = 0;
                //Integer.MAX_VALUE;
        int x = 0;
        for (int i = 0; i < accounts.length; i++) {
            int count = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                count += accounts[i][j];
                w = Math.max(count, w);
            }
        }

        return w;
    }
}
