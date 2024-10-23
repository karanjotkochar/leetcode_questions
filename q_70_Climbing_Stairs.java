//https://leetcode.com/problems/climbing-stairs/description/

public class q_70_Climbing_Stairs {
    public static void main(String[] args) {
        int n=4;
        climbStairs(n);
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {

        // Recursion solution
        if ( n == 0 || n == 1 ) {
            return 1;
        }

        return climbStairs(n-1) + climbStairs(n-2);
    }
}
