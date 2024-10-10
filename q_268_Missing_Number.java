import java.util.Arrays;

public class q_268_Missing_Number {
    public static void main(String[] args) {
        // https://leetcode.com/problems/missing-number/description/
//        missingNumber1();
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


}
