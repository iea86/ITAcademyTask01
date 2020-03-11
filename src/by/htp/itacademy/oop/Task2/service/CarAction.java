package by.htp.tasks.service;

import by.htp.tasks.bean.Car;
import by.htp.tasks.bean.Wheel;

public class CarAction {

	public void ride(Car car) {
		if (car.getFuel() == 0) {
			System.out.println("Ехать невозможно, бак пуст");
		} else if (!car.getEngine().isHasStarted()) {
			System.out.println("Дигатель не заведён");
		} else {
			System.out.println("Едем");
		}
	}

	public Car chargeFuel(Car car) {
		car.setFuel(car.getMaxfuel());

		return car;
	}

	public void changeWheel(Car car, int radius) {

		if (car.getEngine().isHasStarted()) {
			System.out.println("Нельзя менять колёса на ходу");

		} else {
			Wheel FrontLeft = new Wheel(radius);
			car.setFrontLeft(FrontLeft);

			Wheel FrontRight = new Wheel(radius);
			car.setFrontRight(FrontRight);

			Wheel RearLeft = new Wheel(radius);
			car.setRearLeft(RearLeft);

			Wheel RearRight = new Wheel(radius);
			car.setRearRight(RearRight);
		}
	}
}
