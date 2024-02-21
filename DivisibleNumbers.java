// Alex Ng Lab 4 Part 1
import java.util.Scanner; // Importing package with scanner class

public class DivisibleNumbers {
   public static void main(String[] args) {
   System.out.println ("Enter an Integer: "); // Prompt for user to input value
   
   Scanner s = new Scanner (System.in); // assigning "s" as a new scanner object
   
   int num = s.nextInt(); // initializing "num" as the user input
   
      System.out.print ("The numbers that are less than " + s.nextInt() + " and divisible by 3 and 5 are: "); // output message for user
   
         for (int n = 0; n < num; n++) { // for loop intializing n = 0, condition is n must be less than num, then setting n = n + 1
            if ((n % 3 == 0) || (n % 5 == 0)) // or operator used for finding values
               System.out.print (n + " "); // printing values into message
            }
       }
}