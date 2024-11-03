import java.util.List;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
class TreeNode {
    int val;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class q_637_Average_Levels_Binary_Tree {
    public static void main(String[] args) {
        TreeNode2 treeNode = new TreeNode2(3);

        averageOfLevels(treeNode);


    }

    public static List<Double> averageOfLevels(TreeNode2 root) {

        return null;
    }
}