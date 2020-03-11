package by.training.tasks.aliv.simpleobjects.Task7.service;


import by.training.tasks.aliv.simpleobjects.Task7.model.Triangle;

public class TriangleAction {
	public double[] getSides(Triangle t) {
		double[] sides = new double[3];

		double a = Math.sqrt(Math.pow(t.getX2() - t.getX1(), 2) + Math.pow(t.getY2() - t.getY1(), 2));
		double b = Math.sqrt(Math.pow(t.getX3() - t.getX2(), 2) + Math.pow(t.getY3() - t.getY2(), 2));
		double c = Math.sqrt(Math.pow(t.getX1() - t.getX3(), 2) + Math.pow(t.getY1() - t.getY3(), 2));

		sides[0] = a;
		sides[1] = b;
		sides[2] = c;

		return sides;
	}

	public double getPerimetr(Triangle t) {
		double[] sides=getSides(t);
		double p;
		p = (sides[0] + sides[1] + sides[2]) / 2;

		return p;
	}

	public double getSquare(Triangle t) {
		double[] sides=getSides(t);
		double p = getPerimetr(t);
		double s = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));

		return s;
	}

	public double[] getPoint(Triangle t) {
		double[] points = new double[2];
		double x = (t.getX1() + t.getX2() + t.getX3()) / 3;
		double y = (t.getY1() + t.getY2() + t.getY3()) / 3;

		points[0] = x;
		points[1] = y;

		return points;
	}

	
}
