//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class q_744_Smallest_Letter_Greater_Target {
    public static void main(String[] args) {
       char[] letters = {'c', 'f', 'j'};
       char target = 'a';

//       nextGreatestLetter(letters, target);
       System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        // Binary search
        int n = letters.length;
        int low = 0;
        int high = n - 1;

        int ans = -1;

        // Array is in Ascending order,
        // If target greater than highest char, then target not present, thus first char
        if (target >= letters[n-1]) {
            return letters[0];
        }

        while (low <= high) {

            int mid = (high + low) / 2;

            if (letters[mid] <= target) {
                low = mid + 1;

            } else {
                high = mid - 1;
                ans = mid;
            }
        }

        return letters[ans];
    }
}
