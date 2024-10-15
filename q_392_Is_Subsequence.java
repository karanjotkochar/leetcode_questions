//https://leetcode.com/problems/is-subsequence/description/

public class q_392_Is_Subsequence {
    public static void main(String[] args) {
        String s = "ab";
        String t = "baab";
        isSubsequence(s,t);
        System.out.println(isSubsequence(s,t));

    }

    public static boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<tLength; i++) {
            char chT = t.charAt(i);
            for (int j=0; j<sLength; j++) {
                char chS = s.charAt(j);

                if(chS == chT){
                    sb.append(chS);
                    break;
                }

            }
        }

        return sb.toString().equals(s);
    }
}
