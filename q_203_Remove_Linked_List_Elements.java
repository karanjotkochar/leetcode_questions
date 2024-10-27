// https://leetcode.com/problems/remove-linked-list-elements/description/

class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4() {}
    ListNode4(int val) {
        this.val = val;
    }
    ListNode4(int val, ListNode4 next) {
        this.val = val;
        this.next = next;
    }
}

public class q_203_Remove_Linked_List_Elements {
    public static void main(String[] args) {

        int val = 6;

        ListNode4 listNode = new ListNode4(1);
        listNode.next = new ListNode4(2);
        listNode.next.next = new ListNode4(6);
        listNode.next.next.next = new ListNode4(3);
        listNode.next.next.next.next = new ListNode4(4);
        listNode.next.next.next.next.next = new ListNode4(5);
        listNode.next.next.next.next.next.next = new ListNode4(6);

        System.out.println("Given LL: ");
        printLL(listNode);

        ListNode4 newHead = removeElements(listNode, val);

        System.out.println("\nNew LL: ");
        printLL(newHead);

    }
    public static ListNode4 removeElements(ListNode4 head, int val) {

        // Brute force approach: Iteration

        // Edge case, check first element
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode4 current = head;

        while (current != null && current.next != null) {

            if (current.next.val == val)
                current.next = current.next.next;

            else
                current = current.next;
        }

        return head;
    }

    public static void printLL(ListNode4 head) {

        while (head != null) {
            System.out.print(" " + head.val);
            head = head.next;
        }
    }
}
