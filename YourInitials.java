// Alex Ng CSC 1301 Homework 09

// package
import java.util.Scanner;

   public class YourInitials
   {
      // main method
      public static void main(String[] args)
      {
         // scanner class
         Scanner s = new Scanner(System.in); 
         // condition to continue the program
         boolean proceed = true; 
         // loop until condition is false
         
            while(proceed)
            {
               // name count initialization
               int firstNameCount = 0;
               int lastNameCount = 0;
               // prompt for user
               System.out.println("Please enter your first and last name: (Example: John Smith.)");
               // initializing the input
               String fullName = s.nextLine();
               // finding the index of the space and the end of the string
               int space = fullName.indexOf(" ");
               int end = fullName.indexOf(".");
               // initialization of the initials in the name
               char firstInitial = fullName.charAt(0);
               char lastInitial = fullName.charAt(space + 1);
               // initialization of the inputted names
               String firstName = fullName.substring(0, space);
               String lastName = fullName.substring(space +1);
                  // counts number of characters in the first name
                  for(int i = 0; i < space; i++)
                  {
                     firstNameCount++;
                  }
                  // counts number of characters in the last name
                  for(int j = end - 1; j > space; j--)
                  {
                     lastNameCount++;
                  }   
               // output
               System.out.println("Hello there " + firstName + ", your first name is " + firstName + " which has " + firstNameCount + " characters in it");
               System.out.println("Hello again " + firstName + ", your last name is " + lastName + " which has " + lastNameCount + " characters in it");
               System.out.println("Did you know that your initials are " + firstInitial + lastInitial + "?");
               // question if user wishes to continue
               System.out.println("Do you wish to continue? (Y/N)");
               // user input
               String answer = s.nextLine();
               // updates the proceed condition
               proceed = answer.equalsIgnoreCase("y");
            }         
      }
   }