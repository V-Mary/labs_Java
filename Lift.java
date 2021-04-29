package ua.lviv.iot.lifts;

public class Lift {
	private String name;
	private String country;
	private int liftingHeight;
	private int loadCapacity;
	private int powerConsumption;
	
	private static int speed;
	
	public String color;

	protected String guarantee;
	protected int floorArea;

	
	public Lift(String name, String country, int liftingHeight, int loadCapacity, int powerConsumption, String color, String guarantee, int floorArea) {
		resetValues(name, country, liftingHeight, loadCapacity, powerConsumption, color, guarantee, floorArea);
	}

	
	public Lift(String name, String country, int liftingHeight, int loadCapacity) {
		this.name = name;
		this.country = country;
		this.liftingHeight = liftingHeight;
		this.loadCapacity = loadCapacity;
	}

	
	public Lift() {
		this(null, null, 0, 0, 0, null, null, 0);
	}

	
	public void resetValues(String name, String country, int liftingHeight, int loadCapacity, int powerConsumption,
			String color, String guarantee, int floorArea) {
		this.name = name;
		this.country = country;
		this.liftingHeight = liftingHeight;
		this.loadCapacity = loadCapacity;
		this.powerConsumption = powerConsumption;
		this.color = color;
		this.guarantee = guarantee;
		this.floorArea = floorArea;
	}

	public static void printStaticSpeed() {
		System.out.println(speed);
	}
	
	public void printSpeed(){
		System.out.println(speed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getLiftingHeight() {
		return liftingHeight;
	}

	public void setLiftingHeight(int liftingHeight) {
		this.liftingHeight = liftingHeight;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public int getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(int floorArea) {
		this.floorArea = floorArea;
	}

	@Override
	public String toString() {
		return "Lift [getName()=" + getName() + ", getCountry()=" + getCountry() + ", getLiftingHeight()="
				+ getLiftingHeight() + ", getLoadCapacity()=" + getLoadCapacity() + ", getPowerConsumption()="
				+ getPowerConsumption() + ", getColor()=" + getColor() + ", getGuarantee()=" + getGuarantee()
				+ ", getFloorArea()=" + getFloorArea() + "]";
	}

}
