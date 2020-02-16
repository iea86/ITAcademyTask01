package by.htp.itacademy.task5;

package by.htp.itacademy.task5;

import java.util.Random;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 

public class Task01 {
	public static void main(String[] args) {
		int[] mas = new int[10];
		fillArray(mas);
		printArray(mas);
		int k = 2;
		int sum;
		sum = getSum(mas, k);
		System.out.println();
		System.out.println("сумма элементов="+sum);
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

	public static int getSum(int[] mas, int k) {
		int sum = 0;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum = sum + mas[i];
			}
		}

		return sum;
	}
}


package by.htp.itacademy.task5;

import java.util.Random;

//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов. 

public class Task02 {

	public static void main(String[] args) {
		int[] a = new int[10];
		fillArray(a);
		printArray(a);
		System.out.println();
		System.out.println("---------------");
		getArray(a);

	}

	public static void fillArray(int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				a[i] = 0;
			} else {
				a[i] = rand.nextInt(10);
			}
		}
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void getArray(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}

		int[] mas = new int[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				mas[j] = i;
				j++;
			}
		}

		printArray(mas);

	}

}

package by.htp.itacademy.task5;

//4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. 

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
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


package by.htp.itacademy.task5;

//5. Дана последовательность натуральных чисел а1 , а2 ,..., ап.
//Создать массив из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте. 

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
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


package by.htp.itacademy.task5;

//6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа. 

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		int max;
		int[] mas = new int[8];
		fillArray(mas);
		printArray(mas);
		max = getMax(mas);
		System.out.println("------");
		System.out.println(max);

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

	public static int getMax(int[] mas) {
		int max;
		max = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

}


package by.htp.itacademy.task5;

//7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен. 

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
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


package by.htp.itacademy.task5;

import java.util.Random;

//8. Дан массив действительных чисел, размерность которого N. 
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task08 {

	public static void main(String[] args) {
		int[] mas = new int[10];
		fillArray(mas);
		printArray(mas);
		getStats(mas);

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

	public static void getStats(int[] mas) {
		int countp = 0;
		int countn = 0;
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				countp++;
			} else if (mas[i] < 0) {
				countn++;
			} else {
				count++;
			}
		}
		System.out.println("кол - во положительных=" + countp);
		System.out.println("кол - во отрицательных=" + countn);
		System.out.println("кол - во нулевых=" + count);

	}

}


package by.htp.itacademy.task5;

import java.util.Random;

//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. 

public class Task09 {

	public static void main(String[] args) {
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


package by.htp.itacademy.task5;

import java.util.Random;

//10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 

public class Task10 {

	public static void main(String[] args) {
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


package by.htp.itacademy.task5;

import java.util.Random;

//11. Даны натуральные числа а1 ,а2 ,..., аn . 
//Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). 

public class Task11 {

	public static void main(String[] args) {
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


package by.htp.itacademy.task5;

import java.util.Random;

//12. Задана последовательность N вещественных чисел. 
//Вычислить сумму чисел, порядковые номера которых являются простыми числами. 

public class Task12 {

	public static void main(String[] args) {
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

package by.htp.itacademy.task5;

import java.util.Random;

//13. Определить количество элементов последовательности натуральных чисел, 
//кратных числу М и заключенных в промежутке от L до N. 

public class Task13 {

	public static void main(String[] args) {
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


package by.htp.itacademy.task5;

import java.util.Random;

//14. Дан одномерный массив A[N].Найти сумму (max(четных элементов), min(нечетных элементов)

public class Task14 {

	public static void main(String[] args) {
		int[] mas = new int[10];
		int sum;
		fillArray(mas);
		printArray(mas);
		System.out.println();
		sum = getSum(mas);
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

	public static int getMax(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				if (mas[i] > max) {
					max = mas[i];
				}
			}
		}
		return max;
	}

	public static int getMin(int[] mas) {
		int min = mas[1];
		for (int i = 3; i < mas.length; i++) {
			if (i % 2 != 0) {

				if (mas[i] < min) {
					min = mas[i];
				}
			}
		}
		return min;
	}

	public static int getSum(int[] mas) {
		int max;
		int min;
		int sum = 0;
		max = getMax(mas);
		min = getMin(mas);

		sum = max + min;

		return sum;
	}
}
package by.htp.itacademy.task5;

import java.util.Random;

//15. Дана последовательность действительных чисел n . Указать те ее элементы, которые принадлежат отрезку [с, d].

public class Task15 {

	public static void main(String[] args) {
		int[] mas = new int[10];
		int c = 2;
		int d = 10;

		fillArray(mas);
		printArray(mas);
		System.out.println();
		printArray(getElement(mas, c, d));

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

	public static int[] getElement(int[] mas, int c, int d) {
		int count = 0;
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] >= c) && (mas[i] <= d)) {
				count++;
			}
		}

		int[] a = new int[count];

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] >= c) && (mas[i] <= d)) {
				a[j] = mas[i];
				j++;
			}

		}

		return a;

	}
}


package by.htp.itacademy.task5;

import java.util.Random;

//16. Даны действительные числа. Найти  max(a1+a2, a3+a4, ..., an-1+an)

public class Task16 {

	public static void main(String[] args) {
		int[] mas = new int[10];

		fillArray(mas);
		printArray(mas);
		System.out.println();
		int[] a;
		a = getNewArray(mas);
		printArray(a);
		int max;
		max = getMax(a);
		System.out.println(max);

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

	public static int[] getNewArray(int[] mas) {
		int[] a = new int[mas.length / 2];
		int j = 0;
		for (int i = 0; i < mas.length; i = i + 2) {
			a[j] = mas[i] + mas[i + 1];
			j++;
		}
		return a;
	}

	public static int getMax(int[] mas) {
		int max = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		System.out.println();
		return max;

	}

}


package by.htp.itacademy.task5;

//17. Дана последовательность целых чисел n aaa ,,, 21  . Образовать новую последовательность, выбросив из исходной те члены, которые равны ) ,, ,min( 21 n aa a  .

import java.util.Random;

public class Task17 {

	public static void main(String[] args) {
		int[] mas = new int[10];

		fillArray(mas);
		printArray(mas);
		System.out.println();
		printArray(getNewArray(mas));

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

	public static int getMin(int[] mas) {
		int min;
		min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		return min;
	}

	public static int[] getNewArray(int[] mas) {
		int min;
		int count = 0;
		int j = 0;
		min = getMin(mas);

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				count++;
			}
		}

		int[] a = new int[count];

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				a[j] = mas[i];
				j++;
			}
		}

		return a;
	}

}


package by.htp.itacademy.task5;

import java.util.Random;

//19. В массиве целых чисел с количеством элементов n.
//найти наиболее часто встречающееся число. 
//Если таких чисел несколько, то определить наименьшее из них. 

public class Task19 {

	public static void main(String[] args) {
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


package by.htp.itacademy.task5;

import java.util.Random;

//20. Дан целочисленный массив с количеством элементов п. 
//Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
//Примечание. Дополнительный массив не использовать.

public class Task20 {

	public static void main(String[] args) {
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

