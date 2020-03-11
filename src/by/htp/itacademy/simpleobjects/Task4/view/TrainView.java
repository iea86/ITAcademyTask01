package by.training.tasks.aliv.simpleobjects.Task4.view;

import by.training.tasks.aliv.simpleobjects.Task4.model.Train;

import java.util.List;


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
