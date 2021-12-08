package C_com.threadsafe.singleton.example;

/**
 *
 * @author Samarth Narula
 */

public class PrinterResourceManager {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			try {
				Printer p1 = Printer.getInstance();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				Printer p2 = Printer.getInstance();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();

	}

}
