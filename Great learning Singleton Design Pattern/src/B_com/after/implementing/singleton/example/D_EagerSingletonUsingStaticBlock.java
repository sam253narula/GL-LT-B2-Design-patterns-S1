package B_com.after.implementing.singleton.example;

/**
*
* @author Samarth Narula
*/

public class D_EagerSingletonUsingStaticBlock {

	private D_EagerSingletonUsingStaticBlock() {
	}

	private static D_EagerSingletonUsingStaticBlock instance;
	
	// static block
	static {
		instance = new D_EagerSingletonUsingStaticBlock();
	}

	public static D_EagerSingletonUsingStaticBlock getInstance() {
		return instance;
	}
}
