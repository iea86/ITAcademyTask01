package by.training.tasks.aliv.mas;

//4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. 



import java.util.Random;

public class Task04 extends Task {

	@Override
	public void execute() {
		System.out.println("Task04");
		boolean isvosr;
		int[] mas = new int[10] ;
		fillArray(mas);
		printArray(mas);

		isvosr = isVosr(mas);
		if (isvosr) {
			System.out.println("да. явл возрастающей");
		} else {
			System.out.println("нет. не явл. возрастающей");
		}

	}
	
	public static void fillArray(int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10);
		}
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static boolean isVosr(int[] mas) {

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] > mas[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
