// Alex Ng CSC 1301 Lab 11 

import java.util.Scanner; // Scanner class

   public class TestPassword
   {
      public static void main(String[] args) // main method
      {
         Scanner s = new Scanner(System.in); // scanner object
         
         String passwordIn; // new string
         
         System.out.println("Enter password: "); // prompt for user
         
         passwordIn = s.next(); // setting the string to user input
         
         System.out.println(PasswordCheck(passwordIn)); // method call
         
         main(args); // reruns the program if mistakes are made
      }
      
      // method which checks the password
      public static String PasswordCheck(String Password)
      {
         String result = "Password is valid."; // result if conditions are met
         // variable initialization
         int length = 0;
         int digitCount = 0;
         int upperCount = 0;
         int lowerCount = 0;
         int specialCount = 0;
            // loop for finding number of each type of character
            for(int i = 0; i < Password.length(); i++)
            {
               if((Password.charAt(i) > 47 && Password.charAt(i) < 58)) // count for digits
               {
                  digitCount++;
               }
               
               if((Password.charAt(i) > 64 && Password.charAt(i) < 91)) // count for upper case letters
               {
                  upperCount++;
               }
               
               if((Password.charAt(i) > 96 && Password.charAt(i) < 122)) // count for lower case letters
               {
                  lowerCount++;
               }
               // count for special characters
               if((Password.charAt(i) > 31 && Password.charAt(i) < 48) || (Password.charAt(i) > 57 && Password.charAt(i) < 65) || (Password.charAt(i) > 90 && Password.charAt(i) < 97) || (Password.charAt(i) > 122 && Password.charAt(i) < 127))
               {
                  specialCount++;
               }
               // count for length
               length = i + 1;
            }
            
         if(digitCount < 1) // check for digits
         {
            result = "Not enough digits";
         }
         
         if(upperCount < 2) // check for upper case letters
         {
            result = "Not enough uppercase letters";
         }
         
         if(lowerCount < 4) // check for lower case letters
         {
            result = "Not enough lowercase letters";
         }
         
         if(specialCount < 1) // check for special characters
         {
            result = "Not enough special characters";
         }
         if(length < 10)
         {
            result = "Password is not long enough";
         }
      return result; // return statement
      }
   }