package by.training.tasks.aliv.simpleobjects.Task3;

public class StudentAction {

	public static Student[] findALevelStudents(Student[] students) {

		Student[] result = new Student[students.length];
		int i = 0;
		for (Student st : students) {
			if (isALevelStudent(st)) {
				result[i] = st;
				i++;
			}
		}

		Student[] finalResult = new Student[i];
		for (int j = 0; j < finalResult.length; j++) {
			finalResult[j] = result[j];
		}

		return finalResult;
	}

	public static boolean isALevelStudent(Student student) {

		int[] marks;
		marks = student.getMarks();
		for (int mark : marks) {

			if (mark < 9) {
				return false;
			}
		}
		return true;
	}

	public static void print(Student[] students) {
		for (Student st : students)
			System.out.println(st.getName() + " " + st.getSurname());
	}
}
