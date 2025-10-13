/*Problem Statement

Children are entering a school bus one by one.
Each child has a height (an integer).

When each child enters, you must insert them into a sorted list (ascending order by height).
The cost of inserting a child is the index (0-based) where that child is placed in the sorted list at that moment.

You must find the total cost of inserting all children — and print the result modulo 10⁹ + 7.
Constraints
1 ≤ n ≤ 100000
1 ≤ height[i] ≤ 100000
| Step | Child Height | Sorted List After Insertion | Inserted At Index | Total Cost |
| ---- | ------------ | --------------------------- | ----------------- | ---------- |
| 1    | 1            | [1]                         | 0                 | 0          |
| 2    | 6            | [1, 6]                      | 1                 | 1          |
| 3    | 3            | [1, 3, 6]                   | 1                 | 2          |
| 4    | 8            | [1, 3, 6, 8]                | 3                 | 5  O/P     |
 */

import java.io.*;
import java.util.*;


public class School_Bus {
    static final int MAX = 100000;
    static final int MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        Fenwick bit = new Fenwick(MAX);
        long totalCost = 0 ;

        for(int i = 0 ; i < n ; i++){
            int h = Integer.parseInt(br.readLine().trim());
            long index=bit.query(h-1);
            totalCost = (totalCost + index) % MOD;
            bit.update(h, 1);
        }
        System.out.println(totalCost % MOD);
    }
    // Fenwick Tree Helper Class
    static class Fenwick{
        long[] tree;
        int size;

        Fenwick(int n){
            tree = new long[n+2];
            size = n + 2;

        }
        void update(int index , int val) {
            while(index < size){
                tree[index] += val;
                index += index & -index; 
            }
        }

        long query(int index) {
            long sum = 0;
            while(index > 0 ){
                sum += tree[index];
                index -= index & -index; 

            }
            return sum;
        }
    }
}