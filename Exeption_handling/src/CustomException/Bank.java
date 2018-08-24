package CustomException;

public class Bank {
	public  void invoke()
	{
		ATM a=new ATM();
		a.acceptMethod();
		a.verify();
	}

}
