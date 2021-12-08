package B_com.after.implementing.singleton.example;

/**
 *
 * @author Samarth Narula
 */

public class PrinterResourceManagerDemo {

	public static void main(String[] args) throws InterruptedException {

//		A_LazyInstantiationPrinterUsingBooleanCheck lpb1 = A_LazyInstantiationPrinterUsingBooleanCheck.getInstance();
//		A_LazyInstantiationPrinterUsingBooleanCheck lpb2 = A_LazyInstantiationPrinterUsingBooleanCheck.getInstance();
//		System.out.println(lpb1 == lpb2);
		
//		B_LazyInstantiationPrinterUsingNullCheck lpn1 = B_LazyInstantiationPrinterUsingNullCheck.getInstance();
//		B_LazyInstantiationPrinterUsingNullCheck lpn2 = B_LazyInstantiationPrinterUsingNullCheck.getInstance();
//		
//		System.out.println(lpn1 == lpn2);

		C_EagerInstantiationPrinter ep1 = C_EagerInstantiationPrinter.getInstance();
		C_EagerInstantiationPrinter ep2 = C_EagerInstantiationPrinter.getInstance();
		System.out.println(ep1 ==ep2);
		
//		D_EagerSingletonUsingStaticBlock epsb = D_EagerSingletonUsingStaticBlock.getInstance();
//		D_EagerSingletonUsingStaticBlock epsb2 = D_EagerSingletonUsingStaticBlock.getInstance();
		
//		E_InnerStaticClassSingleton isc1 = E_InnerStaticClassSingleton.getInstance();
//		E_InnerStaticClassSingleton isc2 = E_InnerStaticClassSingleton.getInstance();
		
		
	}

}
