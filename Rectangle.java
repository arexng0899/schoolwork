// CSC 1302 Alex Ng Lab 3 Online Section

public class Rectangle
{
   // initializing parameters and rectangle attributes
   public double x;
   public double y;
   public double width;
   public double height;
   public double x2 = 0.0;
   public double y2 = 0.0;
      
      // method for creating rectangle object
      public Rectangle(double x, double y, double h, double w)
      {
         this.x = x;
         this.y = y;
         width = w;
         height = h;
      }
      // finding the y coordinate of the bottom right point of rectangle
      public double findBottom()
      {
         y2 = y + height;
         return y2;
      }
      // finding the x coordinate of the bottom right point of the rectangle
      public double findRight()
      {
         x2 = x + width;
         return x2;
      }
      // area method
      public double getArea()
      {
         return (width * height);
      }
      // string conversion
      @Override
      public String toString()
      {
         return "Rectangle [x = " + x + "\t y = " + y + "\t height = " + height + "\t width = " + width + "] Area is " + getArea();
      }
}