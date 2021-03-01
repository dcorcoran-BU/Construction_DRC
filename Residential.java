/**
 * This class is a mapping program for Apartments that specify the
 * number of bedrooms and bathrooms, and if there is a laundry room.
 * @author Daniel
 *
 */
public class Residential extends Building {
	//variables
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	//empty constructor
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}
	//constructor with parameters
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}
	//returns in the form of a string
	public String toString() {
		return super.displayData() + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms + "\nLaundry Room: " + ((laundryRoom == true)? "Y" : "N");
	}
	//getters and setters
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
	    this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
	    return numBathrooms;
	}
	
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	 
	public boolean isLaundryRoom() {
	    return laundryRoom;
	}
	 
	public void setLaundryRoom(boolean laundryRoom) {
	    this.laundryRoom = laundryRoom;
	}   	
}
