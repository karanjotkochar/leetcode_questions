import java.util.Arrays;

// https://leetcode.com/problems/majority-element/description/
public class q_169_Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

//        majorityElement(nums);
//        System.out.println(majorityElement(nums));
        System.out.println(majorityElement2(nums));
    }

    public static int majorityElement(int[] nums) {

        // Brute force approach
        int n = nums.length;

        for (int i=0; i<n; i++) {
            int count = 0;

            for (int j=0; j<n; j++) {
                if (nums[i] == nums[j])
                    count++;
            }

            if (count > n/2)
                return nums[i];
        }
        return -1;

    }

    public static int majorityElement2(int[] nums) {

        // Sorting
        int n= nums.length;
        int count = 1;

        Arrays.sort(nums);

        // First element
        if (n==1)
            return nums[0];

        // second to second last element
        for (int i=1; i<n; i++) {
            if (nums[i-1] == nums[i]) {
                count++;

            } else {
                // If not similar, go back to last element to check count
                if (count > n/2){
                    return nums[i-1];
                }
                count = 1;
            }

        }

        // Last element
        if (count > n/2)
            return nums[n-1];

        return -1;
    }
}
