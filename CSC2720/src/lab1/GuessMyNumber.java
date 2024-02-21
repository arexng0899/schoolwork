package lab1;
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		// Scanner object
		Scanner input = new Scanner(System.in);
		// Variables
		int num; int first; int last; int mid;
		String response;
		boolean check = false;
		// Startup message
		System.out.println("Enter n: ");
		num = input.nextInt();
			// Checking if num is equal to 0 or less
			while((num < 0)||(num == 0)){
				System.out.println("Please enter a positive integer for n: ");
				num = input.nextInt();
			}
		System.out.println("Welcome to Guess My Number!");
		// Setting variables
		first = 0;
		last = num - 1;
		mid = num/2;
		System.out.println("Think of a number between " + first + " and " + last + ".");
		
			// More prompts for user
			System.out.println("Is this your number: " + Math.round(mid) + "?");
			System.out.println("Please enter C for correct, H for too high, or L for too low.");
			System.out.println("Enter your response (H/L/C): ");
				
				// Continues to loop until the check is true
				while(check == false) {
				
					// User Response
					response = input.next();
					
						// Switch case for each response
						switch(response) {
						
							case "H":
								// Operation
								last = mid;
								mid = ((first + last)/2);
								// Question prompt for user
								System.out.println("Is this your number: " + mid + "?");
								System.out.println("Please enter C for correct, H for too high, or L for too low.");
								System.out.println("Enter your response (H/L/C): ");
								break;
							
							case "L":
								// Operation
								first = mid + 1;
								mid = ((first + last)/2);
								// Question prompt for user
								System.out.println("Is this your number: " + mid + "?");
								System.out.println("Please enter C for correct, H for too high, or L for too low.");
								System.out.println("Enter your response (H/L/C): ");
								break;
							
							case "C":
								System.out.println("Thank you for playing Guess My Number!");
								// Sets the progress check to true
								check = true;
								break;
							
							// For cases other than H/L/C 
							default:
								System.out.println("Enter your response (H/L/C): ");
								break;
						}
				}
		}
}

