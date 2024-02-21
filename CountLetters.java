// Program for counting letters in a sentence given by the user
// Alex Ng Lab 5

import java.util.Scanner; // Importing scanner package

public class CountLetters
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in); //assigning scanner objects "s" and "sc"
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a lower case letter"); // Prompt for user input then initializing user inputs into variables
      char searchChar = s.next().charAt(0);
      System.out.println("Enter a word or sentence");
      String myString = sc.nextLine();
      
      char upperCase = Character.toUpperCase(searchChar); // Initializing conversion of user inputted lowercase letter into uppercase
      int upper = 0; // Initializing more variables
      int lower = 0; 
      int both = 0;
      
         for(int i = 0; i < myString.length(); i++) // For loop used, looping by the length of the string inputted
         {
            if(upperCase == myString.charAt(i)) // Condition for uppercase letters
            {
            upper++; // Adding 1 to upper variable when condition is met
            }
               if(searchChar == myString.charAt(i)) // Condition for lowercase letters
               {
               lower++; // Adding 1 to lower variable when condition is met
               }
                  both = upper + lower; // Totaling both upper and lower variables
         }
                  System.out.println("The total number of uppercase " +upperCase+ "'s is: " +upper); // Statement outputs for inputted information
                  System.out.println("The total number of lowercase " +searchChar+ "'s is: " +lower);
                  System.out.println("The total number of lowercase and uppercase " +searchChar+ "'s is: " +both);
                  System.out.println("The total number of characters in the string is: " +myString.length());
    }
}
               