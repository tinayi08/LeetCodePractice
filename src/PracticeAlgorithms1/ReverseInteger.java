package PracticeAlgorithms1;

public class ReverseInteger {

//    Given a signed 32-bit integer x, return x with its digits reversed.
//    If reversing x causes the value to go outside the signed 32-bit integer range
//    [-231, 231 - 1], then return 0.
    public static void main(String[] args) {
        ReverseInteger main = new ReverseInteger();
        int b = 432%10;
        System.out.println("b " + b);
        int a = main.reverse(432);
        System.out.println(a);


    }
    public int reverse(int x) {

        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x/10;
        }

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return 0;

        return (int)result;
    }
}
