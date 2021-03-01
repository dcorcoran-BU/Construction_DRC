/**
 * This class is a mapping program for Apartments that specify if a
 * garage is available. 
 * @author Daniel
 *
 */
public class SingleFamilyHome extends Residential {
	//variable
	private boolean garage;
	//empty constructor
	public SingleFamilyHome() {
		super();
		garage = false;
	}
	//constructor with parameters
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,laundryRoom);
		this.garage = garage;
	}
	//returns in the form of a string
	public String displayData() {
		String s = "";
	    s += super.toString() + "\nGarage Available: " + ((garage == true) ? "Y" : "N");
	    return s;
	}
	//getter and setter
	public boolean getGarage() {
		return garage;
	}

	public void isGarage(boolean garage) {
		this.garage = garage;

	}
}
