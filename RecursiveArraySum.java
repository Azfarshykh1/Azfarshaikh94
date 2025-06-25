import java.util.Scanner;

public class RecursiveArraySum {

    // Recursive function to calculate sum of array
    public static int recursiveSum(int[] arr, int n) {
        // Base case: when no elements left
        if (n <= 0) {
            return 0;
        }

        // Recursive case: last element + sum of rest
        return recursiveSum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize array
        int[] arr = new int[size];

        // Get array elements from user
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calculate sum using recursive function
        int sum = recursiveSum(arr, arr.length);

        // Display array and sum
        System.out.print("\nArray: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum of array elements: " + sum);

        scanner.close();
    }
}
