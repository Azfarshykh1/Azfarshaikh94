import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {

    // Method to reverse an array using stack
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements of array into stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop all elements from stack and put back into array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
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

        // Display original array
        System.out.print("\nOriginal array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse the array
        reverseArray(arr);

        // Display reversed array
        System.out.print("\nReversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}