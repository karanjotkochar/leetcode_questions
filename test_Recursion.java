public class test_Recursion {
    public static void main(String[] args) {
        int n=5;
        recursiveFunction1(n);
        System.out.println(recursiveFunction1(n));
    }

    public static int recursiveFunction1(int n) {
        int sum = 0;

        // Sum of n digits
        for(int i=1; i<=n; i++) {
            sum = i + recursiveFunction1(i-1);

        }
        return sum;
    }
}
