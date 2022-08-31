package switchCase;
import java.util.Scanner;
public class Calculator {
	public static void main (String args[]) {
                System.out.println("THis is developed by Taufique Ahamad");
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter first number :");
		int a=sc.nextInt();
		System.out.print("Enter second number :");
		int b= sc.nextInt();
		System.out.print("Enter the operand {+,-,*,/,% } :");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		int result = 0;
		switch (operation) {
		
		case '+':
			result=a+b;
			break;
			
		case '-':
			result=a-b;
			break;
			
		case '*':
			result=a*b;
			break;
			
		case '/':
			result=a/b;
			break;
			
		case '%':
			result=a%b;
			break;
			
		default:
			System.out.println("invalid syntax");
		}
		System.out.println("The result is : " + result);
			
	}
}
