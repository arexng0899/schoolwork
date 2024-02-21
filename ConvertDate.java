// Alex Ng CSC 1301 Homework 09 

// packages
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

   public class ConvertDate
   {
      public static void main(String[] args) throws ParseException
      {
         // Scanner class
         Scanner s = new Scanner(System.in);
         // user prompt
         System.out.println("Enter date to convert: ");
         // Date class
         Date date = null;
         // first format
         SimpleDateFormat date_format1 = new SimpleDateFormat("MMMM dd yyyy");
         // input line
         String input = s.nextLine();
            // condition check
            if(null != input && input.trim().length() > 0)
            {
               date = date_format1.parse(input); // setting date equal to first format
            }
         // initializing date_str
         String date_str = date_format1.format(date);
         // converted format
         SimpleDateFormat date_format2 = new SimpleDateFormat("dd MMMM yyyy");
         // setting date_str to new format
         date_str = date_format2.format(date);
         // end prompt
         System.out.println("dd/MMMM/yyyy: " + date_str);
      }    
   }