package B_com.after.implementing.builder.example;

public class TvBuilder {
	
	private String brand;
	private String serviceProvider;
	
	public TvBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public TvBuilder setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }

    public Tv createTv() {
        return new Tv(brand, serviceProvider);
    }
}
