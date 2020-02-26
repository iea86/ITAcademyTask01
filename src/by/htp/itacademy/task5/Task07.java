package by.training.tasks.aliv.mas;

//7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен. 



import java.util.Random;

public class Task07 extends Task {

	@Override
	public void execute() {
		System.out.println("Task07");
		int z = 10;
		int count = 0;
		int[] mas = new int[10];
		fillArray(mas);
		printArray(mas);
		count = changeArray(mas, z);
		System.out.println("-----------------");
		printArray(mas);
		System.out.println("количество замен=" + count);

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

	public static int changeArray(int[] mas, int z) {
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}
		return count;
	}

}
