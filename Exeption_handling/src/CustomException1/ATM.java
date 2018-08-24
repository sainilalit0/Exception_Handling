package CustomException1;

import java.util.Scanner;

public class ATM {
	int ACNO=999;
	int PWD=1234;
	int un,up;
	public void acceptInput()
	{
		Scanner s=new Scanner("Sytem.in");
		System.out.println(" enter userr account number");
		un=s.nextInt();
		System.out.println(" enter the user pwd");
		up=s.nextInt();
		
	}
	public void verify()
	{
		if(un==ACNO && up==PWD)
		{
			System.out.println(" take your cash ");
		}
		else
		{
			invalidCustomerException ice=new invalidCustomerException();
			try {
				System.out.println(ice.getMessage());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			throw ice;
		
		}
	}

}
