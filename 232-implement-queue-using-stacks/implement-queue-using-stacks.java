import java.util.Stack;

class MyQueue {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    // Constructor
    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // Push element x to the back of queue
    public void push(int x) {
        inputStack.push(x);
    }

    // Removes the element from the front of queue and returns it
    public int pop() {
        peek(); // Ensure outputStack has the front element
        return outputStack.pop();
    }

    // Get the front element
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    // Returns whether the queue is empty
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.peek()); // 1
        System.out.println(queue.pop());  // 1
        System.out.println(queue.pop());  // 2
        System.out.println(queue.empty()); // false
    }
}

       