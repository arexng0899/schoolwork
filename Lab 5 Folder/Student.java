// CSC 1302 Alex Ng Lab 5 Online Section

   public class Student
   {
      private String major;
      private double gpa;
      private int creditHours;
      
         public Student(String m, double g, int c)
         {
            this.major = m;
            this.gpa = g;
            this.creditHours = c;
         }
         
         public String getMajor()
         {
            return major;
         }
      
         public double getGpa()
         {
            return gpa;
         }
         
         public int getCreditHours()
         {
            return creditHours;
         }
         
         public String getYear()
         {
            String yearName = "";
            
               if(creditHours < 32)
               {
                  yearName = "Freshman";
               }
                  else
                  {
                     if((creditHours >= 32) && (creditHours < 64))
                     {
                        yearName = "Sophomore";
                     }
                        else
                        {
                           if((creditHours >= 64) && (creditHours < 96))
                           {
                              yearName = "Junior";
                           }
                              else
                              {
                                 if(creditHours >= 96)
                                 {
                                    yearName = "Senior";
                                 }
                              }
                        }
                  }
            return yearName;
         }
   }