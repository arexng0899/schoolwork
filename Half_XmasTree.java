// Alex Ng CSC 1301 Homework 07 Program 1

import java.util.Scanner;

   public class Half_XmasTree
   {
      public static void main(String[] args)
      {
      
         Scanner s = new Scanner(System.in);
         
         System.out.println("Enter in the desired size of your half-tree:");
         
         for(int row = s.nextInt(); row >= 1; row--)
         {
            for(int picture = 1; picture <= row; picture++)
            {
               System.out.print("*");
            }
            System.out.println();
         }
      }
   }