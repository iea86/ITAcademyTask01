package by.training.tasks.aliv.simpleobjects.Task7.main;


import by.training.tasks.aliv.simpleobjects.Task7.model.Triangle;
import by.training.tasks.aliv.simpleobjects.Task7.service.TriangleAction;
import by.training.tasks.aliv.simpleobjects.Task7.view.TriangleInputOutput;

public class Main {

	public static void main(String[] args) {
		TriangleInputOutput inout = new TriangleInputOutput();
		TriangleAction action = new TriangleAction();

		// cоздаем объект
		Triangle t;
		t = inout.create();
		inout.print(t);

		// периметр
		double p = action.getPerimetr(t);
		inout.print(p);

		// площадь
		double s = action.getSquare(t);
		inout.print(s);

		// точка пересечения медиан
		double[] points = action.getPoint(t);
		inout.print(points);
	}
}
