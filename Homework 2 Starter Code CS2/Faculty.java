import java.util.Scanner;
public class Faculty extends CollegeEmployee
{
    private boolean isTenured = false;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            String tempTenure="";
            String answer;
            boolean status;
            System.out.println("Is faculty member tenured? (Y/N)");
            answer = input.nextLine();
            status = answer.equalsIgnoreCase("y");
            
               if(status = true)
               {
                  isTenured = true;
               }
                  else
                  {
                     if(status = false)
                     {
                        isTenured = false;
                     }
                  }
        }
    @Override
        public void display()
        {
            if(isTenured = true)
            {
               System.out.println(personData);
               System.out.println(employeeData);
               System.out.println("Status: Tenured");
            }
               else
               {
                  if(isTenured = false)
                  {
                     System.out.println(personData);
                     System.out.println(employeeData);
                     System.out.println("Status: Not Tenured");
                  }
               }
        }
}
