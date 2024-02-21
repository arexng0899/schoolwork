// Alex Ng CSC 1301 Homework 07 Program 3

import java.util.Scanner;
   
   public class Full_XmasTree
   {
      public static void main(String[] args) 
      {
      
         Scanner s = new Scanner(System.in);
      
         System.out.println("Please enter the size of your tree:");
         
         int size = s.nextInt();
         
            for(int i = 0; i < size; i++) 
            {
               for(int j = 0; j < size - i; j++) 
               {
                  System.out.print(" ");
               }
               for(int k = 0; k <= i; k++) 
               {
                  System.out.print("* ");
               }
               System.out.println();  
            }
            
            for(int i = 0; i < size / 2; i++) 
            {
               for(int j = 0; j < size / 2 - i; j++) 
               {
                  System.out.print(" ");
               }
               for(int k = 0; k <= i; k++) 
               {
                  System.out.print("* ");
               }
               System.out.println();  
            }
      }
   }