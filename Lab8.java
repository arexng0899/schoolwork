// Alex Ng CSC 1301 Lab 8

import java.util.Scanner; // importing scanner package
   
   public class Lab8
   {
      // method for finding number of digits in inputed integer
      public static int findNum(int num)
      {
         // initialization
         int result = 0;
            // loop counting the number of digits
            while(num != 0)
            {
               num = num / 10; // operation
               result++; // update
            }
         return result; // returning result
      }
      
      
      
      // method for finding largest digit in inputed integer
      public static int findMax(int m)
      {
         // converting inputed integer into an array
         int count = 0; 
	      int length = Integer.toString(m).length(); 
	      int[] newInt = new int[length];
            // conversion loop
	         while(m != 0) 
	         { 
		         newInt[length - count - 1] = m % 10; 
		         m = m / 10; 
		         count++; 
	         } 
         // initialization for max variable
         int max = newInt[0];
            // looping at each point of the array
            for(int i = 0; i < newInt.length; i++)
            {  
               if (newInt[i] > max) // condition for finding max
                  max = newInt[i]; // update
            }
         return max; // returning max 
      }
      
      
      
      // method for reversing the inputed integer
      public static int reverseNum(int newInt)
      {
         // initialization of reverse
         int reverse = 0;
            // reverse operation loop
            while(newInt != 0)
            {
               int digit = newInt % 10; // reverse operation
               reverse = reverse * 10 + digit;
               newInt /= 10; // update
            }
         return reverse; // returning reverse
      }
      
      
      
      // main method
      public static void main(String[] args)
      {
         // assigning scanner object
         Scanner s = new Scanner(System.in);
         // assigning newInt
         int newInt = 1; 
            // looping until terminated by user input
            while(newInt != 0)
            {
               // printout statements for user
               System.out.print("Enter a positive integer, or 0 to stop: ");
               newInt = s.nextInt();
               System.out.println(newInt + " has " + findNum(newInt) + " digits");
               System.out.println("The max digit of " + newInt + " is " + findMax(newInt));
               System.out.println(newInt + " reversed is " + reverseNum(newInt));
            }
         System.out.println("Thank you, have a good day!"); // ending statement
      }
   }