package trie_ds;

public class Trie {
    Trie[] child;
    boolean wordEnd;
    public Trie() {
        wordEnd = false;
        // represent nodes of the English alphabet
        child = new Trie[26];
    }
}
