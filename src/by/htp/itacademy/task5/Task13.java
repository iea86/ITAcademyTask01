package by.training.tasks.aliv.mas;



import java.util.Random;

//13. Определить количество элементов последовательности натуральных чисел, 
//кратных числу М и заключенных в промежутке от L до N. 

public class Task13 extends Task {

	@Override
	public void execute() {
		System.out.println("Task13");
		int[] mas = new int[10];
		int count = 0;
		int m = 2;
		int l = 3;
		int n = 10;

		fillArray(mas);
		printArray(mas);
		System.out.println();
		count = getCount(mas, m, l, n);
		System.out.println(count);

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

	public static int getCount(int[] mas, int m, int l, int n) {
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
            if ((mas[i] % m==0) && (mas[i]> l) && (mas[i]<n)) {
            	count++;
            	
            }
		}

		return count;
	}

}
