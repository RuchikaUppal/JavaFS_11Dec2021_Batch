package FSJTestPakage;
import java.util.Scanner;

public class PermutationCombination {
	
	 public static void main(String[] args)
	   {
	      int n, r; 
	      float ncr, npr;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the Value of n: ");
	      n = sc.nextInt();
	      System.out.print("Enter the Value of r: ");
	      r = sc.nextInt();
	      sc.close();
	      
	      npr = fact(n) / (fact(n-r));
	      ncr = fact(n)/(fact(r)*fact(n-r));
	      
	      System.out.println("nCr = " +ncr);
	      System.out.println("nPr = " +npr);
	   }
	 
	   public static float fact(int num)
	   {
	      float fact=1;
	      for(int i=1; i<=num; i++)
	         fact= fact* i;
	      return fact;
	   }
	}


