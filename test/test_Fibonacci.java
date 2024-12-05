import java.util.Arrays;

public class test_Fibonacci {
    public static void main(String[] args) {
        int n = 5;
//        fibbonaciNth(n);
//        System.out.println(fibbonaciNth(n));

//        fibbonaciNth2(n);
//        System.out.println(fibbonaciNth2(n));

        fibbonaciNth3(n);
        System.out.println(fibbonaciNth3(n));
    }

    public static int fibbonaciNth(int n) {

        // Recursion solution
        if((n==0) || (n==1)) {
            return n;
        }
        else
            return (fibbonaciNth(n-1) + fibbonaciNth(n-2));
    }

    public static int fibbonaciNth2(int n) {

        // Dynamic programming approach // Memoization
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);

        if(n <= 1)
            return n;

        if(memo[n] != -1)
            return memo[n];

        memo[n] = fibbonaciNth(n-1) + fibbonaciNth(n-2);

        return memo[n];
    }

    public static int fibbonaciNth3(int n) {

        // Dynamic programming approach // Tablulation
        if (n <= 1)
            return n;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];




    }


}


