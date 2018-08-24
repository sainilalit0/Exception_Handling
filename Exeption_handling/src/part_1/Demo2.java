package part_1;
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		System.out.println(" establish connection ");
		try {
			int a,b,c;
			Scanner s=new Scanner(System.in);
			System.out.println(" enter the numarator ");
			a=s.nextInt();
			System.out.println( "enter the dinominator");
			b=s.nextInt();
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ar )
		{
			ar.printStackTrace();
		}
		System.out.println(" connecction terminate");
	}

}
