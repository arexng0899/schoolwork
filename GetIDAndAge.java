// CSC 1302 Alex Ng Lab 6 Online Section

import java.util.*;

   public class GetIDAndAge
   {
	   static final int HIGHID = 999;
      static final int HIGHAGE = 119;
      static final int LOW = 0;
   
      public static void main(String[] args)
      {
         int id, age;
         boolean bSTOP = false;
         Scanner keyboard = new Scanner(System.in);
         
         showStatus("Input zero for ID and Age to quit.");
         
            while(!bSTOP) 
            {
               try
               {
                  showStatus("");
                  showStatus("Please input ID (0.." + HIGHID + ")");
                  System.out.print("Enter ID: ");
                  id = keyboard.nextInt();
                  showStatus("Please input Age (0.." + HIGHAGE + ")");
                  System.out.print("Enter age: ");
                  age = keyboard.nextInt();
                  bSTOP = check(id, age);
               }
                  catch(DataEntryException ex1)
                  {  
                     showStatus("Error: " + ex1.getMessage());
                  }
                  
                  catch(InputMismatchException ex2)
                  {
                     showStatus("Invalid data type..");
                     keyboard.nextLine();
                  }
            }
         keyboard.close();
         showStatus("Thank you.");
      }
      
      public static boolean check(int idNum, int ageNum) throws DataEntryException 
      {
         if(idNum < LOW || idNum > HIGHID)
         {
            throw (new DataEntryException("ID", idNum));
         }   
         
         if(ageNum < LOW || ageNum > HIGHAGE)
         {
            throw (new DataEntryException("Age", ageNum));
         }
         
         if(idNum == 0 && ageNum == 0)
         {
            return true;
         }
            else
            {
               showStatus("ID and Age are OK.");
            }
      return false;
      }
      
      public static void showStatus(String msg)
      {
         System.out.println(msg);
      }
   }
