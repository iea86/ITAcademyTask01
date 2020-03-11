package by.training.tasks.aliv.simpleobjects.Task3;

public class StudentInspector {

	public static void main(String[] args) {

		Student[] mas = new Student[10];

		mas[0] = new Student("Ivan", "Ivanov", 123456, new int[] { 5, 5, 5, 5, 6 });
		mas[1] = new Student("Petr", "Sushko", 11111, new int[] { 5, 5, 5, 5, 5 });
		mas[2] = new Student("Sidor", "Inotov", 123, new int[] { 5, 7, 5, 8, 5 });
		mas[3] = new Student("Ivan", "Perko", 123456, new int[] { 5, 9, 5, 5, 5 });
		mas[4] = new Student("Petr", "Utov", 11111, new int[] { 5, 5, 9, 5, 5 });
		mas[5] = new Student("Sidor", "Sidorov", 123, new int[] { 9, 9, 9, 9, 9 });
		mas[6] = new Student("Pavel", "Lopov", 1, new int[] { 10, 10, 10, 10, 10 });
		mas[7] = new Student("Ivan", "Sikov", 123456, new int[] { 5, 5, 5, 5, 5 });
		mas[8] = new Student("Petr", "Sokov", 11111, new int[] { 5, 5, 5, 5, 5 });
		mas[9] = new Student("Sidor", "Limon", 123, new int[] { 5, 5, 5, 5, 5 });



		Student[] res;

		res = StudentAction.findALevelStudents(mas);
		StudentAction.print(res);

	}

}
