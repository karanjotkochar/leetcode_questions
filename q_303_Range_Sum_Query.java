// https://leetcode.com/problems/range-sum-query-immutable/description/

class NumsArray {
    private int[] arr;

    public NumsArray(int[] nums) {
        this.arr = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for(int i = left; i<=right; i++)
            sum = sum + this.arr[i];

        return sum;
    }

}

class NumArray2 {
    private int[] sum;
    public NumArray2(int[] nums2) {
        int n = nums2.length;

        sum = new int[n + 1];

        // prefix sum array: new array -- has aggregated sums
        for (int i = 0; i < n; ++i) {
            sum[i + 1] = sum[i] + nums2[i];
        }
    }

    public int sumRange2(int left, int right) {
        return sum[right + 1] - sum[left];
    }
}

public class q_303_Range_Sum_Query {

    // Prefix sum example:
    // make a function to calculates sums for index: n
    // logic: calculate for [left, right] as [right + 1] - [left]

    public static void main(String[] args) {

        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumsArray numArray = new NumsArray(nums);

        // Testing sumRange
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));

        // via prefix sum
        int[] nums2 = {-2, 0, 3, -5, 2, -1};
        NumArray2 numArray2 = new NumArray2(nums2);

        // Testing sumRange
        System.out.println(numArray2.sumRange2(0, 2));
        System.out.println(numArray2.sumRange2(2, 5));
    }

}
