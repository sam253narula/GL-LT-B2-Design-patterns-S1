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

public class TestOfSingletonSafeFormSerializationDemo  {

	public static void main(String[] args) {
		try {
			SingletonSafeFromSerialization instance1 = SingletonSafeFromSerialization.instance;
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance1);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

			SingletonSafeFromSerialization instance2 = (SingletonSafeFromSerialization) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
