public class test_Recursion {
    public static void main(String[] args) {
        int n = 5;
//        recursiveFunction1(n);
//        System.out.println(recursiveFunction1(n));

        recursiveFunction2(n);
        System.out.println(recursiveFunction2(n));
    }

    public static int recursiveFunction1(int n) {
        // Sum of n digits
        if (n==0){
            return 0;
        }

        return n + recursiveFunction1(n-1);
    }

    public static int recursiveFunction2(int n) {
        // Factorial
        if (n==0)
            return 1;

        return n * recursiveFunction2(n-1);
    }
}
