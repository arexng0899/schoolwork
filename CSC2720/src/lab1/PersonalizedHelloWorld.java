package lab1;
import java.util.Scanner;

public class PersonalizedHelloWorld {

	public static void main(String[] args) {
		// Name variable
		String name;
		// Input Check Variable
		boolean check = false;
		// Scanner Object
		Scanner input = new Scanner(System.in);
		// Message Prompt
		System.out.println("What is your name? ");
		// User input 
		name = input.nextLine();
			// while loop to check inputs
			while(name == "") {
				System.out.println("Please enter your name: ");
				name = input.nextLine();
			}
		// Output for user
		System.out.println("Hello, " + name + "!");
	}

}
