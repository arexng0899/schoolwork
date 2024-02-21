// CSC 1302 Alex Ng Lab 5 Online Section

   public class Undergraduate extends Student
   {
      private boolean honors;
      
         public boolean isHonors()
         {
            return honors;
         }
         
         public Undergraduate(String m, double g, int c, boolean b)
         {
            super(m, g, c);
            this.honors = b;
         }
   }