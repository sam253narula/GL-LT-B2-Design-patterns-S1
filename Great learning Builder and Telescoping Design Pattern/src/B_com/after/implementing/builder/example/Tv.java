package B_com.after.implementing.builder.example;

/**
*
* @author Samarth Narula
*/

public class Tv {

	private String brand;
	private String serviceProvider;

	public Tv(String brand, String serviceProvider) {
		super();
		this.brand = brand;
		this.serviceProvider = serviceProvider;
	}

	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", serviceProvider=" + serviceProvider + "]";
	}

}
