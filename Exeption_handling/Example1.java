import java.util.*;
public class Example1 {
public static void main(String[] args) {
	

	System.out.println(" Connection establish ");
	Scanner s =new Scanner(System.in);
	System.out.println("enter the a ");
	int a=s.nextInt();
	System.out.println("enter the b  ");
	int b=s.nextInt();
	int c=a/b;
	
	System.out.println(c);
	System.out.println("Connection terminated");
}
}
/* input a =10 b=0 
 Arithmeticexception divide by Zero*/