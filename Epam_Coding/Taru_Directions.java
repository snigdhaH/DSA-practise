/* PROB STATEMENT
  You are given a string of directions like "NNSWS", each character meaning:

N → North

S → South

E → East

W → West

Some pairs cancel each other if they’re in opposite directions on the same axis and are consecutive:

N followed by S (or S followed by N) cancels out

E followed by W (or W followed by E) cancels out

We need to remove all such consecutive opposite pairs, and if everything cancels, print "HURRAY".
 */
import java.io.*;
import java.util.*;

public class Taru_Directions{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String instructions = in.nextLine().trim();
        in.close();

        //Map of opposite directions
        Map<Character , Character> opposite = new HashMap<>();
        opposite.put('N' , 'S');
        opposite.put('S' , 'N');
        opposite.put('W' , 'E');
        opposite.put('E' , 'W');

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : instructions.toCharArray()){
            if(!stack.isEmpty() && opposite.get(c) == stack.peekLast()){
                stack.pollLast(); //cancel the opp direction
            } else {
                stack.addLast(c);
            }
        }
        if(stack.isEmpty()) System.out.println("HURRAY");
        else {
            StringBuilder result = new StringBuilder();
            for(char c: stack) result.append(c);
            System.out.println(result.toString());
        }
    }
}