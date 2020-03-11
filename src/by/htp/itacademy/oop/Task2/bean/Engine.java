package by.htp.tasks.bean;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
//Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.  

public class Engine {

	private final int MILEAGE = 15;
	private int mileage;
	private boolean hasStarted = false;

	public Engine() {
		this.mileage = MILEAGE;

	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public boolean isHasStarted() {
		return hasStarted;
	}

	public void setHasStarted(boolean hasStarted) {
		this.hasStarted = hasStarted;
	}

	@Override
	public String toString() {
		return "Engine [MILEAGE=" + MILEAGE + ", mileage=" + mileage + ", hasStarted=" + hasStarted + "]";
	}

	
}