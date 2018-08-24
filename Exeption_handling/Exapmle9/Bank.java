package Exapmle9;

public class Bank {
	public static void main(String[] args) {
		
		System.out.println(" connection 1 establish ");
		try
		{
		Atm a=new Atm();
		a.Aplha();
		}
		catch (Exception e)
		{
			System.out.println(" issued reached in bank ");
		}
		System.out.println(" connection 1 terminated ");
	}
	

}
