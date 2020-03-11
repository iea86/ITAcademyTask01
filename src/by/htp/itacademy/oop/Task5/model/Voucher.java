package by.training.tasks.aliv.oop.Task5.model;

public class Voucher implements Comparable<Voucher>{

	private Type type;
	private Transport transport;
	private Meal meal;
	private Duration duration;
	private int price;

	public Voucher(Type type, Transport transport, Meal meal, Duration duration,int price) {

		this.type = type;
		this.transport = transport;
		this.meal = meal;
		this.duration = duration;
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voucher other = (Voucher) obj;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voucher [type=" + type + ", transport=" + transport + ", meal=" + meal + ", duration=" + duration
				+ ", price=" + price + "]";
	}
	
	
	@Override
	public int compareTo(Voucher o) {
		return (int) (this.getPrice()-o.getPrice());
	}

	
	

}