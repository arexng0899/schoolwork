import java.util.Scanner;
public class Student extends Person
{
    private String major;
    private double gpa;
    Scanner input = new Scanner(System.in);
    String studentData;
    @Override
        public void setData()
        {
            super.setData();
            String tempGPA="";
            System.out.println("Please enter major of study: ");
            major = input.nextLine();
            System.out.println("Please enter grade point average: ");
            gpa = input.nextDouble();
            studentData = "Major: " + major + "\t GPA: " + gpa;
        }
    @Override
        public void display()
        {
            System.out.println(personData);
            System.out.println(studentData);
        }
}
