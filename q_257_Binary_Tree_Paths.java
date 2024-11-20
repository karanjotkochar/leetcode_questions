// https://leetcode.com/problems/binary-tree-paths/description/

import java.util.List;

public class q_257_Binary_Tree_Paths {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);

        binaryTreePaths(root);
    }

    public static List<String> binaryTreePaths(BinaryTreeNode root) {


        return null;
    }
}
