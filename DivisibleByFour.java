// Alex Ng Lab 4 Part 2
import java.util.Scanner; // importing package with scanner class

public class DivisibleByFour {
   public static void main (String[] args) {
      Scanner s = new Scanner (System.in); // assigning "s" as a new scanner object
      
      int n = 0; // initalizing "n" as 0
      int num = 1; // initializing "num" as 1
      
         while (num > 0) { // start of while loop
            System.out.print ("Enter a Positive Integer; Enter 0 to End: "); // Prompt for user input
            
            num = s.nextInt(); // setting "num" to user input
            
            if (num % 4 == 0) // divisibilty check for user input
            
            n++; // n = n + 1 if divisibility check is met
         }
         System.out.println ("A total of " + n + " numbers entered are divisible by 4"); // statement from program
    }
}