// https://leetcode.com/problems/palindrome-linked-list/description/

class ListNode7 {
    int val;
    ListNode7 next;
    ListNode7() {}
    ListNode7(int val) {
        this.val = val;
    }
    ListNode7(int val, ListNode7 next) {
        this.val = val;
        this.next = next;
    }
}
public class q_234_Palindrome_Linked_List {
    public static void main(String[] args) {

        ListNode7 listNode = new ListNode7(1);
        listNode.next = new ListNode7(2);
        listNode.next.next = new ListNode7(2);
        listNode.next.next.next = new ListNode7(1);

        isPalindrome(listNode);
        System.out.println(isPalindrome(listNode));
//        printLL(listNode);

    }
    public static boolean isPalindrome(ListNode7 head) {

        // Two pointer approach
        ListNode7 slow = head;
        ListNode7 fast = head;

        if (head == null || head.next == null)
            return true;

        // Traverse to middle of the Linked List
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow.next is the head of second Linked List
        // Reverse second Linked list
        ListNode7 head2 = reverseLL(slow.next);

        // 2 separate Linked List
        slow.next = null;

        boolean returnIdentical = isIdentical(head, head2);

        // reverse second Linked List
        head2 = reverseLL(head2);

        // Merge back Linked Lists
        slow.next = head2;

        return returnIdentical;
    }

    public static ListNode7 reverseLL(ListNode7 head) {
        ListNode7 current = head;
        ListNode7 previous = null;
        ListNode7 temp;

        while (current != null) {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }

    public static boolean isIdentical(ListNode7 head, ListNode7 head2){

        while (head != null && head2 != null) {
            if (head.val != head2.val)
                return false;

            head = head.next;
            head2 = head2.next;
        }

        return true;
    }

    public static void printLL(ListNode7 head) {

        while (head != null) {
            System.out.print(" " + head.val);
            head = head.next;
        }
    }

}
