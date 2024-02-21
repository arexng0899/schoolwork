// CSC 1302 Alex Ng Lab 5 Online Section

   public class Exchange extends Student
   {
      private String country;
      private String exchangeYear;
      
         public Exchange(String m, double g, int c, String ct, String ey)
         {
            super(m, g, c);
            this.country = ct;
            this.exchangeYear = ey;
         }
      
         public String getExchangeYear()
         {
            return exchangeYear;
         }
         
         public String getCountry()
         {
            return country;
         }
   }