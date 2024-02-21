// CSC 1302 Alex Ng Homework 01 Online Section

import java.util.Scanner;

   class TimesAndInstructors 
   {
      public static void main(String[] args) 
      {
         // scanner class
         Scanner s = new Scanner(System.in);
         // condition for if statement
         boolean searching = true;
         // number of rows
         int courseNumber = 5;
         // number of columns
         int courseInfo = 3;
         // 2D String Matrix
         String[][] directory = new String[courseNumber][courseInfo];
            // info for each index of the matrix
            directory[0][0] = "CSC1301";
            directory[0][1] = "Mon 3pm";
            directory[0][2] = "Louis";
            directory[1][0] = "CSC1302";
            directory[1][1] = "Tue 2pm";
            directory[1][2] = "Johnson";
            directory[2][0] = "MATH2211";
            directory[2][1] = "Mon 12pm";
            directory[2][2] = "Pirhadi";
            directory[3][0] = "MATH2212";
            directory[3][1] = "Tue 11am";
            directory[3][2] = "Sigdel";
            directory[4][0] = "CSC2510";
            directory[4][1] = "Mon 12pm";
            directory[4][2] = "Glebova";
               // while loop to search for course information
               while(searching)
               {
                  // prompt for user
                  System.out.println("Please enter course name only: ");
                  // taking input
                  String search = s.nextLine();
                     // conditions checking for the courses
                     if(search.equals("CSC1301"))
                     {
                        System.out.println("Course: " + directory[0][0] + "\t Time: " + directory[0][1] + "\t Instructor: " + directory[0][2]);
                     }
                        else
                        {
                           if(search.equals("CSC1302"))
                           {
                              System.out.println("Course: " + directory[1][0] + "\t Time: " + directory[1][1] + "\t Instructor: " + directory[1][2]);
                           }
                              else
                              {
                                 if(search.equals("MATH2211"))
                                 {
                                    System.out.println("Course: " + directory[2][0] + "\t Time: " + directory[2][1] + "\t Instructor: " + directory[2][2]);
                                 }
                                    else
                                    {
                                       if(search.equals("MATH2212"))
                                       {
                                          System.out.println("Course: " + directory[3][0] + "\t Time: " + directory[3][1] + "\t Instructor: " + directory[3][2]);
                                       }
                                          else
                                          {
                                             if(search.equals("CSC2510"))
                                             {
                                                System.out.println("Course: " + directory[4][0] + "\t Time: " + directory[4][1] + "\t Instructor: " + directory[4][2]);
                                             }
                                                else
                                                {
                                                   System.out.println("Invalid Entry: No course of: " + search);
                                                }
                                          }
                                    }
                              }
                        }
                        // statement asking if the user wishes to continue searching
                        System.out.println("Continue searching?(Y/N)");
                        String answer = s.nextLine();
                        // setting the while loop condition to the user input
                        searching = answer.equalsIgnoreCase("y");
               }
      }
   }
