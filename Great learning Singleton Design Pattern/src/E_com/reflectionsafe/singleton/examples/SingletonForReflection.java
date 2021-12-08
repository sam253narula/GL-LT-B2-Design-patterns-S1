package E_com.reflectionsafe.singleton.examples;

/**
 *
 * @author Samarth Narula
 */

//Another way of using Eager Singleton class 
class SingletonForReflection {

	// public instance initialized when loading the class
	public static SingletonForReflection instance = new SingletonForReflection();

	private SingletonForReflection() {
		// private constructor
	}

}
