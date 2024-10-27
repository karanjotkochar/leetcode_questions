import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/linked-list-cycle/description/
class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) {
        val = x;
        next = null;
    }
}
public class q_141_Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode3 listNode3 = new ListNode3(3);
        listNode3.next = new ListNode3(2);
        listNode3.next.next = new ListNode3(0);
        listNode3.next.next.next = new ListNode3(-4);
        listNode3.next.next.next.next = new ListNode3(2);

//        hasCycle(listNode3);
        hasCycle2(listNode3);
        System.out.println(hasCycle(listNode3));
        System.out.println(hasCycle2(listNode3));
//        printLL(listNode3);
//        System.out.println();
//        printLL2(listNode3);

    }
    public static boolean hasCycle(ListNode3 head) {

        // Use HashSet
        Set<Object> set = new HashSet<>();

        while(head != null) {

            if (set.contains(head))
                return true;
            else
                set.add(head);

            head = head.next;
        }

        return false;
    }

    public static boolean hasCycle2(ListNode3 head) {

        // Use Fast & Slow Pointer approach
        ListNode3 slow = head;
        ListNode3 fast = head;

        // fast.next != null check because fast.next.next can cause Null Pointer exception
        // slow.next != null not required as it moves only one step, and we have fast.next
        while (slow != null && fast != null && fast.next != null && slow.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // both slow and fast pointers are at same position
                return true;
            }
        }
        return false;
    }

    public static void printLL(ListNode3 head) {

        // Print LL value
        while (head != null) {
            System.out.print(" " + head.val);
            head = head.next;
        }
    }

    public static void printLL2(ListNode3 head) {

        // Print LL next pointers
        while (head != null) {
            System.out.print(" " + head.next.toString());
            head = head.next;
        }
    }


}
