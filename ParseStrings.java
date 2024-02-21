// Alex Ng CSC 1301 Homework 09

// package
import java.util.Scanner;
   
   public class ParseStrings
   {
      public static void main(String[] args)
      {
         // scanner class
         Scanner s = new Scanner(System.in);
         // condition for loop
         boolean proceed = true;
            // loop for program
            while(proceed)
            {
               // prompt for user
               System.out.println("Please enter two words separated by a comma: (Example: Flamboyant, Boring) Enter q to end program.");
               // user input
               String twoWords = s.nextLine();
               // initializing comma inside of user input
               int comma = twoWords.indexOf(",");
               // locating the first and second words
               String wordOne = twoWords.substring(0, comma);
               String wordTwo = twoWords.substring(comma +1);
               // output
               System.out.println("First word: " + wordOne);
               System.out.println("Second word: " + wordTwo);
                  // closes program if condition is met
                  if(twoWords.equalsIgnoreCase("q"))
                  {
                     proceed = false;
                  }
            }
      }
   }