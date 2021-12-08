package B_com.after.implementing.singleton.example;

/**
 *
 * @author Samarth Narula
 * Lazy Singleton using boolean check
 */

public class A_LazyInstantiationPrinterUsingBooleanCheck {

	private static A_LazyInstantiationPrinterUsingBooleanCheck instance;

	private static boolean initialized = false;

	private A_LazyInstantiationPrinterUsingBooleanCheck() {
	}

	private void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static A_LazyInstantiationPrinterUsingBooleanCheck getInstance() throws InterruptedException {

		if (initialized)
		{	
			return instance;
		}
		instance = new A_LazyInstantiationPrinterUsingBooleanCheck();
		instance.print();
		initialized = true;
		return instance;

	}

}
