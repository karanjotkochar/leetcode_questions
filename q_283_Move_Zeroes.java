import java.util.ArrayList;
import java.util.List;

public class q_283_Move_Zeroes {
//    https://leetcode.com/problems/move-zeroes/description/
    public static void main(String[] args) {
        int[] nums  = {0,1,0,3,12};
        moveZeroes(nums);
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

}
