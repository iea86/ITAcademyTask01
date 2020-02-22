package by.htp.itacademy.task8;

public class TrainAction {

	public static Train findTrain(Train[] trains, int number) {

		for (Train tr : trains) {
			if (tr.getNumber() == number) {
				return tr;
			}
		}
		return null;
	}

	public static void printResult(Train[] mas, int number) {
		Train tr;
		tr = findTrain(mas, number);
		if (tr != null) {
			System.out.println(tr.toString());
		} else {
			System.out.println("нет таких поездов");
		}

	}

}
