import java.util.Arrays;

public class q_268_Missing_Number {

//    https://leetcode.com/problems/missing-number/description/
    public static void main(String[] args) {
//        missingNumber1();
//        missingNumber2();
    }
    public static int missingNumber1(int[] nums) {

        // Brute force approach, addition
        int sum = 0;
        int actualSum = 0;
        int n = nums.length;

        for(int i=0; i<n; i++) {
            sum = sum + nums[i];
        }

        actualSum = (((n)*(n+1))/2);

        return (actualSum - sum);

    }

    public static int missingNumber2(int[] nums) {

        // Using XOR gate, Bit Manipulation
        int allXOR = 0;

        // XOR of all numbers in [0,n]
        for (int i=0; i<=nums.length; i++) {
            allXOR = allXOR ^ i;
        }

        // XOR of all numbers in the given array
        for (int num : nums) {
            allXOR = allXOR ^ num;
        }

        // The XOR operation returns the missing number
        return allXOR;
    }


}
