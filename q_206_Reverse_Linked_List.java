// https://leetcode.com/problems/reverse-linked-list/description/
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) {
        this.val = val;
    }
    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}
public class q_206_Reverse_Linked_List {

    public static void main(String[] args) {
        ListNode2 listNode2 = new ListNode2(1,
                                    new ListNode2(2,
                                            new ListNode2(3,
                                                    new ListNode2(4,
                                                            new  ListNode2(5, null)))));

        reverseList(listNode2);
        printLL(listNode2);
    }
    public static ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev = null;
        ListNode2 current = head;

        while (current != null) {
            ListNode2 temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;

        }

        return prev;
    }

    public static void printLL(ListNode2 head) {
        ListNode2 current = head;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println("null");
    }
}
