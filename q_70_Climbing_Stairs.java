//https://leetcode.com/problems/climbing-stairs/description/

import java.util.Arrays;

public class q_70_Climbing_Stairs {
    public static void main(String[] args) {
        int n=4;
//        climbStairs(n);
//        System.out.println(climbStairs(n));
//        System.out.println(climbStairs2(n));
        System.out.println(climbStairs3(n));
    }
    public static int climbStairs(int n) {

        // Recursion solution
        if ( n == 0 || n == 1 ) {
            return 1;
        }

        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static int climbStairs2(int n) {

        // DP approach // Memoization: Top down
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);

        if (  n == 0 || n == 1 )
            return 1;

        if (memo[n] != -1)
            return memo[n];

        memo[n] = climbStairs2(n-1) + climbStairs2(n-2);

        return memo[n];
    }

    public static int climbStairs3(int n) {

        // DP approach // Tabulation: Bottom up
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];

        }
        return dp[n];
    }
}
