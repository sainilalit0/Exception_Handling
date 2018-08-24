package part_1;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println(" estabish Connection");
		try {
			int a,b,c;
			Scanner s=new Scanner(System.in);
			System.out.println(" enter numarator");
			a=s.nextInt();
			System.out.println(" enter dinominator");
			b=s.nextInt();
			c=a/b;
			System.out.println(c);
			System.out.println(" enter the size of array");
			int size=s.nextInt();
			int arr[]=new int[size];
			System.out.println(" enter the position to be insert elemenets");
			int ele=s.nextInt();
			int x=s.nextInt();
			arr[x]=ele;
			System.out.println(" element inserted");
		}
		catch(ArithmeticException ar)
		{
			ar.printStackTrace();
		}
		catch(NegativeArraySizeException ng)
		{
			ng.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
			ie.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(" some problem occured");
		}
	}

}
