package D_com.serializationsafe.singleton.example;

import java.io.Serializable;

/**
 *
 * @author Samarth Narula
 */

public class SingletonForSerialization implements Serializable {

	private static final long serialVersionUID = 1L;
	// public instance initialized when loading the class
	public static SingletonForSerialization instance = new SingletonForSerialization();

	private SingletonForSerialization() {
		// private constructor
	}
}
