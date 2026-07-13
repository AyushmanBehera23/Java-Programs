import java.util.Stack;

public class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    // Push element to the back of queue
    public void push(int x) {
        input.push(x);
    }

    // Remove front element
    public int pop() {

        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.pop();
    }

    // Get front element
    public int peek() {

        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Removed: " + queue.pop());

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Is Queue Empty? " + queue.empty());

        queue.push(40);

        System.out.println("Removed: " + queue.pop());
        System.out.println("Removed: " + queue.pop());
        System.out.println("Removed: " + queue.pop());

        System.out.println("Is Queue Empty? " + queue.empty());
    }
}