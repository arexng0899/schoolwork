import java.util.*;
public class CollegeEmployee extends Person
{   
    private String ssn;
    private double annualSalary;
    private String dept;
    Scanner input = new Scanner(System.in);
    String employeeData;
    @Override
        public void setData()
        {
            super.setData();
            String tempSalary="";
            System.out.println("Please enter social security number: ");
            ssn = input.nextLine();
            System.out.println("Please enter department name: ");
            dept = input.nextLine();
            System.out.println("Please enter annual salary: ");
            annualSalary = input.nextDouble();
            employeeData = "SSN: " + ssn + "\t Annual Salary: " + annualSalary + "\t Department: " + dept;
        }
    @Override
        public void display()
        {
            System.out.println(personData);
            System.out.println(employeeData);
        }
}
