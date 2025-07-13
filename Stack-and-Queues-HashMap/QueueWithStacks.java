import java.util.*;

class QueueUsingStacks {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    void enqueue(int x) {
        input.push(x);
    }

    int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty())
                output.push(input.pop());
        }
        if (output.isEmpty())
            return -1;
        return output.pop();
    }
}

public class QueueWithStacks {
    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        
        q.enqueue(40);
        System.out.println(q.dequeue());
    }
}
