// Alex Ng CSC 1301 Homework 07 Program 4

import java.util.Scanner;
   
   public class Guess_A_Number
   {
      public static void main(String[] args)
      {
         
         Scanner s = new Scanner(System.in);
 
         System.out.println("Guess the Secret Number!");
         
         System.out.print("Enter the maximum value for the secret number: ");
         
         int maxNumber = s.nextInt();
         
         System.out.println("A new secret number has been chosen");
         
         int secretNumber = (int)(Math.random() * maxNumber) + 1;
         
         int i = 1;
         
         int count = 0;
         
         boolean playing = true;
         
            while(playing)
            {
               while(i > 0)
               {
                  System.out.println("Enter a guess :)");
                  
                  int guess = s.nextInt();
                  
                  if(guess > secretNumber)
                  {
                     System.out.println("Too high nerd");
                     count++;
                  }
                  
                  if(guess < secretNumber)
                  {
                     System.out.println("Too low KEKW");
                     count++;
                  }
                     
                  if(guess == secretNumber)
                  {
                     System.out.println("Congrats...you're decent at this");
                     count++;
                     break;
                  }
               }
                  
               System.out.println("You won in " + count + " attempts");
               System.out.println("Play again? (Y/N)");
               playing = s.nextLine().trim().equalsIgnoreCase("y");
            }
      }
   }