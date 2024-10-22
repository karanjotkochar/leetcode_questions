import java.util.Arrays;
public class test {
}
class GfG {

     static int nthFibonacciUtil(int n, int[] memo) {
          if (n <= 1) {
               return n;
          }
          if (memo[n] != -1) {
               return memo[n];
          }

          memo[n] = nthFibonacciUtil(n - 1, memo) + nthFibonacciUtil(n - 2, memo);
          return memo[n];
     }

          static int nthFibonacci(int n) {

          int[] memo = new int[n + 1];
          Arrays.fill(memo, -1);

          return nthFibonacciUtil(n, memo);
     }

     public static void main(String[] args) {
          int n = 5;
          int result = nthFibonacci(n);
          System.out.println(result);
     }
}
