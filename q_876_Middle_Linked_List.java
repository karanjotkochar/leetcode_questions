// https://leetcode.com/problems/middle-of-the-linked-list/description/
class ListNode5 {
    int val;
    ListNode5 next;
    ListNode5() {}
    ListNode5(int val) {
        this.val = val;
    }
    ListNode5(int val, ListNode5 next) {
        this.val = val;
        this.next = next;
    }
}
public class q_876_Middle_Linked_List {
    public static void main(String[] args) {

        ListNode5 listNode = new ListNode5(1);
        listNode.next = new ListNode5(2);
        listNode.next.next = new ListNode5(3);
        listNode.next.next.next = new ListNode5(4);
        listNode.next.next.next.next = new ListNode5(5);

//        ListNode5 solution = middleNode(listNode);
//        printLL(solution);

        ListNode5 solution2 = middleNode2(listNode);
        printLL(solution2);

    }
    public static ListNode5 middleNode(ListNode5 head) {

        // Brute force approach
        ListNode5 tempHead = head;
        int length = 0;
        int middle = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        middle = length/2;

        while (middle > 0) {
            tempHead = tempHead.next;
            middle--;
        }

        return tempHead;
    }
    public static ListNode5 middleNode2(ListNode5 head) {

        // Two Pointer approach
        ListNode5 slow = head;
        ListNode5 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void printLL(ListNode5 head) {

        while (head != null) {
            System.out.print(" " + head.val);
            head = head.next;
        }
    }
}
