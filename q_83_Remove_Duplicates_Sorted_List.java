import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        ListNode6 solution = deleteDuplicates2(listNode);
        printLL(solution);

    }

    public static ListNode6 deleteDuplicates(ListNode6 head) {

        // Brute force approach
        Set<Integer> set = new HashSet<>();
        ListNode6 temp = head;
        ListNode6 newHead = null;
        ListNode6 tail = null;

        while (temp != null){

            // Create new node
            if (!set.contains(temp.val)) {

                ListNode6 newNode = new ListNode6(temp.val);
                // First Node, so head and tail at first node
                if(newHead == null){
                    newHead = newNode;
                    tail = newHead;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }

                set.add(temp.val);
            }

            temp = temp.next;
        }

        return newHead;
    }

    public static ListNode6 deleteDuplicates2(ListNode6 head) {

        // Changing pointer
        ListNode6 current = head;

        while (current != null && current.next != null) {

            // sorted list, so same current/next terms
            if (current.val == current.next.val) {
                // get next to next term
                ListNode6 nextToNextNode = current.next.next;
                current.next = nextToNextNode;

            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printLL(ListNode6 head) {

        while (head != null) {
            System.out.print(" " + head.val);
            head = head.next;
        }
    }
}
