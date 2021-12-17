package FSJTestPakage;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int userInput)
	   {
	      int fact=1;
	      for(int i=1; i<=userInput; i++)
	         fact = fact*i;
	      return fact;
	   }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get the factorial of the number : ");
	
		int userInput = sc.nextInt();
		sc.close();
		
		int factorialOfUserInput=fact(userInput);
		
		System.out.println("The factorial of the entered number is :" +factorialOfUserInput);
		
	}

}
