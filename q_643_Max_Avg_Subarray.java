//https://leetcode.com/problems/maximum-average-subarray-i/description/

import java.util.HashSet;
import java.util.Set;

public class q_643_Max_Avg_Subarray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        findMaxAverage1(nums, k);
        System.out.println(findMaxAverage1(nums, k));
    }
    public static double findMaxAverage1(int[] nums, int k) {

        // Brute force approach
        int n = nums.length;
        double max = 0.0;

        for(int i=0; i<n; i++) {

            double finalSum = 0.0;
            int count = 0;

            for(int j = i; j<i+k&&j<n; j++){
                finalSum = finalSum + nums[j];
                count++;
            }

            if(count == k){
                double avg = finalSum/k;
                max = Math.max(avg, max);
            }
        }

        return max;
    }
}
