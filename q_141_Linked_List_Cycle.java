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

        hasCycle(listNode3);
        System.out.println(hasCycle(listNode3));
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
