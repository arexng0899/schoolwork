// Alex Ng CSC 1301 Lab 9

// importing packages
import java.util.ArrayList;
import java.util.OptionalDouble;

   // student class
   public class Student
   {  // variable initialization 
      String name;
      String major;
      CourseRecord courseRecord = new CourseRecord();
     
      
      public Student(String name, String major)
      {
         this.name = name;
         this.major = major;
      }
      
      // gpa method
      public double gpa()
      {
         ArrayList<Double> gpas = new ArrayList<>();
         double average = 0;
         
            for(int i = 0; i < courseRecord.grades.size(); i++)
            {
            
               switch (courseRecord.grades.get(i)) 
               {
                  case "A" -> gpas.add(4.00);
                  case "B" -> gpas.add(3.00);
                  case "C" -> gpas.add(2.00);
                  case "D" -> gpas.add(1.00);
                  case "F" -> gpas.add(0.00);
               }
               average += gpas.get(i);
            }
            
         average /= courseRecord.grades.size();
         courseRecord.gpa = Math.round(average * 100.0) / 100.0;
         return courseRecord.gpa;
      }
      
      // getter  
      public String getName()
      {
         return this.name;
      }
      
      // course record list method
      public void addCourseRecord(String a, double b, String c)
      {
         courseRecord.courses.add(a);
         courseRecord.credits.add(b);
         courseRecord.grades.add(c);
      }
      
      // string method
      public String toString() 
      {
         return "\n----------------------\n"+ "NAME:  " + this.name + "\nMAJOR: " + this.major + "\n" + courseRecord;
      }
      
   }

   