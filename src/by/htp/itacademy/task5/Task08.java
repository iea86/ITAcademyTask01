package by.training.tasks.aliv.mas;



import java.util.Random;

//8. Дан массив действительных чисел, размерность которого N. 
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task08 extends Task {

	@Override
	public void execute() {
		System.out.println("Task08");
		int[] mas = new int[10];
		fillArray(mas);
		printArray(mas);
		getStats(mas);

	}

	public static void fillArray(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}

	public static void getStats(int[] mas) {
		int countp = 0;
		int countn = 0;
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				countp++;
			} else if (mas[i] < 0) {
				countn++;
			} else {
				count++;
			}
		}
		System.out.println("кол - во положительных=" + countp);
		System.out.println("кол - во отрицательных=" + countn);
		System.out.println("кол - во нулевых=" + count);

	}

}
