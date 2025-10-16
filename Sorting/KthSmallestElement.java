// Java program to find the K-th smallest element in an array

import java.util.Arrays;

class KthSmallestElement {

    // Function to return the K-th smallest element
    public static int findKthSmallest(Integer[] array, int k) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(array);

        // Step 2: Return the (k-1)th element (since array is 0-indexed)
        return array[k - 1];
    }

    public static void main(String[] args) {
        // Sample input array
        Integer[] array = {12, 3, 5, 7, 19};
        int k = 2; // We want the 2nd smallest element

        // Call the function and print the result
        System.out.println("The " + k + "rd smallest element is: " + findKthSmallest(array, k));
    }
}
