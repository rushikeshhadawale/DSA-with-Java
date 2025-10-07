public class ArrayTraversal {
    public static void main(String[] args) {
        // Create an array with 5 elements
        int[] arr = {10, 20, 30, 40, 50};

        // Find the number of elements in the array
        int n = arr.length;

        // Print heading without moving to new line
        System.out.print("Array elements: ");

        // Loop through each element of the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print elements on same line
        }

        // Move to a new line after printing all elements
        System.out.println();
    }
}
