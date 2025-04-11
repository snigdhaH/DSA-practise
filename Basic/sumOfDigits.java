import java.util.Scanner;
public class sumOfDigits{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int num= sc.nextInt();
        int sum=0;
        int p = num;
        while(num>0){
            sum+= num%10;
            num/=10;
        }
        System.out.println("SUM OF THE DIGITS " + p + " IS: " + sum);
    }
}