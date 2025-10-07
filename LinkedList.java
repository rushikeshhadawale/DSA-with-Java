// Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main class
public class LinkedList {

    // Function to insert a new node at the beginning
    static Node insert(Node head, int val) {
        Node newNode = new Node(val); // Create new node
        newNode.next = head;          // Point new node to the current head
        head = newNode;               // Update head to new node
        return head;
    }

    // Function to display the linked list
    static void display(Node head) {
        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {
        Node head = null; // Start with an empty list

        // Insert elements at the beginning
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);

        // Display the linked list
        display(head);
    }
}
