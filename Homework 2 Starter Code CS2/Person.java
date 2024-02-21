import java.util.Scanner;
public class Person
{
    private String firstName;
    private String lastName;
    public String address;
    private String zip;
    private String phone;
    String personData;
    Scanner input = new Scanner(System.in);
    public void setData()
    {
        String tempGrade="";
        
        System.out.println("Please enter first name: ");
        firstName = input.nextLine();
        System.out.println("Please enter last name: ");
        lastName = input.nextLine();
        System.out.println("Please enter address: ");
        address = input.nextLine();
        System.out.println("Please enter zip code: ");
        zip = input.nextLine();
        System.out.println("Please enter phone number: ");
        phone = input.nextLine();
        personData = "First Name: " + firstName + "\t Last Name: " + lastName + "\t Address: " + address + "\t Zip Code: " + zip + "\t Phone Number: " + phone;
    }
    public void display()
    {
        System.out.println(personData);
    }
}
