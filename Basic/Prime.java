class Prime {
    static boolean isPrime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1)
            return false;

        // Check divisibility from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) 
                return false;

        // If no divisors were found, n is prime
        return true;
    }

    public static void main(String[] args) {
        int n = 11;
      	if(isPrime(n)){
        	System.out.println("true" +n+ "is prime");
        }else{
          System.out.println("false" +n+ "is not prime");
    	}
    }
}
