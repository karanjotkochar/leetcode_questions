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
        printLL(listNode);

    }
    public static boolean isPalindrome(ListNode7 head) {

        // Brute force approach: 2 pointers
        ListNode7 slow = head;
        ListNode7 fast = head;
        int length = 0;

        while (fast.next != null){
            fast = fast.next;
            length++;
        }

        int middle = (length/2);

        while (middle > 0) {
            if (slow.val == fast.val) {
                slow = slow.next;
                fast = fast.prev;
            }
            else {
                return false;
            }

            middle--;
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
