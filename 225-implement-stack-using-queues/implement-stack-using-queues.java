import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    // Push element x onto stack
    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        
        // Rotate the queue to bring the new element to front
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    // Removes the element on top of the stack
    public int pop() {
        return queue.poll();
    }

    // Get the top element
    public int top() {
        return queue.peek();
    }

    // Returns whether the stack is empty
    public boolean empty() {
        return queue.isEmpty();
    }
}