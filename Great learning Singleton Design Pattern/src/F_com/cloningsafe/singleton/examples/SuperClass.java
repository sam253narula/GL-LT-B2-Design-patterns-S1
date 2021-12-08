package F_com.cloningsafe.singleton.examples;

/**
 *
 * @author Samarth Narula
 */

class SuperClass implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}