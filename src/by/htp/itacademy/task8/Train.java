package by.htp.itacademy.task8;

public class Train {

	private String destination;
	private int number;
	private Date dt;

	public Train(String destination, int number, Date dt) {

		this.destination = destination;
		this.number = number;
		this.dt = dt;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", number=" + number + ", " + "dt=" + dt.getYear() + "/"
				+ dt.getMonth() + "/" + dt.getDay() + " " + dt.getHour() + ":" + dt.getMinute() + "]";
	}

}
