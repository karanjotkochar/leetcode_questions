// https://leetcode.com/problems/binary-search/description/

public class q_704_Binary_Search {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

//        search(nums, target);
//        System.out.println(search2(nums, target));
        System.out.println(search3(nums, target));

    }

    public static int search(int[] nums, int target) {

        // Brute force approach // Linear search
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if (nums[i] == target)
                return i;
        }

        return -1;
    }

    public static int search2(int[] nums, int target) {

        // Binary search tree - iterative
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high-low)/2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int search3(int[] nums, int target) {

        // Binary search tree - recursive
        int low = 0;
        int high = nums.length - 1;

        return recursiveBST(nums, low, high, target);

    }

    private static int recursiveBST(int[] nums, int low, int high, int target) {

        if (low <= high) {
            int mid = low + (high-low)/2;

            if (nums[mid] == target)
                return mid;

            if (nums[mid] < target) {
                return recursiveBST(nums, mid +1, high, target);
            }

            else {
                return recursiveBST(nums, low, mid - 1, target);
            }

        }

        return -1;
    }


}
