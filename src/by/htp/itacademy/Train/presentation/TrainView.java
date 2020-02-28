package by.htp.itacademy.presentation;

import java.util.List;

import by.htp.itacademy.bean.Train;

public class TrainView {
	public void print(Train train) {
		System.out.println(train.toString());
	}

	public void print(List<Train> trains) {
		for (Train tr : trains) {

			print(tr);
		}

	}
}
