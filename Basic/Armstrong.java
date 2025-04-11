import java.util.Scanner;
public class Armstrong{
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0, digits=0, temp=num;

        //count no.of digits
        int n = num;
        while(n>0){
            n/=10;
            digits++;
        }
        // Calculate sum of digits raised to the power of count of digits
        n=num;
        while(n>0){
            int digit= n%10;
            sum+=Math.pow(digit,digits);
            n/=10;
        }
        if(sum==temp){

            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

    }
}