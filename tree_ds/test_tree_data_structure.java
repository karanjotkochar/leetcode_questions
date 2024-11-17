package tree_ds;
class Node2 {
    int data;
    Node2 first_child;
    Node2 second_child;
    Node2 third_child;
    Node2 fourth_child;
    public Node2(int data) {
        this.data = data;
        this.first_child = null;
        this.second_child = null;
        this.third_child = null;
        this.fourth_child = null;

    }
}
public class test_tree_data_structure {
    public static void main(String[] args) {
        int N = 7;

        Node2 root = new Node2(1);
        root.first_child = new Node2(2);
        root.second_child = new Node2(3);
        root.third_child = new Node2(4);

        root.first_child.first_child = new Node2(5);
        root.first_child.second_child = new Node2(6);

        root.second_child.first_child = new Node2(7);

        System.out.println("Tree structure:");
        printTree(root, "");
    }

    public static void printTree(Node2 node, String indent) {
        if (node == null) {
            return;
        }

        // Print the current node
        System.out.println(indent + "Node: " + node.data);

        // Recursively print children
        printTree(node.first_child, indent + "  ");
        printTree(node.second_child, indent + "  ");
        printTree(node.third_child, indent + "  ");
        printTree(node.fourth_child, indent + "  ");
    }
}
