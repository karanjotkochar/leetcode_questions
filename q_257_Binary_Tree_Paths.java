// https://leetcode.com/problems/binary-tree-paths/description/

import java.util.ArrayList;
import java.util.List;

public class q_257_Binary_Tree_Paths {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.right = new BinaryTreeNode(5);

        binaryTreePaths(root);
    }
    public static List<String> binaryTreePaths(BinaryTreeNode root) {
        ArrayList<String> list = new ArrayList<>();

        if (root != null)
            searchBT(root, "", list);

        return list;
    }
    public static void searchBT(BinaryTreeNode root, String path, ArrayList<String> list){

        if (root.left == null && root.right == null)
            aa;

        if (root.left != null)
            aa;

        if (root.right != null)
            aa;

    }

}
