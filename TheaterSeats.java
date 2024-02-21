// Alex Ng CSC 1301 Homework 8 Program 1

import java.util.Scanner;

   public class TheaterSeats
   {
      public static void main(String[] args)
      {
      
         Scanner s = new Scanner(System.in);
         int numRows;
         int numColumns;
         int currentRow;
         int currentColumn;
         char currentColumnLetter;
         
         System.out.println("Please enter the number of rows:");
         numRows = s.nextInt();
         System.out.println("Please enter the number of columns:");
         numColumns = s.nextInt();
         
            
         
            for(currentRow = 1; currentRow <= numRows; currentRow++)
            {
               currentColumnLetter = 'A';
               for(currentColumn = 1; currentColumn <= numColumns; currentColumn++)
               {
                  System.out.print(" " + currentRow + currentColumnLetter + " ");
                  currentColumnLetter++;
               }
            }
      }
   }