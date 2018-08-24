package CustomException;

import java.util.Scanner;

public class ATM {
	int AcNo=999;
	int Pwd=1234;
	int un,up;
	public void acceptMethod() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter Account number ");
		un=s.nextInt();					
		System.out.println(" enter password");
		up=s.nextInt();
	}
	public void verify()
	{
		if(un==AcNo && up==Pwd)
		{
			System.out.println(" collect your cash00");
		}
		else
		{
			System.out.println("invalid password");
		}
	}

}
