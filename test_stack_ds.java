import java.util.Stack;

public class test_stack_ds {
    public static void main(String[] args) {
        vectorImplementation();
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

}
