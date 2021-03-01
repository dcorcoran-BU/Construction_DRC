/**
 * This is a mapping program for all of the various projects:
 * Building, Business, Residential, Mall, Apartment, and SingleFamilyHome.
 * @author Daniel
 */
public class Application {
	
//this is implementing all the classes we have made and formating them.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------");
		Building b = new Building();
		b.draw();
		System.out.println(b.displayData());
		System.out.println("---------------------------------------------");
		Business bb = new Business();
		bb.draw();
		System.out.println(bb.toString());
		System.out.println("---------------------------------------------");
		Residential r = new Residential();
		r.draw();
		System.out.println(r.toString());
		System.out.println("---------------------------------------------");
		Mall m = new Mall();
		m.draw();
		System.out.println(m.displayData());
		System.out.println("---------------------------------------------");
		Apartment a = new Apartment();
		a.draw();
		System.out.println(m.toString());
		System.out.println("---------------------------------------------");
		SingleFamilyHome s = new SingleFamilyHome();
		s.draw();
		System.out.println(s.displayData());
		System.out.println("---------------------------------------------");
	}

}
