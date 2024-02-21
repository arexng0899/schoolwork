// Alex Ng CSC 1301 Homework 07 Program 2

public class Ascii_Tree
{
   public static void main(String[] args)
   {
   
      int size = 19;
      
      for (int i = 1; i <= size; i=i+2)
      {
      
         int count = (size - i)/2;
         
            for(int j = 0; j< size; j++) 
            {
               if(j < count || j >= (size - count)) 
               {
                  System.out.print(" ");
               } 
                  else 
                  {
                     System.out.print("|");
                  }
            }
         System.out.println();
      }
   }
}
   
   
   
 