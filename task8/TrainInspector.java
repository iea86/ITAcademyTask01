package by.htp.itacademy.task76;

import java.util.Scanner;

public class TrainInspector {

	public static void main(String[] args) {
		Train[] mas = new Train[5];
				    
		mas[0] = new Train("Minsk", 1, new Date(2020, 02, 22, 6,30));
		mas[1] = new Train("Kiev", 2, new Date(2020, 02, 22, 7,30));
		mas[2] = new Train("Moscow", 3, new Date(2020, 02, 22, 8,30));
		mas[3] = new Train("Mogilev", 4, new Date(2020, 02, 22, 9,30));
		mas[4] = new Train("Dnepr", 5, new Date(2020, 02, 22, 10,30));

		//get Train by its number
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер поезда:");
		
		int number = sc.nextInt();
		
		TrainAction ta = new TrainAction();
		ta.findTrain(mas, number);

	}

}
