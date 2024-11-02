// https://leetcode.com/problems/majority-element/description/
public class q_169_Majority_Element {
    public static void main(String[] args) {
        int[] num = {2,2,1,1,1,2,2};

        majorityElement(num);
        System.out.println(majorityElement(num));
    }

    public static int majorityElement(int[] num) {

        // Brute force approach
        int n = num.length;

        for (int i=0; i<n; i++) {
            int count = 0;

            for (int j=0; j<n; j++) {
                if (num[i] == num[j])
                    count++;
            }

            if (count > n/2)
                return num[i];
        }
        return -1;

    }
}
