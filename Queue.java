public class Queue {
    static final int SIZE = 5;
    static int[] queue = new int[SIZE];
    static int front = -1;
    static int rear = -1;

    // Function to insert element into the queue
    static void enqueue(int val) {
        if (rear == SIZE - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0; // first element being inserted
            }
            rear++;
            queue[rear] = val;
        }
    }

    // Function to remove element from the queue
    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Dequeued: " + queue[front]);
            front++;
        }
    }

    // Function to display elements of the queue
    static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: [");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i]);
                if (i < rear) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        // Insert elements into the queue
        enqueue(10);
        enqueue(20);
        enqueue(30);

        // Display the queue
        display();

        // Remove one element and display again
        dequeue();
        display();
    }
}
