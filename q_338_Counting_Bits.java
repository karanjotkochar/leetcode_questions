// https://leetcode.com/problems/counting-bits/description/

import java.util.ArrayList;
import java.util.List;

public class q_338_Counting_Bits {
    public static void main(String[] args) {
        int n = 5;

        // test function
        // binaryRep(n);

        countBits(n);

    }
    public static void binaryRep(int n) {

        // binary representation of a number
        for (int i=0; i<=n; i++) {

            System.out.println("Number: " + i); // print number (0 to n)

            String binary = Integer.toBinaryString(i);
            System.out.println("Binary representation: " + binary); // print numbers corresponding binary rep.
            System.out.println();
        }
    }

    public static int[] countBits(int n) {

       int[] arr = new int[n+1];
        List<Integer> ls = new ArrayList<>();

        for (int i=0; i<=n; i++) {
            ls.add(count(i));
            //ls.add(recursiveCount(i));
        }

        System.out.println(ls);

        return arr;
    }
    public static int count(int n) {
        int count = 0;

        while (n > 0) {
            count = count + (n & 1);  // Bitwise AND
            n >>= 1;                  // Right Shift
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
