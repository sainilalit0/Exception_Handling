package CUSTOMEXCEPTIONcase1a;



public class Bank {
	public void Initate()
	{
		ATM a=new ATM();
		try
		{
		
		a.AcceptInput();
		a.Verify();
		}
			
		catch(Exception e1)
		{
			try {
				a.AcceptInput();
				a.Verify();
				
				}
			catch( Exception e2)
			{
				try {
					a.AcceptInput();
					a.Verify();
				}
				catch(Exception e3)
				{
					System.out.println(" Card IS block");
					System.exit(0);
				}
			}
		}
		}

}
