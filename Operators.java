package FSJTestPakage;
import java.util.Scanner;

public class Operators 
{
	public static int prepostOperator(int choice,int userValue) 
	{
		int b=0;
	    if (choice==1)
		{
			b=++userValue;
			System.out.println("This is a pre incrememt operator");
			System.out.println("The value of the user input now is : " +userValue);
		}
		else if (choice==2) 
		{
			    b=--userValue;
				System.out.println("This is a pre decrement operator");
				System.out.println("The value of the user input now is  : " +userValue );
		 }
	     else if (choice==3) 
		{
				b=userValue++;
				System.out.println("This is a post incrememt operator");
				System.out.println("The value of the user input now is  : " +userValue );
		}
		else if (choice==4) 
		{
					
			b=userValue--;
			System.out.println("This is a post decrement operator");
			System.out.println("The value of the user input now is : " +userValue );	
					
		}
				
		else 
		{
			System.out.println("Incorrect Choise");
			b=userValue;
			//break;
		
	    }
    return b;
	}
		
	

	
		
	public static void main(String [] args) 
			
	{
		int choice;int userValue;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		
		userValue = sc.nextInt();
		
		System.out.println("Enter your choice from the following : ");
		System.out.println("For pre-increment 1");
		System.out.println("For pre-decrement 2");
		System.out.println("For post-increment 3");
		System.out.println("For post-decrement 4 ");
		
		
		choice = sc.nextInt();
		
		sc.close();
	
		int prepostValue=prepostOperator(choice,userValue);
		System.out.println("The pre/post assigned value is: " +prepostValue);
				
				
	}
}
			
		    


			
			
		    
			



