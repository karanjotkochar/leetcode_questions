import java.util.ArrayDeque;
import java.util.Stack;

public class test_stack_ds {
    public static void main(String[] args) {
        vectorImplementation();
        arrayDequeImplementation();
    }

    public static void vectorImplementation() {

        // Vector implementation
        Stack<Integer> stack = new Stack<>();
        // push(), pop(), top(), isEmpty(), size()

        stack.push(1);
        stack.push(2);
        stack.push(3);

        int size = stack.size();
        System.out.println("size: " + size);

        System.out.println("peek/top: " + stack.peek());

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }

    public static void arrayDequeImplementation() {

        // Array Deque implementation

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("size: " + stack.size());
        System.out.println("peek/top: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }


    }

}
