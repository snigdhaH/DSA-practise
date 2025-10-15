class BinarySearch{
    static int b_search(int a[] , int l , int r , int x) {
        while(l<=r) {
            int m = (l+r) /2 ; 

            if(a[m] == x) return m;
            else if(a[m] > x) {
                r=m-1;
            }else{
                l=m+1;
            }
        
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = { 1 ,3 ,4 ,6 , 7, 8, 10};
        int n = a.length;
        int x = 7;

        int res = b_search(a, 0, n-1, x);
        System.out.println("Element to be searched is : " + x);
        if(res == -1) System.out.println("Element not found");
        else{
            System.out.println("elemt found at:" +res);
        }
    }
}