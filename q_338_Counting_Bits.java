// https://leetcode.com/problems/counting-bits/description/

public class q_338_Counting_Bits {
    public static void main(String[] args) {
        int n = 4;
        countBits(n); // test function
    }
    public static void countBits(int n) {

        // binary representation of a number
        for (int i=0; i<=n; i++) {

            System.out.println("Number: " + i); // print number (0 to n)

            String binary = Integer.toBinaryString(i);
            System.out.println("Binary representation: " + binary); // print numbers corresponding binary rep.
            System.out.println();
        }
    }

    public static int count(int n) {

        int count = 0;

        while (n > 0) {
            count = count + (n & 1); // Bitwise AND
            n >>= 1;                 // Right Shift
        }

        return count;
    }

    public static int recursiveCount(int n) {

        // base case
        if (n == 0)
            return 0;

        else
            return (n & 1) + recursiveCount(n >> 1);
    }
}
