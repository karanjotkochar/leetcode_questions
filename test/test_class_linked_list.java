class Node {
    int data;
    Node next;
    public Node(int x) {
        data = x;
        next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class test_class_linked_list {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(head.toString());

        recursivePrint(head);
    }
    public static void recursivePrint(Node head) {
        if(head == null)
            return;
        System.out.print(head.data + " ");
        recursivePrint(head.next);
    }
}
