package B_com.after.implementing.builder.example;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Samarth Narula
 * 3! = 3*2*1 = 6
 */
public class Bedroom {

	private Dimension dimensions;
	private int ceilingHeight;
	private int floorNumber;
	private Color wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private boolean hasEnsuite;
	private int buidingNumber;
	private Tv tv;

	@Override
	public String toString() {
		return "Bedroom [dimensions=" + dimensions + ", ceilingHeight=" + ceilingHeight + ", floorNumber=" + floorNumber
				+ ", wallColor=" + wallColor + ", numberOfWindows=" + numberOfWindows + ", numberOfDoors="
				+ numberOfDoors + ", hasEnsuite=" + hasEnsuite + ", buidingNumber=" + buidingNumber + ", tv=" + tv
				+ "]";
	}

	public Bedroom() {

	}

	public String toStringForTelescopingPattern() {
		return "Bedroom [dimensions=" + dimensions + ", ceilingHeight=" + ceilingHeight + ", floorNumber=" + floorNumber
				+ "]";
	}

	public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber) {
		this.dimensions = dimensions;
		this.ceilingHeight = ceilingHeight;
		this.floorNumber = floorNumber;
	}

	// Telescoping Pattern
	public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows,
			int numberOfDoors, boolean hasEnsuite ) {
		this.dimensions = dimensions;
		this.ceilingHeight = ceilingHeight;
		this.floorNumber = floorNumber;
		this.wallColor = wallColor;
		this.numberOfWindows = numberOfWindows;
		this.numberOfDoors = numberOfDoors;
		this.hasEnsuite = hasEnsuite;
	}
	
	//Bedroom with Tv Constructor
	public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows,
			int numberOfDoors, boolean hasEnsuite,Tv tv) {
		this.dimensions = dimensions;
		this.ceilingHeight = ceilingHeight;
		this.floorNumber = floorNumber;
		this.wallColor = wallColor;
		this.numberOfWindows = numberOfWindows;
		this.numberOfDoors = numberOfDoors;
		this.hasEnsuite = hasEnsuite;
		this.tv= tv;
	}
	
	
	public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows,
			int numberOfDoors, boolean hasEnsuite, int buidingNumber) {
		this.dimensions = dimensions;
		this.ceilingHeight = ceilingHeight;
		this.floorNumber = floorNumber;
		this.wallColor = wallColor;
		this.numberOfWindows = numberOfWindows;
		this.numberOfDoors = numberOfDoors;
		this.hasEnsuite = hasEnsuite;
		this.buidingNumber = buidingNumber;
	}

	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}

	public void setCeilingHeight(int ceilingHeight) {
		this.ceilingHeight = ceilingHeight;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public void setWallColor(Color wallColor) {
		this.wallColor = wallColor;
	}

	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void setHasEnsuite(boolean hasEnsuite) {
		this.hasEnsuite = hasEnsuite;
	}

}
