package Example11Ducking;

public class Case3b extends RuntimeException  {

	public static void main(String[] args) {
		throw new Case3b();
	}
}
//Exception in thread "main" Example11Ducking.Case3b
//at Example11Ducking.Case3b.main(Case3b.java:6)
