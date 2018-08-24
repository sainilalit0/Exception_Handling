package Exapmle9;
import java.util.*;

public class Atm {

	public void Aplha() throws InterruptedException
	{
		
		System.out.println("\t connection 2 establish ");
		try
		{
		Scanner s=new Scanner(System.in);
		System.out.println("\t enter the A ");
		int a=s.nextInt();
		System.out.println("\t enter the B");
		int b=s.nextInt();
		
		int c=a/b;
		System.out.println(" REsult is==> "+c);
		
		}
		
		catch (Exception e)
		{
			//System.out.println("Some problem occured  rejected in ATM");
			throw new InterruptedException();
		}
		finally 
		{
			
			
			System.out.println(" \t=====connection 2 terminated");
		}
		
	}
}
