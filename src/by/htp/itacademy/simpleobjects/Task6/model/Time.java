package by.training.tasks.aliv.simpleobjects.Task6.model;

//6. Составьте описание класса для представления времени. 
//Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) 
//с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле 
//устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Time {
	private int hour;
	private int minute;
	private int seconds;

	public Time(int hour, int minute, int seconds) {

		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", seconds=" + seconds + "]";
	}

}
