package B_com.after.implementing.singleton.example;

/**
*
* @author Samarth Narula
* Lazy Singleton using null check
*/

public class B_LazyInstantiationPrinterUsingNullCheck {

	private B_LazyInstantiationPrinterUsingNullCheck() {
	}

	private static B_LazyInstantiationPrinterUsingNullCheck instance;

	public static B_LazyInstantiationPrinterUsingNullCheck getInstance() {
		if (instance == null) {
			instance = new B_LazyInstantiationPrinterUsingNullCheck();
		}
		return instance;
	}

}
