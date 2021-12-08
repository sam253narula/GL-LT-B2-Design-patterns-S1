package F_com.cloningsafe.singleton.examples;

/**
 *
 * @author Samarth Narula
 */

public class TestOfSingletonSafeFromCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonSafeFromCloning instance1 = SingletonSafeFromCloning.instance;
		SingletonSafeFromCloning instance2 = (SingletonSafeFromCloning) instance1.clone();
		System.out.println("instance1 hashCode:- " + instance1.hashCode());
		System.out.println("instance2 hashCode:- " + instance2.hashCode());
	}
}
