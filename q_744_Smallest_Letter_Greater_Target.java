//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class q_744_Smallest_Letter_Greater_Target {
    public static void main(String[] args) {
       char[] letters = {'c', 'f', 'j'};
       char target = 'a';

       nextGreatestLetter(letters, target);
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int low = 0;
        int high = letters.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(letters[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return letters[0];
    }
}
