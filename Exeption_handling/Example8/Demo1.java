package Example8;
import java.util.*;
public class Demo1 {
	
	public void Alpha()
	{
		try 
		{
		System.out.println("\t connection 4 is establish ");
		Scanner  s=new Scanner(System.in);
		System.out.println(" \t enter the A");
		int a=s.nextInt();
		System.out.println("\t enter the B");
		int b=s.nextInt();
		int c=a/b;
		System.out.println("\t result is " +c);
		}
		catch(Exception e)
		{
			System.out.println(" Please enter valid b ");
		}
		System.out.println(" \t connection 4 is terminated ");
	}

}
