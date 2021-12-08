package F_com.cloningsafe.singleton.examples;

/**
*
* @author Samarth Narula
*/

public class SingletonSafeFromCloning extends SuperClass {

	// public instance initialized when loading the class
	public static SingletonSafeFromCloning instance = new SingletonSafeFromCloning();

	private SingletonSafeFromCloning() {
		// private constructor
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
