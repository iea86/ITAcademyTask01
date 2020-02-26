package by.htp.itacademy.task5;



import java.util.Random;

//19. В массиве целых чисел с количеством элементов n.
//найти наиболее часто встречающееся число. 
//Если таких чисел несколько, то определить наименьшее из них. 

public class Task19 extends Task {

	@Override
	public void execute() {
		System.out.println("Task19");
		int[] mas = new int[10];
		int min;

		fillArray(mas);
		printArray(mas);
		System.out.println();

		min = getEl(mas);
		System.out.println("наиболее часто встречающееся число:" + min);

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

	public static int[] getFrequency(int[] mas) {
		int[] a = new int[20]; // массив содержит кол-во раз, сколько каждый элемент встречаeтся в массиве
		int count;
		int k = 0;

		for (int i = 0; i < mas.length; i++) {
			count = 0;

			for (int j = 0; j < mas.length; j++) {
				if (mas[i] == mas[j]) {
					count++;
				}
			}
			a[k] = count;
			k++;
		}
		return a;
	}

	public static int getEl(int[] mas) {
		int max;
		int count = 0;
		int c = 0;// позиция числа которое часто встречается
		int[] a = getFrequency(mas);
		max = getMax(a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] == max) {
				count++;
				c = i;
			}
		}

		if (count == 1) {
			return mas[c];/// вывести на консоль наиболее часто встречающееся число если оно одно
		}

		int[] b = new int[count];
		int k = 0; //

		for (int i = 0; i < a.length; i++) {
			if (a[i] == max) {
				b[k] = mas[i];
				k++;
			}
		}

		int min;
		min = getMin(b);

		return min;
	}

	public static int getMax(int[] mas) {
		int max;
		max = mas[0];

		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		return max;
	}

	public static int getMin(int[] mas) {
		int min;
		min = mas[0];

		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}
		return min;
	}

}
