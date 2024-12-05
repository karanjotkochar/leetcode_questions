package trie_ds;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
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

}
