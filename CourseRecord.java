// Alex Ng CSC 1301 Lab 9

import java.util.ArrayList; // importing array list package
   // class initialization 
   public class CourseRecord 
   {
      double gpa;
      ArrayList<String> courses = new ArrayList<>();
      ArrayList<Double> credits = new ArrayList<>();
      ArrayList<String> grades = new ArrayList<>();
      
      
      //arraylist setup
      public ArrayList<String> combine(ArrayList<String> a, ArrayList<Double> b, ArrayList<String> c)
      {
         ArrayList<String> courseList = new ArrayList<>();
         
            for(int i = 0; i < a.size(); i++)
            {
               courseList.add(a.get(i) + "   " + b.get(i) + "   " + c.get(i));
            }
         return courseList;
      }
      
      
      // string method
      public String toString()
      {
         return "\n" + String.join("\n", combine(courses, credits, grades)) + "\n\nGPA: " + this.gpa + "" +
                "\n----------------------\n";
      }

   }
