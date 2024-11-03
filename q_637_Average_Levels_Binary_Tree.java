import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        TreeNode root = null;
        // [3,9,20,null,null,15,7]
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        averageOfLevels(root);
        System.out.println(averageOfLevels(root));
    }

    public static List<Double> averageOfLevels(TreeNode root) {

        int sum = 0;
        int count = 0;
        List<Double> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            sum = 0;
            count= 0;
            Queue<TreeNode> temp = new LinkedList<TreeNode>();

            while (!queue.isEmpty()) {
                TreeNode n = queue.peek();
                queue.remove();
                sum = sum + n.val;
                count++;
                if (n.left != null)
                    temp.add(n.left);
                if (n.right != null)
                    temp.add(n.right);
            }

            queue = temp;
            list.add((sum*1.0)/count);
        }

        return list;
    }
}