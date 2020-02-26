package by.htp.itacademy.task5;



import java.util.Random;

//12. Задана последовательность N вещественных чисел. 
//Вычислить сумму чисел, порядковые номера которых являются простыми числами. 

public class Task12 extends Task {

	@Override
	public void execute() {
		System.out.println("Task12");
		int[] mas = new int[10];
		int sum=0;
		fillArray(mas);
		printArray(mas);	
		System.out.println();
		sum=getSum(mas);
		System.out.println(sum);

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

	public static int getSum(int[] mas) {
		int sum = 0;
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;// если i делится на j без остатка, то к счетчику делителей +1
				}
			} 

			if (count == 0) {			
				sum = sum + mas[i];
			}
		}
		return sum;
	}

}
