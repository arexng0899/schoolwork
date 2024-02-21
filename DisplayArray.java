// Alex Ng CSC 1301 Homework 10

// scanner package
import java.util.Scanner;

   public class DisplayArray
   {
      public static void main(String[] args)
      {
         // scanner class
         Scanner s = new Scanner(System.in);
         // initialization
         int[] arr1;
         
         arr1 = new int[10];
         
         int max = 0;
            // setting each value
            for(int i = 0; i < 10; i++)
            {
               System.out.println("Enter number for index " + i + ":");
               arr1[i] = s.nextInt();
            }
         // printing out contents of the array
         System.out.println("Array contents are: ");
            
               for(int j = 0; j < 10; j++)
               {
                  System.out.print(arr1[j] + " ");
               }
               
               System.out.println("");
                  // finding max value in array
                  for(int x = 0; x < 10; x++)
                  {
                     if(max < arr1[x])
                     {
                        max = arr1[x];
                     }
                  }
               // output statement
               System.out.println("The largest value of the array is: " + max);
      }
   }