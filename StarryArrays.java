// Alex Ng CSC 1301 Homework 10

// scanner package
import java.util.Scanner;

   public class StarryArrays
   {
      public static void main(String[] args)
      {
         // initialization
         Scanner s = new Scanner(System.in);
         int numItems;
         int[] items;
         // user prompt statement
         System.out.println("Enter number of items: ");
         numItems = s.nextInt();
         items = new int[numItems];
         // entering values in array
         System.out.println("Enter the values of all items:");
            // setting array values
            for(int i = 0; i < numItems; i++)
            {
               items[i] = s.nextInt();
            }
               // printing out number of stars for each value
               for(int idx = 0; idx < items.length; idx++)
               {
                  System.out.print(idx + ": ");
                  for(int starNo = 1; starNo <= items[idx]; starNo++)
                  {
                     System.out.print("*");
                  }
                  System.out.println("");
               }
      }
   }