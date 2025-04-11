import java.util.Scanner;
public class stringStarHash1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        int result = findMinChanges(input);
        System.out.println("Output: " + result);

    }

    public static int findMinChanges(String s){
        int starCount=0, hashCount=0;

        for(char c: s.toCharArray()){
            if(c=='*'){
                starCount++;
            }else{
                hashCount++;
            }
        }
        return starCount - hashCount;

   
    }
}
//PROBLEM STATEMENT :Given a string s, input consisting of '*' and '#
//', the length of the string is variable. The task is to find the minimum number of star or hash to make it a valid string. //The //string is considered valid if the number of star and hash are equal. The star and hash can be at any position of the string. Note, the output will be at a positive or a negative integer based on the number of hash and star in the input string. //star greater than hash positive integer hash greater than star negative integer hash equal star 0