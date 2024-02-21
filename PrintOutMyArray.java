// Alex Ng CSC 1301 Homework 10

// scanner package
import java.util.Scanner;

   public class PrintOutMyArray
   {
      public static void main(String[] args)
      {
         // initialization
         Scanner s = new Scanner(System.in);
         int numItems;
         int[] items;
         // prompt statement
         System.out.println("Enter the number of items: ");
         numItems = s.nextInt();
         items = new int[numItems];
            // entering values
            if(items.length > 0)
            {
               System.out.println("Enter the values of all items: ");
                  // setting values
                  for(int i = 0; i < numItems; i++)
                  {
                     items[i] = s.nextInt();
                  }
            }
            // printing out values in the array
            System.out.println("The values are: ");
               
               for(int j = 0; j < numItems; j++)
               {
                  System.out.print(items[j] + " ");
               }
      }
   }