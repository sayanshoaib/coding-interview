package kunal_kushwaha.stack_queues;

import java.util.Stack;

// Remove efficient

public class QueueUsingTwoStackRemove {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingTwoStackRemove(Stack<Integer> first, Stack<Integer> second) {
        this.first = first;
        this.second = second;
    }

    public void add(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(item);

        while (!second.isEmpty()) {{
            first.push(second.pop());
        }}
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
        return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
