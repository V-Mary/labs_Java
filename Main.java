package ua.lviv.iot.lifts;

public class Main {

	public static void main(String[] args) {
		
		Lift izamet = new Lift();
		System.out.println(izamet);
		
		
		Lift huik = new Lift("Huik", "UK", 200, 60);
		System.out.println(huik);
		
		Lift pve = new Lift("PVE", "USA", 300, 200, 50, "red", "1 year", 20);
		System.out.println(pve);
		
		Lift.printStaticSpeed();
	}

}
