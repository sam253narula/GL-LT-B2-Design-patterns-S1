package C_com.threadsafe.singleton.example;

/**
 *
 * @author Samarth Narula
 */

// How multi-threading breaks Singleton and how to make a thread safe singleton class
public class Printer {

//	private static Printer printer;

	private static boolean initialized = false;

	private Printer() {
	}

	private void print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

// Single check locking, slows the performance
//	public static synchronized  Printer getInstance() throws InterruptedException {
//
//		if (initialized)
//			return printer;
//		
//		Thread.sleep(2000);
//		printer = new Printer();
//		printer.print();
//		initialized = true;
//		return printer;
//
//	}

	// Double check locking, it has faster performance when compared with Single check locking pattern
	/*
	 * One thing to keep in mind with this double check locking is that the printer
	 * field needs to be volatile to prevent cache incoherence issues. In fact, the
	 * Java memory model allows the publication of partially initialized objects and
	 * this may lead in turn to subtle bugs.
	 */
	private static volatile Printer printer;

	public static Printer getInstance() throws InterruptedException {

		if (printer == null) {
			synchronized (Printer.class) {
				if (printer == null) {
					printer = new Printer();
					printer.print();
				}
			}
		}
		return printer;
	}

}
