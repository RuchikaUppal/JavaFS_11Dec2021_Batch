package FSJTestPakage;

import java.util.Scanner;

public class Multiplication 
{
	public static void main(String [] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get the multipilcation table : ");
		
		int userInput;
		int product=1;
		userInput = sc.nextInt();
		sc.close();
		
        for(int i = 1;i<=10;i++)
        {
        	
        	product = userInput*i;
        	System.out.println(userInput+ " x " +i+" = " +product);
       
        }
	}

}

