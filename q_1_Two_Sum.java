//https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q_1_Two_Sum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
//        twoSum1(nums, target);
//        twoSum2(nums, target);
//        twoSum3(nums, target);

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

    public static int[] twoSum2(int[] nums, int target) {

        // Two Pointer Approach but alters the order due to sorting
        int left = 0;
        int right = (nums.length-1);

        Arrays.sort(nums);

        while(left < right) {
            int sum = nums[left] + nums[right];

            if(sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[] {left, right};
            }
        }

        return new int[] {};
    }

    public static boolean twoSum3(int[] nums, int target) {

        // Using HashSet, returns boolean result
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for (int num : nums) {
            set.add(num);
        }

        for(int i=0; i<n; i++) {
            int complement = target - nums[i];
            if (set.contains(complement)) {
                return true;
            }
        }
        return false;
    }

}
