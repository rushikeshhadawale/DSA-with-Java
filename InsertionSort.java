public class InsertionSort {
    public static void main(String[] args) {
        // Create an array with unsorted elements
        int[] arr = {12, 11, 13, 5, 6};

        int n = arr.length;

        // Perform Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = arr[i];   // Current element to insert
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place the key at its correct position
            arr[j + 1] = key;
        }

        // Print the sorted array
        System.out.print("Sorted array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
