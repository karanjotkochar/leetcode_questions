import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/majority-element/description/
public class q_169_Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

//        majorityElement(nums);
//        System.out.println(majorityElement(nums));
//        System.out.println(majorityElement2(nums));
        System.out.println(majorityElement3(nums));
    }

    public static int majorityElement(int[] nums) {

        // Brute force approach, iteration
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

        // Use sorting
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

    public static int majorityElement3(int[] nums) {

        // Use HashMap
        int n = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num,0) + 1);

            if (hashMap.get(num) > n/2) {
                return num;
            }
        }

        return -1;
    }
}
