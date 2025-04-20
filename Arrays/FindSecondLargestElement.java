// Find the second largest element in an array
public class FindSecondLargestElement {
    public static int secondLargest(int[] arr) {
        if (arr.length <2){
            System.out.println("Array should have at least 2 elements.");
            return -1;
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] > first){
                second = first;
                first=arr[i];
            }
            else if (arr[i] > second && arr[i] != first ){
                second= arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No Second Largesr Element!");
            return -1;
        }
        return second; 

    }
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,7,8};
        int secondLargest = FindSecondLargestElement.secondLargest(arr);

        if (secondLargest != -1){
            System.out.println("Second Largest Element is: " + secondLargest);
        }
    }
}