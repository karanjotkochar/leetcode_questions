import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/path-sum/description/
class TreeNode4 {
    int val;
    TreeNode4 left;
    TreeNode4 right;
    TreeNode4() {}
    TreeNode4(int val) {
        this.val = val;
    }
    TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class q_112_Path_Sum {
    public static void main(String[] args) {

        TreeNode4 root = null;
        root = new TreeNode4(5);
        root.left = new TreeNode4(4);
        root.right = new TreeNode4(8);
        root.left.left = new TreeNode4(11);
        root.left.left.left = new TreeNode4(7);
        root.left.left.right = new TreeNode4(2);
        root.right.left = new TreeNode4(13);
        root.right.right = new TreeNode4(4);
        root.right.right.right = new TreeNode4(1);

        int targetSum = 22;
        boolean val = hasPathSum(root, targetSum);
        System.out.println(val);

        printRootLeafNodePath(root);
    }

    public static boolean hasPathSum(TreeNode4 root, int targetSum) {

        boolean left = false;
        boolean right = false;

        // Empty tree --> false
        if (root == null)
            return false;

        // with every iteration reduce value
        int subSum = targetSum - root.val;

        // if val == 0 and leaf node --> true
        if (subSum == 0 && root.left == null && root.right == null)
            return true;

        // iterate left or roght
        if (root.left != null)
            left = hasPathSum(root.left, subSum);
        if (root.right != null)
            right = hasPathSum(root.right, subSum);

        return left || right;

    }

    public static void printRootLeafNodePath(TreeNode4 root) {

        if (root == null) {
            System.out.println("root == null");
            return;
        }

//        System.out.println("aa");

        printRootLeafNodePath(root.left);
        System.out.println("bb");
        if (root.left == null)
            System.out.println("null");
        if (root.left != null)
            System.out.println(root.left.val);


    }
}
