package CUSTOMEXCEPTION_RTO_EXAMPLE;
import java.util.*;
public class User {
	 int Age;


	public void AcceptAge()
	{
		Scanner s=new Scanner(System.in);
		System.out.println(" enter User your age  ");
			Age=s.nextInt();
				
	}

	public void  VerifyAge() throws Exception
	{
		if(Age<18)
		{
		 UnderAgeException uae=new UnderAgeException();
		System.out.println(uae.getMessage());
		throw uae;
		}
		else if(Age>65)
		{
			OverAgeException oae=new  OverAgeException();
	    System.out.println(oae.getMessage());
					throw oae;
			
			
		}
		else
		{
			System.out.println(" Are you elligible for driving licence ");
		}
	}
}
