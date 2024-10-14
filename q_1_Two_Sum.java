//https://leetcode.com/problems/two-sum/description/

public class q_1_Two_Sum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        twoSum1(nums, target);
    }

    public static int[] twoSum1(int[] nums, int target) {

        // Brute force approach
        int[] finalArray = new int[2];
        int n = nums.length;

        for (int i=0; i<n; i++) {
           for (int j=i+1; j<n; j++) {
               if(nums[i] + nums[j] == target) {
                   finalArray[0] = i;
                   finalArray[1] = j;
                   return finalArray;
               }
           }
        }

        return finalArray;
    }
}
