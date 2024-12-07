// https://leetcode.com/problems/counting-bits/description/

public class q_338_Counting_Bits {

    public static void main(String[] args) {
        int n = 4;
        countBits(n);
    }
    public static int[] countBits(int n) {

        int len = n + 1;
        int[] ansArr = new int[len + 1];

        // binary representation of a number
        for (int i=0; i<=n; i++) {

            System.out.println(i);
            // String binary = Integer.toBinaryString(i);
            // System.out.println(binary);
            System.out.println(recursiveCount(i));
            System.out.println();
        }

        return null;
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
