// CSC 1302 Alex Ng Homework 3

   public class Course 
   {
      String department;
      int courseNumber;
      double credits;
      final int DEPT_LENGTH = 3;
      final int LOW_NUM = 100;
      final int HIGH_NUM = 499;
      final double LOW_CREDITS = 0.5;
      final double HIGH_CREDITS = 6;
      
      public Course() 
      {
         department = "";
         courseNumber = 0;
         credits = 0;
      }
   
      public Course(String dept, int num, double creditValue) throws CourseException 
      {
         boolean isBad = false;
         String msg = "";
         department = dept;
         courseNumber = num;
         credits = creditValue;
         
            if(department.length() != 3 || (courseNumber < 100 || courseNumber > 499) || (credits < 0.5 || credits > 6))
            {
               throw new CourseException("Exception: Cannot create course with following information - Department: " + department + "\t Course Number: " + courseNumber + "\t Credit Number: " + credits);
            }
      }
   
      public String toString() 
      {
         return "Created Course with following information - Department: " + department + "\t Course Number: " + courseNumber + "\t Credit Number: " + credits;
      }
   }
