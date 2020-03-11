package by.training.tasks.aliv.simpleobjects.Task4.service;

import by.training.tasks.aliv.simpleobjects.Task4.model.Train;

import java.util.ArrayList;
import java.util.List;



public class TrainAction {

	public Train find(List<Train> trains, int trainNumber) {

		for (Train tr : trains) {
			if (tr.getNumber() == trainNumber) {
				return tr;
			}
		}
		return null;
	}

	public List<Train> sortByNumber(List<Train> trains) {
		for (int i = 0; i < trains.size() - 1; i++) {
			int minTrainNumber = trains.get(i).getNumber();
			int minTrainNumberIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				Train currentTrain = trains.get(j);

				if (minTrainNumber > currentTrain.getNumber()) {
					minTrainNumber = currentTrain.getNumber();
					minTrainNumberIndex = j;
				}
			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainNumberIndex);

			trains.set(i, temp2);
			trains.set(minTrainNumberIndex, temp1);

		}

		return trains;

	}

	public List<Train> sortByDestination(List<Train> trains) {
		for (int i = 0; i < trains.size() - 1; i++) {
			String firstTrainStation = trains.get(i).getDestination();
			int firstTrainStationIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				Train currentTrain = trains.get(j);

				if (firstTrainStation.compareToIgnoreCase(currentTrain.getDestination()) > 0)

				{
					firstTrainStation = currentTrain.getDestination();
					firstTrainStationIndex = j;
				}
			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(firstTrainStationIndex);

			trains.set(i, temp2);
			trains.set(firstTrainStationIndex, temp1);

		}

		return trains;

	}

	public List<Integer> findDublicateStations(List<Train> trains, int from) {
		List<Integer> range = new ArrayList<Integer>();
		range.add(null);
		range.add(null);
		int count = 0;// предусмотреть ситуацию если более 2 элементов подряд имеют одинаковое station и не перзаписывать первый элемент в List. Он будет сохранен

		for (int i = from; i < trains.size() - 1; i++) {

			String firstTrainStation = trains.get(i).getDestination();
			String nextTrainStation = trains.get(i + 1).getDestination();

			if (firstTrainStation.compareToIgnoreCase(nextTrainStation) == 0) {
				if (count == 0) {

					range.set(0, Integer.valueOf(i));
					range.set(1, Integer.valueOf(i + 1));
					count++;

				} else {
					range.set(1, Integer.valueOf(i + 1));
					count++;

				}
			} else if (range.get(0) != null) {
				return range;
			}
		}

		return range;

	}

	public List<Train> sortByTime(List<Train> trains, int start, int end) {

		for (int i = start; i <= end; i++) {
			int minHour = trains.get(i).getDt().getHour(); // int
			int minMinute = trains.get(i).getDt().getMinute();

			int minTrainTime = i;

			for (int j = i + 1; j <= end; j++) {
				Train currentTrain = trains.get(j);
				if (minHour > currentTrain.getDt().getHour()) {
					minHour = currentTrain.getDt().getHour();
					minMinute = currentTrain.getDt().getMinute();
					minTrainTime = j;
				} else if (minHour == currentTrain.getDt().getHour()) {

					if (minMinute > currentTrain.getDt().getMinute()) {

						minHour = currentTrain.getDt().getHour();
						minMinute = currentTrain.getDt().getMinute();
						minTrainTime = j;
					}
				}
			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainTime);

			trains.set(i, temp2);
			trains.set(minTrainTime, temp1);

		}

		return trains;

	}

	public void sortByStationAndTime(List<Train> trains) {
		int start = 0;
		List<Integer> range = new ArrayList<Integer>();
		range.add(null);
		range.add(null);

		sortByDestination(trains);
		range = findDublicateStations(trains, start);

		while (range.get(0) != null) {
			sortByTime(trains, range.get(0), range.get(1));

			start = range.get(1);
			range = findDublicateStations(trains, start);

		}

	}

}
