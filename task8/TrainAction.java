package by.htp.itacademy.task76;

public class TrainAction {

	public void findTrain(Train[] trains, int number) {

		for (Train tr : trains) {
			if (tr.getNumber() == number) {
				System.out.println(tr.toString());
			}
		}
	}

}
