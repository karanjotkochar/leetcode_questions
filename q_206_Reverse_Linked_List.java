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

        System.out.print("Given LL: ");
        printLL(listNode2);

        System.out.println();
        listNode2 = reverseList(listNode2);
        listNode2 = reverseList2(listNode2);

        System.out.print("Reverse LL: ");
        printLL(listNode2);
    }
        public static ListNode2 reverseList(ListNode2 head) {

        // Iterative solution
        ListNode2 prev = null;
        ListNode2 current = head;
        ListNode2 temp;

        while (current != null) {
            temp = current.next;
            current.next = prev;

            prev = current;
            current = temp;

        }
        return prev;
    }

    public static ListNode2 reverseList2(ListNode2 head) {

        // Recursive solution
        // TO DO: implement recursive solution

        return head;
    }
    public static void printLL(ListNode2 head) {

        while (head != null) {
            System.out.print(" " + head.val);
            head = head.next;
        }
    }

}
