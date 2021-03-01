/**
 * This class is a mapping program for Apartments that specify the
 * number of rentable units.
 * @author Daniel
 *
 */
public class Business extends Building {
	//variables
	protected int numRentableUnits;
	//empty constructor
	public Business() {
		super();
		numRentableUnits = 0;
	}
	//constructor with parameters
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}
	//returns in the form of a string
	public String toString() {
		return super.displayData() + "\nNumber of Rentable Units: " + numRentableUnits;
	}
	//getters and setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
}
