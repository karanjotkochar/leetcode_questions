import java.util.List;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class q_637_Average_Levels_Binary_Tree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);

        averageOfLevels(treeNode);


    }

    public static List<Double> averageOfLevels(TreeNode root) {

        return null;
    }
}