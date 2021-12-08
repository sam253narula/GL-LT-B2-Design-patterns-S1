package D_com.serializationsafe.singleton.example;

import java.io.Serializable;

/**
*
* @author Samarth Narula
*/

public class SingletonSafeFromSerialization implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// public instance initialized when loading the class 
    public static SingletonSafeFromSerialization instance = new SingletonSafeFromSerialization(); 
      
    private SingletonSafeFromSerialization()  
    { 
        // private constructor 
    } 
      
    // implement readResolve method 
    protected Object readResolve() 
    { 
        return instance; 
    }
}
