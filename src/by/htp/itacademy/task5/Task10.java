package by.htp.itacademy.task5;



import java.util.Random;

//10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 

public class Task10 extends Task {

	@Override
	public void execute() {
		System.out.println("Task10");
		int[] mas = new int[10];
		fillArray(mas);
		printArray(mas);
		System.out.println();
		printArray(getNewArray(mas));

	}

	public static void fillArray(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int[] getNewArray(int[] mas) {
		int count = 0;
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				count++;
			}
		}

		int[] a = new int[count];

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				a[j] = mas[i];
				j++;
			}
		}

		return a;
	}

}
