package PracticeAlgorithms1;

public class FinalValueOfVariables {

//    There is a programming language with only four operations and one variable X:
//
//            ++X and X++ increments the value of the variable X by 1.
//            --X and X-- decrements the value of the variable X by 1.
//    Initially, the value of X is 0.
//
//    Given an array of strings operations containing a list of operations,
//            return the final value of X after performing all the operations.


    public int finalValueAfterOperations(String[] operations) {
        String add = "++";


        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains(add)) {
                sum += 1;
            } else
                sum += 1;
        }
        return sum;


    }
}
