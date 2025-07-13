import java.util.*;

class StackSorter {
    void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            insert(stack, temp);
        }
    }

    void insert(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insert(stack, value);
            stack.push(temp);
        }
    }
}

public class SortStackRecursively {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        StackSorter sorter = new StackSorter();
        sorter.sort(stack);
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
