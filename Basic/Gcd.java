public class Gcd {
   public static int findGCD(int a , int b){
    while(b!= 0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a; //a holds the GCD
}
    public static void main(String[] args) {
        int num1=24;
        int num2=36;
        int gcd= findGCD(num1, num2);
        System.out.println("the GCD OF 24 and 36 is " +gcd);
    }
   }