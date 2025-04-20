// 1. Find the largest element in an array

public class FindLargestElement  {
    public static int findMax(int[] arr) {
        if (arr.length == 0){
            System.out.println("Empty Array!");
        }
        int max=arr[0];

        for(int i =1 ; i<arr.length ; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,7,9,1,5,10};
        int max = findMax(arr);
        System.out.println("Largest Element is: " + max);
    }
}