package E_com.reflectionsafe.singleton.examples;

import java.lang.reflect.Constructor;

/**
 *
 * @author Samarth Narula
 */

//Below is the code to demonstrate how reflection can destroy singleton property of singleton class.
public class BreakingSingletonByReflectionDemo {

	public static void main(String[] args) {
		SingletonForReflection instance1 = SingletonForReflection.instance;
		SingletonForReflection instance2 = null;
		try {
			Constructor[] constructors = SingletonForReflection.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (SingletonForReflection) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		System.out.println("instance2.hashCode():- " + instance2.hashCode());
	}
}
