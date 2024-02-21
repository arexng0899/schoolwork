import java.util.*;

public class Test
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      int num = 0;
      System.out.println("Enter number: ");
      
         try 
         {
            num = sc.nextInt();
            
            if (num == 0) 
            {
               System.out.print("Zero");
            }
            
               else
               { 
                  System.out.print(numberIntoWord(num));
               }
         }
         
            catch (Exception e) 
            {
               System.out.println("Enter a valid number");
            }
            
      sc.close();
   }
   
   private static String numberIntoWord(int num) 
   {
      String s = "";
      String units_arr[] = { "zero", "one", "two", "three", "four", "five", "six",
      "seven", "eight", "nine", "ten", "eleven", "twelve",
      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
      "eighteen", "nineteen" };
      
      String tens_arr[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
      "sixty", "seventy", "eighty", "ninety" };
      
      if (num == 0) 
      {
         return "zero";
      }
      
         if (num < 0) 
         { // add minus before conversion if the number is less than 0
            String str = "" + num; // convert num into string
            str = str.substring(1); // remove minus before the number
            return "minus " + numberIntoWord(Integer.parseInt(str)); // add minus before the number and
         }
            if ((num / 1000000) > 0) 
            { // check if number is divisible by 1 million
               s += numberIntoWord(num / 1000000) + " million ";
               num %= 1000000;
            }
               if ((num / 1000) > 0) 
               { // check if number is divisible by 1 thousand
                  s += numberIntoWord(num / 1000) + " thousand ";
                  num %= 1000;
               }
               
                  if ((num / 100) > 0) 
                  { // check if number is divisible by 1 hundred
                     s += numberIntoWord(num / 100) + " hundred ";
                     num %= 100;
                  }
                  
                     if (num > 0) 
                     { // check if number is within teens
                        if (num < 20) 
                        { // fetch the appropriate value from unit array
                           s += units_arr[num];
                        }
                           else 
                           { // fetch the appropriate value from tens array
                              s += tens_arr[num / 10];
                              if ((num % 10) > 0) 
                              {
                                 s += "-" + units_arr[num % 10];
                              }
                           }
                     }
            return s;
   }
}
