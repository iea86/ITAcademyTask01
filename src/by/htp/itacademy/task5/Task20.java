package by.htp.itacademy.task5;



import java.util.Random;

//20. Дан целочисленный массив с количеством элементов п. 
//Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
//Примечание. Дополнительный массив не использовать.

public class Task20 extends Task {

	@Override
	public void execute() {
		System.out.println("Task20");
		int[] mas = new int[10];

		fillArray(mas);
		printArray(mas);
		System.out.println();
		printArray(updateArray(mas));
	}

	public static void fillArray(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(20);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int[] updateArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0) {
				mas[i] = 0;
			}
		}

		return mas;
	}

}
