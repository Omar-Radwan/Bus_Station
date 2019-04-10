package classes;

import vehicles.classes.Vehicle;

public class Trip {

	/*
	 * Attributes
	 */

	Vehicle vehilce;
	String source;
	String destination;

	double distance;

	String type;
	int numberOfStops;

	Date date;
	Time time;

	double price;

	static int firstFreeNumber = 0;
	int number;


	/*
	 * Constructor
	 */

	public Trip(Vehicle vehicle, String source, String destination, double distance, String type, int numberOfStops,
			Date date, Time time, double price) {
		super();
		this.vehilce = vehicle;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.type = type;
		this.numberOfStops = numberOfStops;
		this.date = date;
		this.time = time;
		this.price = price;
		changeFreeNumbers();
		this.number = firstFreeNumber;
	}

	/*
	 * Getters And Setters
	 */

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return number+" "+vehilce.getNumber() + " " + source + " " + destination + " " + distance + " " + type + " " + numberOfStops + " "
				+ date + " " + time + " " + price + " ";
	}

	public String data() {
		return ".Vehicle: " + vehilce + "\nSource: " + source + "\nDestination: " + destination + "\nDistance: "
				+ distance + "\nType: " + type + "\nNumberOfStops: " + numberOfStops + "\nDate: " + date + "\nTime: "
				+ time;
	}

	public Vehicle getVehilce() {
		return vehilce;
	}

	public void setVehilce(Vehicle vehilce) {
		this.vehilce = vehilce;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfStops() {
		return numberOfStops;
	}

	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}

	 public static int getFirstFreeNumber() {
		return firstFreeNumber;
	}

	public static void setFirstFreeNumber(int firstFreeNumber) {
		Trip.firstFreeNumber = firstFreeNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}



	/*
	 * toString uses " " as delimiter
	 */

	/*
	 * Behavior
	 */

	public void AvailableTrips() {

	}
	
	static void changeFreeNumbers() {
		firstFreeNumber++;
	}


}
