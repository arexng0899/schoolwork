// CSC 1302 Alex Ng Lab 5 Online Section

   public class TestStudent
   {
      public static void main(String[] args)
      {
         Undergraduate Alex = new Undergraduate("Bioinformatics", 3.9, 54, true);
         System.out.println("Student: Alex");
         System.out.println("Major: " + Alex.getMajor());
         System.out.println("GPA: " + Alex.getGpa());
         System.out.println("Year: " + Alex.getYear());
         
            if(Alex.isHonors())
            {
               System.out.println("Honors: True");
            }
               else
               {
                  System.out.println("Honors: False");
               }
         
         Graduate Mary = new Graduate("Computer Science", 3.91, 120, "Masters", "Data Science", 1);
         System.out.println("Student: Mary");
         System.out.println("Major: " + Mary.getMajor());
         System.out.println("Concentration: " + Mary.getConcentration());
         System.out.println("Years in Graduate School: " + Mary.getYears());
         
         Exchange YingShu = new Exchange("Cybersecurity", 3.2, 160, "Taiwan", "Fall 2022");
         System.out.println("Student: YingShu");
         System.out.println("Major: " + YingShu.getMajor());
         System.out.println("GPA: " + YingShu.getGpa());
         System.out.println("Year: " + YingShu.getYear());
         System.out.println("Country: " + YingShu.getCountry());
      }
   }