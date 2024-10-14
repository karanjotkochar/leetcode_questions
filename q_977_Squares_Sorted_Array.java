//https://leetcode.com/problems/squares-of-a-sorted-array/description/

import java.util.Arrays;

public class q_977_Squares_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
//        sortedSquares1(nums);
//        sortedSquares2(nums);
    }

    public static int[] sortedSquares1(int[] nums) {

        // Brute force approach
        int n = nums.length;
        for (int i=0; i<n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }

    public static int[] sortedSquares2(int[] nums) {

        // Two pointer approach
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] result = new int[n];

        for (int i = n-1; i>=0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }

}
