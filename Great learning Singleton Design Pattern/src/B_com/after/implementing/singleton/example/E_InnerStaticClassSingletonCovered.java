package B_com.after.implementing.singleton.example;
/**
*
* @author Samarth Narula
*/

// nested static class --> Bill Pugh Singleton Implementation : Thread Safe and Lazy Loaded
public class E_InnerStaticClassSingletonCovered {

	private E_InnerStaticClassSingletonCovered(){}
	
	private static class SigletonCreator{
		private static final E_InnerStaticClassSingletonCovered instance = new E_InnerStaticClassSingletonCovered();
	}
	
	public static E_InnerStaticClassSingletonCovered getInstance() {
		return SigletonCreator.instance;
	}
	
}
