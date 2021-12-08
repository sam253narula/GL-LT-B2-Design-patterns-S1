package C_com.anotherway.example.covered;

public class Car {

	public Car(CarBuilder carBuilder) {
		this.tyre = carBuilder.tyre;
		this.steering = carBuilder.steering;
		this.engine = carBuilder.engine;
		this.seat = carBuilder.seat;
		
		this.hasAc = carBuilder.hasAc;
		this.hasSeatCover =carBuilder.hasSeatCover;
		this.speakers= carBuilder.speakers;;
	}

//Mandatory attributes
	private String tyre;
	private String steering;
	private String engine;
	private String seat;

//Optional attributes
	private String speakers;
	private boolean hasAc;
	private boolean hasSeatCover;

// Creating nested static Builder class
	public static class CarBuilder {
		private String tyre;
		private String steering;
		private String engine;
		private String seat;

		// Optional attributes
		private String speakers;
		private boolean hasAc;
		private boolean hasSeatCover;

		// Constructor for Mandatory attributes
		public CarBuilder(String tyre, String steering, String engine, String seat) {
			this.tyre = tyre;
			this.steering = steering;
			this.engine = engine;
			this.seat = seat;
		}

		// Setters for Optional attributes
		public CarBuilder setSpeakers(String speakers) {
			this.speakers = speakers;
			return this;
		}

		public CarBuilder setHasAc(boolean hasAc) {
			this.hasAc = hasAc;
			return this;
		}

		public CarBuilder setHasSeatCover(boolean hasSeatCover) {
			this.hasSeatCover = hasSeatCover;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getSpeakers() {
		return speakers;
	}

	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}

	public boolean isHasAc() {
		return hasAc;
	}

	public void setHasAc(boolean hasAc) {
		this.hasAc = hasAc;
	}

	public boolean isHasSeatCover() {
		return hasSeatCover;
	}

	public void setHasSeatCover(boolean hasSeatCover) {
		this.hasSeatCover = hasSeatCover;
	}

	@Override
	public String toString() {
		return "Car [tyre=" + tyre + ", steering=" + steering + ", engine=" + engine + ", seat=" + seat + ", speakers="
				+ speakers + ", hasAc=" + hasAc + ", hasSeatCover=" + hasSeatCover + "]";
	}

}
