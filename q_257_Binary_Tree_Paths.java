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
        List<String> paths = new ArrayList<>();

        if (root != null)
            findPaths(root,"", paths);

        System.out.println(paths);

        return paths;
    }
    public static void findPaths(BinaryTreeNode node, String path, List<String> paths) {

        // path --> empty string

        // path: A temporary variable that builds the current path from the root to the current node.
        // paths: A shared list that stores all completed paths.

        // Append current node's value to the path
        path = path + node.data;

        // If the current node is a leaf, add the path to the list
        if (node.left == null && node.right == null) {
            paths.add(path);

        } else {

            // If not a leaf, continue with the left and right children
            if (node.left != null) {
                findPaths(node.left, path + "->", paths);
            }
            if (node.right != null) {
                findPaths(node.right, path + "->", paths);

            }
        }

    }

}
