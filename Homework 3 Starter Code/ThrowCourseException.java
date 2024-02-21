// CSC 1302 Alex Ng Homework 3

   public class ThrowCourseException
   {
      public static void main(String[] args) 
      {
         int numRecords = 6;
         Course[] courses = new Course[numRecords];
         String[] depts = {"CIS", "ACC", "ENGLISH", "BB", "CSC", "CSC"};
         int[] courseNums = {110, 200, 100, 700, 4351, 3350};
         double[] credits = {3, 4, 7.5, 0, 100, 2.5};
      
            for(int i = 0;  i <numRecords; i++)
            {
               try
               {
                  courses[i] = new Course(depts[i], courseNums[i], credits[i]);
                  System.out.println(courses[i]);
               }
                  catch(Exception e)
                  {
                     System.out.println("Error when creating course");
                  }
            }
      }
   }