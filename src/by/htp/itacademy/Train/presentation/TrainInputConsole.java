package by.htp.itacademy.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.itacademy.bean.Date;
import by.htp.itacademy.bean.Train;

public class TrainInputConsole {
	
	public List<Train> create() {
		
		List<Train> trains = new ArrayList<Train>();
		
		Train tr1 = new Train("Minsk", 1, new Date(2020, 02, 22, 16, 30));
		Train tr2 = new Train("Kiev", 2, new Date(2020, 02, 22, 7, 30));
		Train tr3 = new Train("Moscow", 3, new Date(2020, 02, 22, 8, 30));
		Train tr4 = new Train("Minsk", 4, new Date(2020, 02, 22, 10, 35));
		Train tr5 = new Train("Minsk", 5, new Date(2020, 02, 22, 10, 30));
		Train tr6 = new Train("Dnepr", 8, new Date(2020, 02, 22, 20, 35));
		Train tr7 = new Train("Dnepr", 9, new Date(2020, 02, 22, 15, 00));
	
	    trains.add(tr1);
	    trains.add(tr2);
	    trains.add(tr3);
	    trains.add(tr4);
	    trains.add(tr5);
	    trains.add(tr6);
	    trains.add(tr7);
	    
	    
	    return trains;
	    
	}
	
	public int inputTrainNumber() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a train number you are looking for:");

		int number = sc.nextInt();
		
		return number;
		
	}

}
