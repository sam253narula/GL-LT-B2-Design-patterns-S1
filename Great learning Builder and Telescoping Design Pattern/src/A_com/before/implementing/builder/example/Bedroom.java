package A_com.before.implementing.builder.example;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Samarth Narula
 */
public class Bedroom {  
    
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private boolean hasEnsuite;
    
    @Override
	public String toString() {
		return "Bedroom [dimensions=" + dimensions + ", ceilingHeight=" + ceilingHeight + ", floorNumber=" + floorNumber
				+ ", wallColor=" + wallColor + ", numberOfWindows=" + numberOfWindows + ", numberOfDoors="
				+", hasEnsuite=" + hasEnsuite + "]";
	}

	public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean hasEnsuite){
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.hasEnsuite = hasEnsuite;        
    }
	
//	public Bedroom(Dimension dimensions,  int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors){
//        this.dimensions = dimensions;
//        this.floorNumber = floorNumber;
//        this.wallColor = wallColor;
//        this.numberOfWindows = numberOfWindows;
//    }
    
}
