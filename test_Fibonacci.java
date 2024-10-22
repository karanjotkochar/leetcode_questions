import java.util.Arrays;

public class test_Fibonacci {
    public static void main(String[] args) {
        int n = 5;
//        fibbonaciNth(n);
//        System.out.println(fibbonaciNth(n));

        fibbonaciNth2(n);
        System.out.println(fibbonaciNth2(n));
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

        // Dynamic programming approach
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);

        if(n <= 1)
            return n;

        if(memo[n] != -1)
            return memo[n];

        memo[n] = fibbonaciNth(n-1) + fibbonaciNth(n-2);

        return memo[n];
    }


}


