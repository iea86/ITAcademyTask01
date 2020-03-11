package by.htp.tasks.bean;

public class Wheel {

	private final int RADIUS = 15;
	private int radius;

	public Wheel() {
		this.radius = RADIUS;
	}

	public Wheel(int radius) {
		if (radius < 14 || radius > 32) {
			throw new IllegalArgumentException("Размер колеса должен быть от 14 до 32 дюймов");
		} else

			this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRADIUS() {
		return RADIUS;
	}

	@Override
	public String toString() {
		return "Wheel [RADIUS=" + RADIUS + ", radius=" + radius + "]";
	}

}
