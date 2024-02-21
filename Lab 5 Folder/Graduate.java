// CSC 1302 Alex Ng Lab 5 Online Section

   public class Graduate extends Student
   {
      private String degree;
      private String concentration;
      private int years;
         
         public Graduate(String m, double g, int c, String d, String con, int y)
         {
            super(m, g, c);
            this.degree = d;
            this.concentration = con;
            this.years = y;
         }
         
         public String getDegree()
         {
            return degree;
         }
         
         public int getYears()
         {
            return years;
         }
         
         public String getConcentration()
         {
            return concentration;
         }
   }