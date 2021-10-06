public class Car {
	private String make, model;
	private double fuel, mpg, odo;

	public Car(String make, String model, double mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String toString() {
		return String.format("Make: %s%nModel: %s%nMPG: %s%nOdometer: %s%nGas Level: %s%n", make, model, mpg, odo, fuel);
	}

	public double getGasLevel() {
		return fuel;
	}

	public double getMPG() {
		return mpg;
	}

	public double getOdometer() {
		return odo;
	}

	public void addGas(double fuel) {
		this.fuel += fuel;
	}

	public void drive(double miles) {
		this.fuel -= miles / mpg;
		this.odo += miles;
	}
}
