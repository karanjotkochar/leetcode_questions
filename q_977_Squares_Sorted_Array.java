//https://leetcode.com/problems/squares-of-a-sorted-array/description/

import java.util.Arrays;

public class q_977_Squares_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }

    public static int[] sortedSquares(int[] nums) {

        // Brute force approach
        int n = nums.length;
        for (int i=0; i<n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }

}
