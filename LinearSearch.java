import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Create an array with 5 elements
        int[] arr = {10, 20, 30, 40, 50};

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        // Perform linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        // If element is not found
        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
