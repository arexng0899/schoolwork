/////////////////////////////////////////////////// 
// Homework #06 Program 3                        // 
// Name: Alex Ng                                 // 
// Lab time:                                     // 
// Program description: NumberGradeToLetter      // 
///////////////////////////////////////////////////

public class NumberGradeToLetter
{
   public static void main(String[] args)
   {
      
      int Grade = 100;
      
      switch (Grade/10)
      {
         case 10:
            System.out.print("Grade is 'A+'");
         break;
         case 9:
            System.out.print("Grade is 'A'");
         break;
         case 8:
            System.out.print("Grade is 'B'");
         break;
         case 7:
            System.out.print("Grade is 'C'");
         break;
         case 6:
            System.out.print("Grade is 'D'");
         break;
         case 5:
            System.out.print("Grade is 'F'");
         break;
         
         default:
            System.out.print("Invalid grade");
      }
   }
}