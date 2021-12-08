package B_com.after.implementing.builder.example;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Samarth Narula
 */

public class BedroomBuilder {

	private Dimension dimensions;
	private int ceilingHeight;
	private int floorNumber;
	private Color wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private boolean hasEnsuite;
	private Tv tv;

	public BedroomBuilder() {
	}

	public BedroomBuilder setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
		return this;
	}

	public BedroomBuilder setCeilingHeight(int ceilingHeight) {
		this.ceilingHeight = ceilingHeight;
		return this;
	}

	public BedroomBuilder setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
		return this;
	}

	public BedroomBuilder setWallColor(Color wallColor) {
		this.wallColor = wallColor;
		return this;
	}

	public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
		return this;
	}

	public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		return this;
	}

	public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
		this.hasEnsuite = hasEnsuite;
		return this;
	}

	public BedroomBuilder setTv(Tv tv) {
		this.tv = tv;
		return this;
	}

	public Bedroom createBedroom() {
		return new Bedroom(dimensions, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors,
				hasEnsuite, tv);
	}

}
