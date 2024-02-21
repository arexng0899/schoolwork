// Alex Ng Lab6
// Program to find the middle character of a string inputed by the user

import java.util.Scanner; // Importing the java scanner package

public class Lab6
{
   public static char findMiddleChar(String line) // Function for finding the middle character
   {
      // Initializing variables
      int length = line.length(); // Collecting the length of the inputed string
      int middle = length/2; // Calculating the middle of the string
      char print = line.charAt(middle); // Finding the character at the midpoint of the inputed string
      return print; // Returning the value to the main method
   }


   public static void main(String[] args) // Main method
   {   
      for(int i = 1; i < 11; i++) // For loop to loop the operation multiple times hardcoding variables
      {
         Scanner u = new Scanner(System.in); // New scanner variable initiated
         System.out.print("Please enter in String " + i + ": "); // Prompt for user to enter a string
         String line = u.nextLine(); // Reading the string given by the user
         System.out.println("The middle character of String " + i + " is: '" + findMiddleChar(line) + "'"); // Printing out the result and calling the earlier method
      }
         System.out.println("Goodbye!"); // Prompt ending the program
   }
}
   