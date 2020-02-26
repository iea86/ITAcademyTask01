package by.htp.itacademy.task5;

//5. Дана последовательность натуральных чисел а1 , а2 ,..., ап.
//Создать массив из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте. 



import java.util.Random;

public class Task05 extends Task {

	@Override
	public void execute() {
		System.out.println("Task05");
		int[] mas = new int[8];
		fillArray(mas);
		printArray(mas);
		System.out.println("---------------");
		int[] a = getNewMas(mas);
		if (a.length == 0) {
			System.out.println("в изначальном массиве нет четных чисел");
		} else {
			printArray(a);
		}

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

	public static int[] getNewMas(int[] mas) {
		int count = 0;
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				count++;
			}
		}

		if (count == 0) {
			return null;
		}

		int[] a = new int[count];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				a[j] = mas[i];
				j++;
			}
		}
		return a;

	}
}
