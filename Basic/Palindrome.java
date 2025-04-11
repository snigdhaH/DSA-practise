import java.util.Scanner;
public class Palindrome{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int temp= num;
        int reversed=0;
        while(num!=0){
            int digit=num%10;                  // Extract the last digit
            reversed= reversed*10+digit;       // Build the reversed number
            num/=10;                           // Remove the last digit

        }
          // Check if palindrome
          if (temp == reversed) {
            System.out.println(temp + " is a Palindrome number.");
        } else {
            System.out.println(temp + " is not a Palindrome number.");
        }
      
}}