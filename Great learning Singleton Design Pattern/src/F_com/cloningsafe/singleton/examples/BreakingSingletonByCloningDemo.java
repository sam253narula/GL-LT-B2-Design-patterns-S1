package F_com.cloningsafe.singleton.examples;

/**
*
* @author Samarth Narula
*/

public class BreakingSingletonByCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonForCloning instance1 = SingletonForCloning.instance;
		SingletonForCloning instance2 = (SingletonForCloning) instance1.clone();
		System.out.println("instance1 hashCode:- " + instance1.hashCode());
		System.out.println("instance2 hashCode:- " + instance2.hashCode());
	}
}
