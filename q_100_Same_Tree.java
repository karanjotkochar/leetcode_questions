// https://leetcode.com/problems/same-tree/description/

class TreeNode3 {
    int val;
    TreeNode3 left;
    TreeNode3 right;
    TreeNode3() {};
    TreeNode3(int val) {
        this.val = val;
    }
    TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
public class q_100_Same_Tree {
    public static void main(String[] args) {
        TreeNode3 p = null;
        p = new TreeNode3(1);
        p.left = new TreeNode3(2);
        p.right = new TreeNode3(3);

        TreeNode3 q = null;
        q = new TreeNode3(1);
        q.left = new TreeNode3(2);
        q.right = new TreeNode3(3);

        Boolean val = isSameTree(p, q);
        System.out.println(val);

    }

    public static boolean isSameTree(TreeNode3 p, TreeNode3 q) {

        // Recursive solution: DFS
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.val == q.val && (isSameTree(p.left, q.left)) && isSameTree(p.right, q.right))
            return true;

    return false;
    }
}
