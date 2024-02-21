// Alex Ng CSC 1301 Lab 7


import java.util.Scanner; // importing scanner package

   
public class Lab7 
{
   public static int findMax(int[] myList) // method for finding maximum value
   {
      int max = myList[0]; // initializing the max value
      
      for (int i = 1; i < myList.length; i++) // loop until the last integer in the array
      {
         if (myList[i] > max) // condition for finding the maximum
         
         max = myList[i]; // setting the max value if condition is met
         
      }
      
      return max; // returning the value
   }
   
   
   public static double findAverage(int[] myList)
   {
      double total = 0; // initializing total of array
      
      for (int i = 0; i < myList.length; i++) // adding each value in the array to total
      {
         total = total + myList[i]; // setting total to the added version
      }
      double average = total / myList.length; // finding the average of the array
      
      return average; // returning the value
   }
   
   
   public static int countLarger(int[] myList, int userNum)
   {
      int large = 0; // initializing variable for larger numbers
      
      for (int i = 0; i < myList.length; i++) // loop duration for the length
      {
         if (myList[i] > userNum) // condition to check if array value is larger than num
         {
            large++; // adding 1 to large if condition is met
         }
      }
      
      return large; // returning the value
   }


   public static void main(String[] args) // main method
   {
      System.out.print("Enter an integer for the size of your array: "); // prompt for user input
      
      Scanner s = new Scanner(System.in); // initializing scanner 
      
      int size = s.nextInt(); // setting size of the array to the input
      
      int myList [] = new int [size];
      
         for (int i = 0; i < myList.length; i++) // loop until the size is met
         {
            System.out.print("Enter an integer: "); // prompt for user to input integers
                        
            myList[i] = s.nextInt(); // setting integer scanned
         }
      System.out.println("Enter an integer to find the count larger than: "); // prompt for user to input value to count larger than
      
      int userNum = s.nextInt(); // scanning the next value inputted
      
      // output lines for user
      System.out.println("The max value of the array is: " + findMax(myList));
      System.out.println("The average value of the array is: " + findAverage(myList));
      System.out.println("The number of values greater than " + userNum + " is: " + countLarger(myList, userNum));
   }
}


            
