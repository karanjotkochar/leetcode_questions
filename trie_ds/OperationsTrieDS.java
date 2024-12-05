package trie_ds;

import java.util.Arrays;
import java.util.List;

public class OperationsTrieDS {
    public static void main(String[] args) {

        // Create a sample Trie
        Trie root = new Trie();
        List<String> list = Arrays.asList("and", "ant");
        for (String s : list) {
            insertKey(root, s);
        }

        //Search in a Trie
        List<String> search = Arrays.asList("and", "an", "do");
        for (String s : search) {
            if (searchKey(root, s))
                System.out.println("Present");
            else
                System.out.println("Not Present");
        }
    }

    public static void insertKey(Trie root, String key) {

        // root node = current pointer initialize
        Trie curr = root;

        // iterate over the length of the string
        for (char c : key.toCharArray()) {

            // if node exists for that char in the trie
            if (curr.child[c - 'a'] == null) {
                Trie newNode = new Trie();
                curr.child[c - 'a'] = newNode;
            }

            // move the curr pointer to the new node
            curr = curr.child[c - 'a'];

        }

        // marks the end of the word
        curr.wordEnd = true;

    }

    public static boolean searchKey(Trie root, String key) {

        // root node = current pointer initialize
        Trie curr = root;

        // iterate over the length of the string
        for (char c : key.toCharArray()) {

            // check if node exists for the current character
            if (curr.child[c - 'a'] == null)
                return false;

            // Move the pointer to existing node for the current character
            curr = curr.child[c - 'a'];
        }

        // return true: if word exists and wordEnd is true
        return curr.wordEnd;
    }

}
