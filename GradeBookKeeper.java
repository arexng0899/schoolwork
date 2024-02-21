// Alex Ng CSC 1301 Homework 10

// scanner package
import java.util.Scanner;

   public class GradeBookKeeper
   {
      public static void main(String[] args)
      {
         // variable initialization
         Scanner s = new Scanner(System.in);
         int numStudents;
         int[] grades;
         int studentNum = 1;
         double average = 0;
         int totalGrades = 0;
         int max = 0;
         int min = 100;
         // user prompt for number of students
         System.out.println("Enter the number of students: ");
         numStudents = s.nextInt();
         grades = new int[numStudents];
            // setting grades for each student
            for(int i = 0; i < numStudents; i++)
            {
               System.out.println("Enter the grade for student " + studentNum + ": ");
               grades[i] = s.nextInt();
               studentNum++;
            }
               // finding the average of the grades
               for(int a = 0; a < numStudents; a++)
               {
                  totalGrades = totalGrades + grades[a];
               }
               average = totalGrades/numStudents;
               System.out.println("The average is: " + average);
                  // finding the minimum of the grades
                  for(int y = 0; y < numStudents; y++)
                  {
                     if(min > grades[y])
                     {
                        min = grades[y];
                     }
                  }
                  System.out.println("The minimum is: " + min);
                     // finding the maximum of the grades
                     for(int x = 0; x < numStudents; x++)
                     {
                        if(max < grades[x])
                        {
                           max = max + grades[x];
                        }
                     }
                     System.out.println("The maximum is: " + max);
      }
   }