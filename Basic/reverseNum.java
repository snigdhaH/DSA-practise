import java.util.Scanner;
public class reverseNum{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Enter a number to be reversed: ");
        int num= sc.nextInt();
        int reversed=0;
        while(num!=0){
            int digit=num%10;                  // Extract the last digit
            reversed= reversed*10+digit;       // Build the reversed number
            num/=10;                           // Remove the last digit

        }
       System.out.println("Reversed number is : " + reversed);
}}