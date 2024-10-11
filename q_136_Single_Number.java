public class q_136_Single_Number {

//    https://leetcode.com/problems/single-number/description/

    public static void main(String[] args) {
//        singleNumber();
    }

    public static int singleNumber(int[] nums) {

        // Using XOR gate, Bit Manipulation
        int doXOR = 0;

        for (int num : nums) {
            doXOR = doXOR ^ num;
        }

        return doXOR;
    }
}
