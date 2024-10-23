//https://leetcode.com/problems/climbing-stairs/description/

import java.util.Arrays;

public class q_70_Climbing_Stairs {
    public static void main(String[] args) {
        int n=4;
//        climbStairs(n);
//        System.out.println(climbStairs(n));
        System.out.println(climbStairs2(n));
    }
    public static int climbStairs(int n) {

        // Recursion solution
        if ( n == 0 || n == 1 ) {
            return 1;
        }

        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static int climbStairs2(int n) {

        // DP approach // Memoization
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);

        if (  n == 0 || n == 1 )
            return 1;

        if (memo[n] != -1)
            return memo[n];

        memo[n] = climbStairs2(n-1) + climbStairs2(n-2);

        return memo[n];
    }
}
