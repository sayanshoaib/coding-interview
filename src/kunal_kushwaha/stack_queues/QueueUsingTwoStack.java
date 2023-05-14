package kunal_kushwaha.stack_queues;

import java.util.Stack;

// Insert efficient

public class QueueUsingTwoStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingTwoStack(Stack<Integer> first, Stack<Integer> second) {
        this.first = first;
        this.second = second;
    }

    public void add(int item) {
        first.push(item);
    }

    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peeked;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
