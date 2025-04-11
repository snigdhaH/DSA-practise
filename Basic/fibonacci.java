//progrm to get the nth fibonacci number
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter nth number to get fibonacci number: ");
        int n=sc.nextInt();
        int count= 2;

        int a= 0;
        int b=1;
        
        while(count<=n){
            int temp=b;       //otherwise value of b stored in a wud change!!
            b= b + a;
            a=temp;
            count++;
        }
        System.out.println(b);
        

    }
}