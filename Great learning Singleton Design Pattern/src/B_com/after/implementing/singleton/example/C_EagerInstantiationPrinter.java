package B_com.after.implementing.singleton.example;

/**
 *
 * @author Samarth Narula
 */
//Eager Singleton
public class C_EagerInstantiationPrinter {

	private static C_EagerInstantiationPrinter instance = new C_EagerInstantiationPrinter();

	private C_EagerInstantiationPrinter() {
		System.out.println("EagerInstantiationSingleton being initialized");
	}

	public void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static C_EagerInstantiationPrinter getInstance() {
		return instance;
	}
}
