package CUSTOMEXCEPTIONCASE1;
import java.util.*;
public class ATM {
	int AcNO=9999, Pwd=1234, U_An,U_Pwd;
	public void AcceptInput()
	{
		Scanner s =new Scanner(System.in);
		System.out.println(" enter the Acoount Number ");
		U_An=s.nextInt();
		System.out.println("enter the Password ");
		U_Pwd=s.nextInt();
		
	}
	public void Verify()
	{
		if(U_An==AcNO && U_Pwd==Pwd)
		{
			System.out.println("collect Your Money");
		}
		else 
		{
			System.out.println(" Invalid Password ......!!!!!!!!!");
		}
	}

}
