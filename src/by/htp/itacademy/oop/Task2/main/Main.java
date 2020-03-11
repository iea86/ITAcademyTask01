package by.htp.tasks.main;

import by.htp.tasks.bean.Car;
import by.htp.tasks.service.CarAction;
import by.htp.tasks.view.CarInputOutput;

public class Main {

	public static void main(String[] args) {

		CarAction action = new CarAction();
		CarInputOutput intout = new CarInputOutput();

		Car car = intout.create();
		intout.print(car);
		// можем ехать или нет
		action.ride(car);
		// заправляем автомобиль

		action.chargeFuel(car);
		intout.print(car);
		// меняем колеса

		int radius = intout.enterRadius();
		action.changeWheel(car, radius);
		intout.print(car);
		// выводим на экран марку авто
		intout.printCarName(car);

	}

}