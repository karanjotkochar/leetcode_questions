//https://leetcode.com/problems/backspace-string-compare/description/

public class q_844_Backspace_String_Compare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        backspaceCompare(s,t);
    }

    public static boolean backspaceCompare(String s, String t) {

        // brute force approach
        s = temp(s);
        t = temp(t);
        return s.equals(t);
    }

    public static String temp(String k) {
        int n = k.length();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            char ch = k.charAt(i);
            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }
}
