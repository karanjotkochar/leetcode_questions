//https://leetcode.com/problems/is-subsequence/description/

public class q_392_Is_Subsequence {
    public static void main(String[] args) {
//        isSubsequence(s,t);
    }

    public static boolean isSubsequence(String s, String t) {

        // Two Pointer approach
        int sPointer = 0;
        int tPointer = 0;

        while(sPointer<s.length() && tPointer<t.length()) {

            if(s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }

        return (sPointer == s.length());
    }
}
