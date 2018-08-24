package CustomException1;


public class BANK {
	public void invoke()
	{
		ATM atm=new ATM();
		try {
			atm.acceptInput();
			atm.verify();
			
		}
		catch(Exception e1)
		{
			try {
				atm.acceptInput();
				atm.verify();
			}
			catch(Exception e2)
			{
				try {
					atm.acceptInput();
					atm.verify();
				}
				catch(Exception e3)
				{
					System.out.println(" card is block for the day try after 24 hrs");
					System.exit(0);
				}
			}
		}
	}


}
