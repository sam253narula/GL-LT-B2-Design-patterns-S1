package D_com.serializationsafe.singleton.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
*
* @author Samarth Narula
*/

//Demonstration of breaking Singleton Pattern by implementing Serialization
public class BreakingSingletonBySerializationDemo {

	public static void main(String[] args) {
		try {
			SingletonForSerialization instance1 = SingletonForSerialization.instance;
			// Serializing our singleton object to convert an object of byte stream and save
			// in a file
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance1);
			out.close();

			// Deserailizing from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

			SingletonForSerialization instance2 = (SingletonForSerialization) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
