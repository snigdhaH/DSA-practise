import java.util.Scanner;
public class sumOfDigits{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int num= sc.nextInt();
        int sum=0,d;
        int p = num;
        while(num>0){
            d= num%10;
            sum= sum+d;
            num=num/10;
        }
        System.out.println("SUM OF THE DIGITS " + p + " IS: " + sum);
    }
}