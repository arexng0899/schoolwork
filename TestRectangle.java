// CSC 1302 Alex Ng Lab 3 Online Section

public class TestRectangle
{
   public static boolean isOverlap(Rectangle r1, Rectangle r2)
   {
      // checks horizontal parameters
      if(r1.x <= r2.x2 || r2.x <= r1.x2)
      {
         return false;
      }
      // checks vertical parameters
      if(r1.y2 >= r2.y || r2.y2 >= r1.y)
      {
         return false;
      }
      return true;
   }
   public static void main(String[] args)
   {
      // creating new rectangle objects
      Rectangle r1 = new Rectangle(2.5, 13.0, 14.0, 4.0);
      Rectangle rect1 = r1;
      System.out.println(r1.toString());
      Rectangle r2 = new Rectangle(5.0, 10.0, 10.0, 10.0);
      Rectangle rect2 = r2;
      System.out.println(r2.toString());
         // if overlap method gave true then the output indicates the rectangles overlap and if false vice versa
         if(isOverlap(rect1, rect2))
         {
            System.out.println("Rectangles do overlap");
         }
            else
            {
               System.out.println("Rectangles do not overlap");
            }
   }
}