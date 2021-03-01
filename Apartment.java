/**
 * This class is a mapping program for Apartments that specify the 
 * number of rentable units, the average size of the unit and if parking
 * is available.
 * @author Daniel
 *
 */
public class Apartment extends Residential {
	//variables
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	//empty constructor
	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = false;
	}
	//constructor with parameters
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvaliable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvaliable;
	}
	//returns in the form of a string
	public String displayData() {
	      String s = "";
	      s += super.toString() + "\nNumber of Rentable Units: " + numRentableUnits + "\nAverage Unit Size: " + avgUnitSize + "\nParking Available: " + ((parkingAvailable == true) ? "Y" : "N");
	      return s;
	}
	//getters and setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvaliable() {
		return parkingAvailable;
	}

	public void setParkingAvaliable(boolean parkingAvaliable) {
		this.parkingAvailable = parkingAvaliable;
	}
}
