// Alex Ng CSC 1301 Homework 8 Program 2

import java.util.Scanner;

   public class PhoneNumberDecoder
   {
      public static void main(String[] args)
      {
         Scanner s = new Scanner(System.in);
         String phoneStr;
         int i;
         char currChar;
         
         System.out.print("Enter phone number(Numbers only): ");
         phoneStr = s.next();
         
            for(i = 0; i < phoneStr.length(); i++)
            {
               currChar = phoneStr.charAt(i);
               
                  if((currChar >= '0') && (currChar <= '9'))
                  {
                     System.out.print(currChar);
                  }
                     else
                     {
                        switch(currChar)
                        {
                           case 'A':
                              System.out.print("?");
                           break;
                           case 'B':
                              System.out.print("?");
                           break;
                           case 'C':
                              System.out.print("?");
                           break;
                           case 'D':
                              System.out.print("?");
                           break;
                           case 'E':
                              System.out.print("?");
                           break;
                           case 'F':
                              System.out.print("?");
                           break;
                           case 'G':
                              System.out.print("?");
                           break;
                           case 'H':
                              System.out.print("?");
                           break;
                           case 'I':
                              System.out.print("?");
                           break;
                           case 'J':
                              System.out.print("?");
                           break;
                           case 'K':
                              System.out.print("?");
                           break;
                           case 'L':
                              System.out.print("?");
                           break;
                           case 'M':
                              System.out.print("?");
                           break;
                           case 'N':
                              System.out.print("?");
                           break;
                           case 'O':
                              System.out.print("?");
                           break;
                           case 'P':
                              System.out.print("?");
                           break;
                           case 'Q':
                              System.out.print("?");
                           break;
                           case 'R':
                              System.out.print("?");
                           break;
                           case 'S':
                              System.out.print("?");
                           break;
                           case 'T':
                              System.out.print("?");
                           break;
                           case 'U':
                              System.out.print("?");
                           break;
                           case 'V':
                              System.out.print("?");
                           break;
                           case 'W':
                              System.out.print("?");
                           break;
                           case 'X':
                              System.out.print("?");
                           break;
                           case 'Y':
                              System.out.print("?");
                           break;
                           case 'Z':
                              System.out.print("?");
                           break;
                           case '-':
                              System.out.print("?");
                           break;
                           default:
                              System.out.print("?");
                        }
                      }
             }
       }
    }
                  
                     
                     
                     
                     
                    
                     
           