package CUSTOMEXCEPTION_RTO_EXAMPLE;

public class RTO {
	public void Select()
	{
		User u=new User();
		
		try
		{
			u.AcceptAge();
			u.VerifyAge();
		}
			catch(Exception e1)
			{
				try 
				{
					u.AcceptAge();
					u.VerifyAge();
				}
					catch(Exception e2)
					{
						try
						{
							u.AcceptAge();
							u.VerifyAge();
						}
						catch(Exception e3)
						{
							System.out.println(" Your application request is block try after some time ");
							System.exit(0);
						}
					}
			}
	}

}
