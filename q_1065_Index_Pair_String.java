//https://leetcode.com/problems/index-pairs-of-a-string/description/\

//https://github.com/doocs/leetcode/blob/main/solution/1000-1099/1065.Index%20Pairs%20of%20a%20String/README_EN.md

/*
Given a string text and an array of strings words, return an array of all index pairs [i, j]
so that the substring text[i...j] is in words.
Return the pairs [i, j] in sorted order (i.e., sort them by their first coordinate, and in case of
ties sort them by their second coordinate).

Input: text = "thestoryofleetcodeandme", words = ["story","fleet","leetcode"]
Output: [[3,7],[9,13],[10,17]]

Input: text = "ababa", words = ["aba","ab"]
Output: [[0,1],[0,2],[2,3],[2,4]]
Explanation: Notice that matches can overlap, see "aba" is found in [0,2] and [2,4].
 */

import trie_ds.Trie;

import java.util.ArrayList;
import java.util.List;

public class q_1065_Index_Pair_String {
    public static void main(String[] args) {

        String text = "thestoryofleetcodeandme";
        String[] words = {"story","fleet","leetcode"};

        indexPairs(text, words);
    }
    public static int[][] indexPairs(String text, String[] words) {
        Trie trie = new Trie();
        for (String w : words) {
            //trie.insert(w);
        }

        int n = text.length();

        List<int[]> ans = new ArrayList<>();

        for (int i=0; i<n; i++) {
            Trie node = trie;

            for (int j = i; j < n; j++) {
                int index = text.charAt(j) - 'a';
                if (node.child[index] == null) {
                    break;
                }
                node = node.child[index];
                if (node.wordEnd) {
                    ans.add(new int[] {i, j});
                }
            }
        }

        return ans.toArray(new int[ans.size()][2]);

    }
}
