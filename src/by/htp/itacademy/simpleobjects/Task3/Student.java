package by.training.tasks.aliv.simpleobjects.Task3;

public class Student {

	private String name;
	private String surname;
	private int groupNumber;
	private int[] marks = new int[5];

	public Student(String name, String surname, int groupNumber, int[] marks) {
		this.name = name;
		this.surname = surname;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
}
