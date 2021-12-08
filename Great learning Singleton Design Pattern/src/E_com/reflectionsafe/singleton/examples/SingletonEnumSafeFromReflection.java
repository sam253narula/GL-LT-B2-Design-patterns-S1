package E_com.reflectionsafe.singleton.examples;

/** 
 As enums don’t have any constructor so it is not possible for Reflection to utilize it. 
Enums have their own by-default constructor which we can’t invoke by ourself. 
JVM only handles the creation and invocation of enum constructors internally. 
As enums don’t provide their constructor definition to our program,
it is not possible for us to access them by Reflection.
Hence, reflection can’t break singleton property in case of enums.
 */

/**
 *
 * @author Samarth Narula
 */

//Enum type singleton
public enum SingletonEnumSafeFromReflection {

	INSTANCE;
}
