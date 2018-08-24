import java.util.Scanner;


public class Example2 {
	public static void main(String[] args) {
		

		System.out.println(" Connection establish ");
		try
		{
		Scanner s =new Scanner(System.in);
		System.out.println("enter the numarator ");
		int a=s.nextInt();
		System.out.println("enter the dinominator  ");
		int b=s.nextInt();
		int c=a/b;
		
		System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println(" please enter valid dinominator");
			System.out.println("ArithmeticExceptionDivideByzero");
		}
		System.out.println("Connection terminated");
	}

}
