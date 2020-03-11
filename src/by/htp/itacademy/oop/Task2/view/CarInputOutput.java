package by.htp.tasks.view;

import java.util.Scanner;

import by.htp.tasks.bean.Car;

public class CarInputOutput {

	public Car create() {

		Car car = new Car("Volvo", 15, 30);
		return car;
	}

	public void printCarName(Car car) {
		System.out.println("Марка автомобиля:" + car.getCarName());

	}

	public void print(Car car) {
		System.out.println(car.toString());

	}

	public int enterRadius() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите радиус колес:");

		int number = sc.nextInt();

		return number;
	}
}
