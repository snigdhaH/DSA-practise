public class Merge_2DotrtedArrays{
    public static void mergeArrays(int[] ar1, int[] ar2, int[] ar3) {
        int i = 0, j = 0, k = 0;
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] < ar2[j]) ar3[k++] = ar1[i++];
            else ar3[k++] = ar2[j++];
        }
        while (i < ar1.length) ar3[k++] = ar1[i++];
        while (j < ar2.length) ar3[k++] = ar2[j++];
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 3, 5, 7};
        int[] ar2 = {2, 4, 6, 8};
        int[] ar3 = new int[ar1.length + ar2.length];
        mergeArrays(ar1, ar2, ar3);
        for (int val : ar3) System.out.print(val + " ");
    }
}
