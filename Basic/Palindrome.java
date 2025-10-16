import java.util.Scanner;
 public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int temp= n;
        int d, rev=0;

        while(n!=0) {
            d=n%10;
            rev = rev*10 + d;
            n=n/10;
        }
        if(temp == rev) System.out.println("Palindrome");
        else {
            System.out.println("Not Palindrome");
        }
    }
 }