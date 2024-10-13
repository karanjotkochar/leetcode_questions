import java.util.ArrayList;
import java.util.List;

public class q_283_Move_Zeroes {
//    https://leetcode.com/problems/move-zeroes/description/
    public static void main(String[] args) {
//        moveZeroes();
//        moveZeroes2();
    }
    public static void moveZeroes(int[] nums) {

        // Brute force approach
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for(int num : nums) {
            if (num != 0){
                result.add(num);
            }
        }
        while (result.size() < n) {
            result.add(0);
        }

        System.out.println(result);
    }

    public static void moveZeroes2(int[] nums) {

        // Two Pointer approach
        int j = 0;
        int temp = 0;
        int n = nums.length;

        for(int i=0; i<n; i++) {
            if(nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }

}
