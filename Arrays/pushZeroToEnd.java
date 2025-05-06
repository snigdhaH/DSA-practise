// Java Program to move all zeros to end using two traversals

class pushZeroToEnd {

    // Function which pushes all zeros to end of an array
    static void ZeroToEnd(int[] arr) {
        
        // Count of non-zero elements
        int count = 0;  

        // If the element is non-zero, replace the element at
        // index 'count' with this element and increment count
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }

        // Now all non-zero elements have been shifted to
        // the front. Make all elements 0 from count to end.
        while (count < arr.length)
            arr[count++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        ZeroToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}