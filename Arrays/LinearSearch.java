import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 55, 43, 23};
        int target = 6;

        int ans = linearSearch(arr, target);
        if (ans != -1) {
            System.out.println("Target found at index: " + ans);
        } else {
            System.out.println("Target not found.");
        }
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1; // target not found
    }
}
