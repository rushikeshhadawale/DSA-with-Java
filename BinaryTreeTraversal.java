// Define a Node class to represent each node of the tree
class Node {
    int data;
    Node left, right;

    // Constructor to initialize node data
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Main class
public class BinaryTreeTraversal {

    // Function to perform inorder traversal (Left → Root → Right)
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);           // Traverse left subtree
            System.out.print(root.data + " "); // Visit root node
            inorder(root.right);          // Traverse right subtree
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create tree nodes
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Print inorder traversal
        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();
    }
}
