package by.htp.tasks.bean;

public class Car {

	private String carName;
	private int fuel;
	private int maxfuel;

	private Engine engine;

	private Wheel frontRight;
	private Wheel frontLeft;
	private Wheel rearRight;
	private Wheel rearLeft;

	public Car(String name, int fuel, int maxfuel) {
		this.carName = name;
		this.fuel = fuel;
		this.maxfuel = maxfuel;
		
		this.engine = new Engine();
		this.frontRight = new Wheel();
		this.frontLeft = new Wheel();
		this.rearRight = new Wheel();
		this.rearLeft = new Wheel();

	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getFrontRight() {
		return frontRight;
	}

	public void setFrontRight(Wheel frontRight) {
		this.frontRight = frontRight;
	}

	public Wheel getFrontLeft() {
		return frontLeft;
	}

	public void setFrontLeft(Wheel frontLeft) {
		this.frontLeft = frontLeft;
	}

	public Wheel getRearRight() {
		return rearRight;
	}

	public void setRearRight(Wheel rearRight) {
		this.rearRight = rearRight;
	}

	public Wheel getRearLeft() {
		return rearLeft;
	}

	public void setRearLeft(Wheel rearLeft) {
		this.rearLeft = rearLeft;
	}

	public int getMaxfuel() {
		return maxfuel;
	}

	public void setMaxfuel(int maxfuel) {
		this.maxfuel = maxfuel;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", fuel=" + fuel + ", maxfuel=" + maxfuel + ", engine=" + engine
				+ ", frontRight=" + frontRight + ", frontLeft=" + frontLeft + ", rearRight=" + rearRight + ", rearLeft="
				+ rearLeft + "]";
	}

	
}
