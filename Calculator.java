
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// variables
		char operator = 'a';
		double num1 = 0, num2 = 0, result = 0;
		
		// scanner object
		Scanner input = new Scanner(System.in);
		
		// try block
		try {
		// prompt for user operator
		System.out.println("Choose an operator: +, -, *, /");
		operator = input.next().charAt(0);
		
		// prompt for user's first number
		System.out.println("Input first number:");
		num1 = input.nextDouble();
		
		// prompt for user's second number
		System.out.println("Input second number:");
		num2 = input.nextDouble();
		
		// operation procedure to find result
		switch(operator) {
		
			case '+':
				result = num1 + num2;
			break;
			
			case '-':
				result = num1 - num2;
			break;
			
			case '*':
				result = num1 * num2;
			break;
			
			case '/':
				result = num1 / num2;
			break;
		}
		
		// check for division by 0
		if(operator == '/') {
			if(num2 == 0) {
				// error message
				System.out.println("Undefined: Cannot divide by 0");
			}
		} else {
		// operation output message
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}
	}
		// error message
		catch(Exception e) {
			System.out.println("Something went wrong, check previous inputs");
		}
		
	}

}