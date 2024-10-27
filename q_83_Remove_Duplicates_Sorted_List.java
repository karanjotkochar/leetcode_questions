// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
class ListNode6 {
    int val;
    ListNode6 next;
    ListNode6() {}
    ListNode6(int val) {
        this.val = val;
    }
    ListNode6(int val, ListNode6 next) {
        this.val = val;
        this.next = next;
    }
}
public class q_83_Remove_Duplicates_Sorted_List {
    public static void main(String[] args) {

        ListNode6 listNode = new ListNode6(1);
        listNode.next = new ListNode6(1);
        listNode.next.next = new ListNode6(2);
        listNode.next.next.next = new ListNode6(3);
        listNode.next.next.next.next = new ListNode6(3);

//        deleteDuplicates(listNode);
        printLL(listNode);

    }

    public static ListNode6 deleteDuplicates(ListNode6 head) {

        return head;
    }

    public static void printLL(ListNode6 head) {

        while (head != null) {
            System.out.print(" " + head.val);
            head = head.next;
        }
    }
}
