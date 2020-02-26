package by.training.tasks.aliv.mas;



import java.util.Random;

//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. 

public class Task09 extends Task {

	@Override
	public void execute() {
		System.out.println("Task09");
		int[] mas = new int[10];
		int maxindex;
		int minindex;
		fillArray(mas);
		printArray(mas);
		System.out.println();

		minindex = getMinIndex(mas);
		maxindex = getMaxIndex(mas);

		printArray(getArray(mas, minindex, maxindex));

	}

	public static void fillArray(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int getMaxIndex(int[] mas) {
		int maxindex = 0;
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				maxindex = i;
			}
		}
		return maxindex;
	}

	public static int getMinIndex(int[] mas) {
		int minindex = 0;
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
				minindex = i;
			}
		}
		return minindex;
	}

	public static int[] getArray(int[] mas, int minindex, int maxindex) {

		int min = mas[minindex];

		mas[minindex] = mas[maxindex];
		mas[maxindex] = min;

		return mas;
	}
}
