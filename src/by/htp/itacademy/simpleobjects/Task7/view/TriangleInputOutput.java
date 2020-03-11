package by.training.tasks.aliv.simpleobjects.Task7.view;


import by.training.tasks.aliv.simpleobjects.Task7.model.Triangle;

public class TriangleInputOutput {
	
	public Triangle create() {

		 Triangle t = new  Triangle(1, 2, 1, 5, 6, 6);

		return t;
	}

	public void print(Triangle t) {
		System.out.println(t.toString());

	}

	public void print(double d) {
		System.out.println(d);

	}
	
	public void print(double[] d) {
		for (int i=0; i<d.length; i++) {
		System.out.println("координата"+ i + "="+d[i] + " ");
		}
	}

}
