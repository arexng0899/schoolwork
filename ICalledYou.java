// Alex Ng Homework 5 CSC 1301 Monday - Wednesday 3:30 - 4:45 Program 2

public class ICalledYou
{
   // Method for product calculation
   public static int product()
   {
      int num1 = 3;
      int num2 = 4;
      int pro = num1 * num2;
      return pro;
   }
   
   // Method for binary conversion
   public static String binary()
   {
      String bin = Integer.toBinaryString(product());
      return bin;
   }


   // Method for initials
   public static void intials()
   {                            
      System.out.println("                              ,--.        ");
      System.out.println("         ,---,              ,--.'|        ");
      System.out.println("        '  .' \\         ,--,:  : |       ");
      System.out.println("       /  ;    '.    ,`--.'`|  ' :        ");
      System.out.println("      :  :       \\   |   :  :  | |       ");
      System.out.println("      :  |   /\\   \\  :   |   \\ | :     ");
      System.out.println("      |  :  ' ;.   : |   : '  '; |        ");
      System.out.println("      |  |  ;/  \\   \\'   ' ;.    ;      ");
      System.out.println("      '  :  | \\  \\ ,'|   | | \\   |     ");
      System.out.println("      |  |  '  '--'  '   : |  ; .'        ");
      System.out.println("      |  :  :        |   | '`--'          ");
      System.out.println("      |  | ,'        '   : |              ");
      System.out.println("      `--''          ;   |.'              ");
      System.out.println("                     '---'                ");   
   }
   
   
   public static void main(String[] args)
   {
      intials();
      System.out.println("Product is: " + product());
      System.out.println("Product in binary is: " + binary());
   }
}
                             