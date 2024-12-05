package trie_ds;

public class Trie {
    public Trie[] child;
    public boolean wordEnd;
    public Trie() {
        wordEnd = false;
        // represent nodes of the English alphabet
        child = new Trie[26];
    }
}
