package by.training.tasks.aliv.mas;



import java.util.Random;

//11. Даны натуральные числа а1 ,а2 ,..., аn . 
//Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). 

public class Task11 extends Task {

	@Override
	public void execute() {
		System.out.println("Task11");
		int m=3;
		int[] mas = new int[10];
		fillArray(mas);
		printArray(mas);	
		System.out.println();
		printArray(getNewArray(mas,m));

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
	
	public static int[] getNewArray(int[] mas, int m) {
		int count = 0;
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % m>0) && (mas[i] % m<(m-1))) {
				count++;
			}
		}

		int[] a = new int[count];

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % m>0) && (mas[i] % m<(m-1))) {
				a[j] = mas[i];
				j++;
			}
		}

		return a;
	}


}
