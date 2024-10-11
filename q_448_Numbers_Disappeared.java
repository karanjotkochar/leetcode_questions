import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q_448_Numbers_Disappeared {
//    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

    public static void main(String[] args) {
//        findDisappearedNumbers();
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        // Brute force approach
        int n = nums.length;
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> newArray = new ArrayList<Integer>();

        for (int num : nums){
            set.add(num);
        }

        for(int i=1; i<=n; i++) {
            if(!set.contains(i)){
                newArray.add(i);
            }
        }

        return newArray;
    }

}