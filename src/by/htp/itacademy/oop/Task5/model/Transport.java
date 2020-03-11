package by.training.tasks.aliv.oop.Task5.model;

public enum Transport {

	AIR(1), BUS(2), RAILS(3), CAR(4), SHIP(5);
	
	private final int transportCode;

	private Transport(int transportCode) {
		this.transportCode = transportCode;
	}

	public int getTransportCode() {
		return transportCode;
	}
	





}