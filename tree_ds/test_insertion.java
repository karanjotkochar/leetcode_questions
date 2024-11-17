package tree_ds;

public class test_insertion {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(3);
        root.right = new BinaryTreeNode(4);
        root.left.left = new BinaryTreeNode(5);

        int key = 6;

        insertElement(root, key);
    }

    public static void insertElement(BinaryTreeNode root, int key) {


    }

}
