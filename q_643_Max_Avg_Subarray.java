//https://leetcode.com/problems/maximum-average-subarray-i/description/

public class q_643_Max_Avg_Subarray {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 1;
//        findMaxAverage1(nums, k);
//        findMaxAverage2(nums, k);
        findMaxAverage3(nums,k);
        System.out.println(findMaxAverage3(nums, k));
    }
    public static double findMaxAverage1(int[] nums, int k) {

        // Brute force approach
        int n = nums.length;
        double max = 0.0;

        for(int i=0; i<n; i++) {

            double finalSum = 0.0;
            int count = 0;

            for(int j = i; j<i+k && j<n; j++){
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

    public static double findMaxAverage2(int[] nums, int k) {
        int n = nums.length;
        double max = Integer.MIN_VALUE;

        if (n == 1) {
            max = Double.valueOf(nums[0]);
        } else {
            for (int i = 0; i <= n - k; i++) {
                double s = 0;
                for (int j = i; j <= i + k - 1; j++) {
                    s += nums[j];
                }
                max = Math.max(max, s);
            }
        }
        return max / k;
    }

    public static double findMaxAverage3(int[] nums, int k) {

        // Sliding window algorithm
        int n = nums.length;
        double max = Integer.MIN_VALUE;
        double sum = 0;

        int leftPointer = 0;
        int rightPointer = 0;

        while (leftPointer + k <= n) {

            while (rightPointer-leftPointer < k) {

                sum = sum + nums[rightPointer];
                rightPointer++;
            }

            max = Math.max(max, sum);
            sum = sum - nums[leftPointer];
            leftPointer++;
        }

        return (max/n);
    }
}
