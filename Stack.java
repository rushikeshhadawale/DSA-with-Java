public class Stack{
    static final int SIZE = 5;
    static int[] stack = new int[SIZE];
    static int top = -1;

    // Function to push an element onto the stack
    static void push(int val) {
        if (top == SIZE - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = val;
        }
    }

    // Function to pop the top element from the stack
    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    // Function to display stack elements
    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Push elements onto the stack
        push(10);
        push(20);
        push(30);

        // Display stack
        display();

        // Pop top element and display again
        pop();
        display();
    }
}
