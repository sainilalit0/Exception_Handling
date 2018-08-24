package Example10;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		
		try {
			throw new Exception();
		}
		finally{
			System.out.println(" ThisIsDuckingException");
		}
	}

}
