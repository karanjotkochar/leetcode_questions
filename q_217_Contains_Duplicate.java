import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q_217_Contains_Duplicate {
    public static void main(String[] args) {
        // https://leetcode.com/problems/contains-duplicate/solutions/

//        containsDuplicate1();
//        containsDuplicate2();
//        containsDuplicate3();
    }
    public static boolean containsDuplicate1(int[] nums) {

        // Brute force approach, iterations over array
        for(int i=0; i<=nums.length-1; i++) {
            int number = nums[i];
            for (int j=i+1; j<=nums.length-1; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean containsDuplicate2(int[] nums) {

        // Sort Array, iteration
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicate3(int[] nums) {

        // Use HashSet
        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

}