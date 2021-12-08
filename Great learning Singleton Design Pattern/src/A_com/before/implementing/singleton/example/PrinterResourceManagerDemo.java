package A_com.before.implementing.singleton.example;

import B_com.after.implementing.singleton.example.C_EagerInstantiationPrinter;

/**
 *
 * @author Samarth Narula
 */

public class PrinterResourceManagerDemo {

	public static void main(String[] args) {
		Printer p1 = new Printer();
		Printer p2 = new Printer();
		System.out.println("p1 "+p1.hashCode());
		System.out.println("p2 "+ p2.hashCode());
		
		p1.print();


	}

}
