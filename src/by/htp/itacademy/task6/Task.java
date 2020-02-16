package by.htp.itacademy.task6;

//1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.

public class Task01 {

	public static void main(String[] args) {
		int[][] mas = new int[3][4];

		fillArray(mas);
		printArray(mas);

	}

	public static void fillArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j == 0) {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}

package by.htp.itacademy.task6;

import java.util.Random;

//2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]. 

public class Task02 {

	public static void main(String[] args) {
		int[][] mas = new int[2][3];
		fillArray(mas);
		printArray(mas);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(9);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}

package by.htp.itacademy.task6;

import java.util.Random;

//3. Дана матрица. Вывести на экран первый и последний столбцы.

public class Task03 {

	public static void main(String[] args) {
		int n = 5;
		int m = 6;
		int[][] mas = new int[n][m];
		fillArray(mas);
		printArray(mas);
		System.out.println("--------------");
		int[] col = getColumn(mas, 0);
		printArrayOne(col);
		System.out.println();
		System.out.println("--------------");
		int[] col2 = getColumn(mas, m-1);
		printArrayOne(col2);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(9);
			}
		}
	}

	public static int[] getColumn(int[][] a, int colNumber) {

		int l = a.length;
		int[] col = new int[l];
	
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			col[k] = a[i][colNumber];
			k++;
		}

		return col;
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printArrayOne(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}

package by.htp.itacademy.task6;

import java.util.Random;

//4. Дана матрица. Вывести на экран первую и последнюю строки.

public class Task04 {

	public static void main(String[] args) {
		int[][] a = new int[4][4];
		fillArray(a);
		printArray(a);
		System.out.println("--------");
		getFirstAndLastRow(a);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(9);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void getFirstAndLastRow(int[][] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ((i == 0) || (i == a.length - 1)) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}


package by.htp.itacademy.task6;

import java.util.Random;

//5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

public class Task05 {

	public static void main(String[] args) {
		int[][] a = new int[4][4];
		fillArray(a);
		printArray(a);
		System.out.println("--------");
		getEvenRows(a);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(9);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void getEvenRows(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i % 2 == 0) {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}


package by.htp.itacademy.task6;

import java.util.Random;

//6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 
public class Task06 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);
		get06(a);
	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(9);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void get06(int[][] a) {
		int c;
		c = a.length;

		for (int j = 0; j < c; j++) {
			if (a[0][j] > a[c - 1][j]) {
				if (j % 2 != 0) {
					System.out.println("-----");
					printColumn(a, j);
				}
			}

		}

	}

	public static void printColumn(int[][] a, int n) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j == n) {
					System.out.println(a[i][j]);
				}
			}
		}

	}

}
package by.htp.itacademy.task6;

import java.util.Random;

//7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов. 

public class Task07 {

	public static void main(String[] args) {
		int sum;
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);

		sum = getSum(a);
		System.out.println(sum);

	}

	public static int getSum(int[][] a)

	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ((a[i][j] < 0) && (a[i][j] % 2 != 0)) {
					sum = sum + Math.abs(a[i][j]);
				}
			}
		}
		return sum;
	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(9);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}


package by.htp.itacademy.task6;

import java.util.Random;

//8. Дан двухмерный массив n×m элементов. 
//Определить, сколько раз встречается число 7 среди элементов массива.

public class Task08 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);
		int count;
		count = getCount(a);
		System.out.println(count);
	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(9);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int getCount(int[][] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 7) {
					count++;
				}
			}
		}

		return count;
	}

}


package by.htp.itacademy.task6;

import java.util.Random;

//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

public class Task09 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);
		getDiagonal(a);
	}

	public static void fillArray(int[][] a) {
		Random rand=new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}

	public static void getDiagonal(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					System.out.println(a[i][j]);
				}
			}
		}

	}
}


package by.htp.itacademy.task6;

//10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int k = 3;
		int p = 4;
		fillArray(a);
		printArray(a);
		getRow(a, k);
		System.out.println();
		System.out.println("----------");
		getCol(a, p);
	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void getRow(int[][] a, int k) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == k)
					System.out.print(a[i][j] + " ");
			}

		}

	}

	public static void getCol(int[][] a, int p) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j == p)
					System.out.print(a[i][j] + " ");
			}

		}

	}
}


package by.htp.itacademy.task6;

import java.util.Random;

//11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, 
//вторая строка слева направо, третья строка справа налево и так далее.

public class Task11 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);
		System.out.println("----------------");
		newArray(a);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void newArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				for (int j = a[i].length - 1; j >= 0; j--) {
					{
						System.out.printf("%3d", a[i][j]);
					}
				}

			} else {
				for (int j = 0; j < a[i].length; j++) {
					{
						System.out.printf("%3d", a[i][j]);
					}
				}
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task12 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);

	}

	public static void fillArray(int[][] a) {
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					a[i][j] = n;
					n++;
				} else {
					a[i][j] = 0;
				}
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task13 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);

	}

	public static void fillArray(int[][] a) {
		int n = a.length;
		int k = 1;
		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = k;
					k++;
				}
			} else {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = n;
					n--;
				}
			}
			n = a.length;
			k = 1;
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task14 {

	public static void main(String[] args) {
		int n = 6;
		int[][] a = new int[n][n];
		fillArray(a);
		printArray(a);

	}

	public static void fillArray(int[][] a) {
		int k = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i + j == a.length - 1) {
					a[i][j] = k;
					k = k + 1;
				} else {
					a[i][j] = 0;
				}
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}


package by.htp.itacademy.task6;

public class Task15 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);

	}

	public static void fillArray(int[][] a) {
		int n = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					a[i][j] = n;
					n--;
				} else {
					a[i][j] = 0;
				}
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}
package by.htp.itacademy.task6;

public class Task16 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);

	}

	public static void fillArray(int[][] a) {
		int n = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					a[i][j] = n*(n+1);
					n++;
				} else {
					a[i][j] = 0;
				}
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task17 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);

	}

	public static void fillArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ((i == 0) || (i == a.length - 1) || (j == 0) || (j == a.length - 1)) {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task18 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		fillArray(a);
		printArray(a);

	}

	public static void fillArray(int[][] a) {
		int k = 1;
		int l;
		l = a[0].length;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < l; j++) {
				a[i][j] = k;
			}
			k++;
			l--;
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task19 {

	public static void main(String[] args) {
		int n=9;
		int[][] a = new int[n][n];
		fillArrayOnePart(a);
		fillArraySecondPart(a);
		printArray(a);

	}

	public static void fillArrayOnePart(int[][] a) {
		int m = a.length;
		int k=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = k; j < m; j++) {
				a[i][j]=1;				
			}
			k++;
			m--;
		}
	}
	
	public static void fillArraySecondPart(int[][] a) {
		int m = a.length;
		int k=0;
		for (int i = a.length-1; i > 0; i--) {
			for (int j = k; j < m; j++) {
				a[i][j]=1;				
			}
			k++;
			m--;
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task20 {

	public static void main(String[] args) {
		int n=9;
		int[][] a = new int[n][n];
		fillArray(a);
		fillArrayOnePart(a);
		fillArraySecondPart(a);
		printArray(a);

	}
	
	public static void fillArray(int[][] a) {		

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = 1;
			}
			
		}
	}


	public static void fillArrayOnePart(int[][] a) {
		int m = a.length-1;
		int k=1;
		for (int i = 0; i < a.length; i++) {
			for (int j = k; j < m; j++) {
				a[i][j]=0;				
			}
			k++;
			m--;
		}
	}
	
	public static void fillArraySecondPart(int[][] a) {
		int m = a.length-1;
		int k=1;
		for (int i = a.length-1; i > 0; i--) {
			for (int j = k; j < m; j++) {
				a[i][j]=0;				
			}
			k++;
			m--;
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task21 {

	public static void main(String[] args) {
		int n = 7;
		int[][] mas = new int[n][n];

		fillArray(mas);
		printArray(mas);
	}

	public static void fillArray(int[][] a) {
		int m = 1;
		int n;
		int l=a[0].length;

		for (int i = a.length - 1; i >=0; i--) {
			n=m;
			for (int j = 0; j < l; j++) {
				a[i][j] = n;
				n++;
			}
			l--;
			m++;
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task22 {

	public static void main(String[] args) {
		int n = 7;
		int[][] mas = new int[n][n];

		fillArray(mas);
		printArray(mas);
	}

	public static void fillArray(int[][] a) {
		int m = 1;
		int n;
		int l=a[0].length;

		for (int i = 0; i <a.length; i++) {
			n=m;
			for (int j = 0; j < l; j++) {
				a[i][j] = n;
				n++;
			}
			l--;
			m++;
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

public class Task23 {

	public static void main(String[] args) {
		int n = 7;
		int count;
		double[][] mas = new double[n][n];

		fillArray(mas);
		printArray(mas);

		count = getCount(mas);
		System.out.println(" количество положительных элементов =" + count);

	}

	public static void fillArray(double[][] a) {
		int n = a[0].length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.sin((i * i - j * j) / n);
			}
		}
	}

	public static int getCount(double[][] a) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void printArray(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}


package by.htp.itacademy.task6;

import java.util.Random;

public class Task24 {

	public static void main(String[] args) {
		int n = 6;
		int[] a = new int[n];
		int[][] mas = new int[n][n];
		fillArrayA(a);
		printArrayA(a);
		System.out.println();
		System.out.println("----------------");		
		fillArrayMas(mas, a);		
		printArrayMas(mas);

	}

	public static void fillArrayA(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}
	}

	public static void fillArrayMas(int[][] mas, int[] a) {

		int k = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) Math.pow(a[k], i+1);
				k++;
			}
			k = 0;
		}
	}

	public static void printArrayMas(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%7d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void printArrayA(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}


package by.htp.itacademy.task6;

public class Task25 {

	public static void main(String[] args) {
		int n = 4;
		int[][] mas = new int[n][n];
		fillArray(mas);
		printArray(mas);
	}

	public static void fillArray(int[][] mas) {
		int n = 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = n;
				n++;
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}

}
package by.htp.itacademy.task6;

import java.util.Scanner;

//26. С клавиатуры вводится двумерный массив чисел размерностью nxm. 
//Выполнить с массивом следующие действия: 
//а) вычислить сумму отрицательных элементов в каждой строке;  
//б) определить максимальный элемент в каждой строке;  
//в) переставить местами максимальный и минимальный элементы матрицы.

public class Task26 {

	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		int[][] mas = new int[n][m];
		fillArray(mas);
		printArray(mas);
		// printArraySum(getSum(mas));
		// printArraySum(getMax(mas));
		System.out.println("------------");
		printArray(changeArray(mas));

	}

	public static void fillArray(int[][] mas) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите элементы матрицы");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("a[%d][%d]=", i, j);
				mas[i][j] = sc.nextInt();
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static int[] getSum(int[][] a) {
		int c = a.length;
		int s = 0;
		int[] sum = new int[c];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < 0) {
					s = s + a[i][j];
				}
			}
			sum[i] = s;
			s = 0;
		}
		return sum;
	}

	public static int[] getMax(int[][] a) {
		int c = a.length;
		int maximum;
		int[] max = new int[c];
		for (int i = 0; i < a.length; i++) {
			maximum = a[i][0];
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maximum) {
					maximum = a[i][j];
				}
			}
			max[i] = maximum;
		}
		return max;
	}

	public static void printArraySum(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}

	public static int[] getIndexOfMax(int[][] a) {
		int max;
		int imax = 0;
		int jmax = 0;
		int[] maxindex = new int[2];
		max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					imax = i;
					jmax = j;
				}
			}
		}
		maxindex[0] = imax;
		maxindex[1] = jmax;

		return maxindex;

	}

	public static int[] getIndexOfMin(int[][] a) {
		int min;
		int imin = 0;
		int jmin = 0;
		int[] minindex = new int[2];
		min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					imin = i;
					jmin = j;
				}
			}
		}
		minindex[0] = imin;
		minindex[1] = jmin;

		return minindex;
	}

	public static int[][] changeArray(int[][] a) {
		int[] min = getIndexOfMin(a);
		int[] max = getIndexOfMax(a);

		int mina = a[min[0]][min[1]];
		int maxa = a[max[0]][max[1]];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == mina) {
					a[i][j] = maxa;
				} else if (a[i][j] == maxa) {
					a[i][j] = mina;
				}
			}
		}
		return a;
	}
}
package by.htp.itacademy.task6;

import java.util.Random;
import java.util.Scanner;

//27. В числовой матрице поменять местами два столбца любых столбца, 
//т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
//а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

public class Task27 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номера столбцов, которые надо поменять:");
		System.out.print(">>");
		int n = sc.nextInt();
		System.out.print(">>");
		int m = sc.nextInt();

		fillArray(a);
		printArray(a);
		System.out.println("------------");
		printArray(changeArray(a, n, m));

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);

			}

		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] changeArray(int[][] a, int n, int m) {
		int bufer;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				bufer = a[i][n];
				a[i][n] = a[i][m];
				a[i][m] = bufer;
			}
		}
		return a;
	}

}

package by.htp.itacademy.task6;

import java.util.Random;

//28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
//Определить, какой столбец содержит максимальную сумму

public class Task28 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int index;
		fillArray(a);
		printArray(a);
		System.out.println("--------------");
		int[] m = getSum(a);//массив содержит сумму по столбцам
		printArraySum(m);
		index = getColumnIndex(m);
		System.out.println();
		System.out.println("максимальную сумму содержит столбец=" + index);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);

			}

		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static int[] getSum(int[][] a) {
		int[] sum = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum[j] = sum[j] + a[i][j];
			}

		}
		return sum;
	}

	public static void printArraySum(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int getColumnIndex(int[] mas) {
		int max;
		int max_index = 0;
		max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max_index = i;
				max = mas[i];
			}
		}

		return max_index;
	}

}


package by.htp.itacademy.task6;

import java.util.Random;

//29. Найти положительные элементы главной диагонали квадратной матрицы. 

public class Task29 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];

		fillArray(a);
		printArray(a);
		System.out.println("--------------------");
		int[] d = getArray(a);
		printArrayD(d);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%2d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static int[] getArray(int[][] a) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ((i == j) && (a[i][j] > 0)) {
					count++;
				}
			}
		}

		int[] d = new int[count];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ((i == j) && (a[i][j] > 0)) {
					d[k] = a[i][j];
					k++;
				}
			}

		}
		return d;

	}

	public static void printArrayD(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}

package by.htp.itacademy.task6;

import java.util.Random;

//30. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
//Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз. 

public class Task30 {

	public static void main(String[] args) {
		int[][] a = new int[10][20];

		fillArray(a);
		printArray(a);
		int[] d = getArray(a);
		getRows(d);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(15);
			}
		}
	}

	public static int[] getArray(int[][] a) {
		int count = 0;
		int[] r = new int[10];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 5) {
					count++;
				}
			}
			r[i] = count;
			count = 0;
		}
		return r;
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void getRows(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= 3) {
				System.out.println(i);
			}
		}
	}
}

package by.htp.itacademy.task6;

import java.util.Random;

//31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней. 

public class Task31 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int count;

		fillArray(a);
		printArray(a);

		count=getCount(a);
		System.out.println(count);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(999);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static boolean isDvychznachnoe(int n) {
		double m;
		m = (double) n / 100;

		if ((m < 1) && (m >= 0.1)) {
			return true;
		}
		return false;

	}

	public static int getCount(int[][] a) {
		int count;
		count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (isDvychznachnoe(a[i][j])) {
					count++;
				}
			}
		}
		return count;
	}
}
package by.htp.itacademy.task6;

import java.util.Random;

//32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task32 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];

		fillArray(a);
		printArray(a);
		sortVosrMas(a);
		System.out.println("----------------");
		printArray(a);
		
		sortUbuvMas(a);
		System.out.println("----------------");
		printArray(a);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(999);
			}
		}
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void sortVosr(int[] mas) {
		boolean isSorted = false;

		int buf;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i + 1]) {
					isSorted = false;

					buf = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buf;
				}
			}
		}
	}

	public static void sortVosrMas(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			int[] k=a[i];
			sortVosr(k);
		}
	}

	public static void sortUbuv(int[] mas) {
		boolean isSorted = false;

		int buf;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] < mas[i + 1]) {
					isSorted = false;

					buf = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buf;
				}
			}
		}
	}
	
	public static void sortUbuvMas(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			int[] k=a[i];
			sortUbuv(k);
		}
	}
}


package by.htp.itacademy.task6;

//33. Отсортировать стобцы матрицы по возрастанию и убыванию значений эементов.

import java.util.Random;

public class Task33 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];

		fillArray(a);
		printArray(a);
		sortVosr(a);
		System.out.println("----------------");
		printArray(a);

		sortUbuv(a);
		System.out.println("----------------");
		printArray(a);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(20);
			}
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}

	}

	public static void sortVosr(int[][] mas) {
		boolean isSorted;
		int buf;

		for (int j = 0; j < mas[0].length; j++) {
			isSorted = false;
			while (!isSorted) {
				isSorted = true;
				for (int i = 0; i < mas.length - 1; i++) {
					if (mas[i][j] > mas[i + 1][j]) {
						isSorted = false;

						buf = mas[i][j];
						mas[i][j] = mas[i + 1][j];
						mas[i + 1][j] = buf;
					}
				}
			}
		}
	}

	public static void sortUbuv(int[][] mas) {
		boolean isSorted;
		int buf;

		for (int j = 0; j < mas[0].length; j++) {
			isSorted = false;
			while (!isSorted) {
				isSorted = true;
				for (int i = 0; i < mas.length - 1; i++) {
					if (mas[i][j] < mas[i + 1][j]) {
						isSorted = false;

						buf = mas[i][j];
						mas[i][j] = mas[i + 1][j];
						mas[i + 1][j] = buf;
					}
				}
			}
		}

	}
}


package by.htp.itacademy.task6;

//34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
//причем в каждом столбце число единиц равно номеру столбца.

public class Task34 {

	public static void main(String[] args) {
		int m = 6;
		int n = 5;
		int[][] a = new int[m][n];

		fillArray(a);
		printArray(a);
	}

	public static void fillArray(int[][] a) {

		for (int j = 0; j < a[0].length; j++) {
			for (int k = 0; k < j; k++) {
				a[k][j] = 1;
			}
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}

	}

}


package by.htp.itacademy.task6;

import java.util.Random;

//35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

public class Task35 {

	public static void main(String[] args) {
		int[][] mas = new int[6][7];
		fillArray(mas);
		printArray(mas);
		System.out.println("----------------------------");
		changeArray(mas);
		int[][] newmas = changeArray(mas);
		printArray(newmas);
	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(15);
			}
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}

	}

	public static int getMax(int[][] a) {
		int max;
		max = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	public static int[][] changeArray(int[][] a) {
		int max;
		max = getMax(a);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {
					a[i][j] = max;
				}
			}
		}
		return a;
	}
}


package by.htp.itacademy.task6;

import java.util.Random;

//36. Операция сглаживания матрицы дает новую матрицу того же размера,
//каждый элемент которой получается как среднее арифметическое соседей соответствующего элемента исходной матрицы. 
//Построить результат сглаживания заданной матрицы

public class Task36 {

	public static void main(String[] args) {
		int[][] a = new int[5][6];
		fillArray(a);
		printArray(a);
		double[][] newArray = getnewArray(a);
		printNewArray(newArray);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(15);
			}
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}

	}

	public static void printNewArray(double[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static double getAvg(int[][] a, int i, int j) {
		int sum;
		sum = 0;
		int count;
		count = 0;
		for (int k = i - 1; k <= i + 1; k++) {
			for (int l = j - 1; l <= j + 1; l++) {
				if (k < 0 || l < 0 || k == a.length || l == a[0].length || (k == i && l == j)) {
					continue;
				} else {
					sum = sum + a[k][l];
					count++;
				}
			}
		}
		double avg=  sum / count;
		
		return avg;
	}

	public static double[][] getnewArray(int[][] a) {
		double[][] newarray = new double[5][6];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				newarray[i][j] = getAvg(a, i, j);
			}
		}
		
		
		return newarray;
	}

}


package by.htp.itacademy.task6;

import java.util.Random;

//37. Переставить строки матрицы случайным образом. 

public class Task37 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];

		fillArray(mas);
		printArray(mas);
		System.out.println("--------------");

		int[][] newarray = newArray(mas);
		printArray(newarray);

	}

	public static int[] uniqueRandomArray(int[][] a) {

		int n = a.length;// количество строк
		int[] order = new int[n];
		for (int i = 0; i < order.length;) {
			int b = (int) (Math.random() * n) + 1;

			if (isNew(order, b) == true) {
				order[i] = b;
				i++;
			}
		}
		return order;
	}

	public static boolean isNew(int[] order, int n) {
		for (int i = 0; i < order.length; i++) {
			if (order[i] == n) {
				return false;
			}
		}
		return true;
	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(15);
			}
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}

	}

	public static int[][] newArray(int[][] a) {
		int k;
		int n = 0;
		int r;
		int c;
		int[] order = uniqueRandomArray(a);
		r = a.length;
		c = a[0].length;
		int[][] newarray = new int[r][c];
		for (int i = 0; i < a.length; i++) {
			k = order[n] - 1;
			for (int j = 0; j < a[i].length; j++) {
				newarray[k][j] = a[i][j];

			}
			n++;
		}
		return newarray;
	}

}



package by.htp.itacademy.task6;
//38. Найдите сумму двух матриц 

import java.util.Random;

public class Task38 {

	public static void main(String[] args) {
		int[][] masfirst = new int[3][3];
		int[][] massecond = new int[3][3];

		fillArray(masfirst);
		fillArray(massecond);

		printArray(masfirst);
		System.out.println("-------------");
		printArray(massecond);

		int[][] masthird= sumArray(masfirst, massecond);
		System.out.println("-------------");
		printArray(masthird);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(15);
			}
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}

	}

	public static int[][] sumArray(int[][] masfirst, int[][] massecond) {
		int[][] masthird = new int[3][3];
		for (int i = 0; i < masfirst.length; i++) {
			for (int j = 0; j < masfirst[i].length; j++) {
				masthird[i][j] = masfirst[i][j] + massecond[i][j];
			}

		}
		return masthird;

	}

}


package by.htp.itacademy.task6;
//39. Найдите произведение двух матриц.
import java.util.Random;

public class Task39 {
	public static void main(String[] args) {
		int[][] masfirst = new int[3][3];
		int[][] massecond = new int[3][3];

		fillArray(masfirst);
		fillArray(massecond);

		printArray(masfirst);
		System.out.println("-------------");
		printArray(massecond);

		int[][] masthird = mltArray(masfirst, massecond);
		System.out.println("-------------");
		printArray(masthird);

	}

	public static void fillArray(int[][] a) {
		Random rand = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(15);
			}
		}
	}

	public static void printArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}

	}

	public static int[][] mltArray(int[][] masfirst, int[][] massecond) {
		int m = masfirst.length;
		int n = masfirst[0].length;
		int k = massecond.length;
		int l = massecond[0].length;
		if (n != k) {
			System.out.println("Матрицы умножать нельзя");
		}
		int[][] masthird = new int[m][l];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				masthird[i][j] = 0;
				for (int s = 0; s < n; s++) {
					masthird[i][j] += masfirst[i][s] * massecond[s][j];
				}
			}
		}
		return masthird;
	}

}


package by.htp.itacademy.task6;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, 
//составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу, 
//каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3: 

public class Task40 {

	public static void main(String[] args) {
		int n = 3;

		int[][] a = new int[n][n];
		fillArray(a, n * n);
		System.out.println("------------");
		printArray(a);

		boolean isMagic = isMagicQ(a);
		System.out.println(isMagic);

	}

	public static void fillArray(int[][] a, int k) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length;) {
				int b = (int) (Math.random() * k) + 1;
				if (isNew(a, b) == true) {
					a[i][j] = b;
					j++;
				}
			}
		}
	}

	public static boolean isNew(int[][] a, int n) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == n) {
					return false;
				}
			}
		}
		return true;
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static int getSumStr(int[][] a) {
		int[] str = new int[a.length];
		int sum = 0;
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];

			}
			str[k] = sum;
			k++;
		}

		for (int i = 0; i < str.length - 1; i++) {

			if (str[i] != str[i + 1]) {
				return 0;
			}

		}

		return str[0];

	}

	public static int getSumCol(int[][] a) {
		int[] col = new int[a.length];
		int sum = 0;
		int k = 0;

		for (int j = 0; j < a.length; j++) {
			sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i][j];

			}
			col[k] = sum;
			k++;

		}

		for (int i = 0; i < col.length - 1; i++) {

			if (col[i] != col[i + 1]) {
				return 0;
			}

		}

		return col[0];

	}

	public static int getSumD1(int[][] a) {
		int sum;
		sum = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					sum = sum + a[i][j];
				}
			}
		}
		return sum;

	}

	public static int getSumD2(int[][] a) {
		int sum;
		sum = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if (i == a.length - j - 1) {
					sum = sum + a[i][j];
				}
				;

			}

		}
		return sum;

	}

	public static boolean isMagicQ(int[][] a) {

		int sumStr;
		sumStr = getSumStr(a);

		int sumCol;
		sumCol = getSumCol(a);

		int sum1;
		sum1 = getSumD1(a);

		int sum2;
		sum2 = getSumD2(a);

		if ((sumStr == sumCol) && (sumCol == sum1) && (sum1 == sum2)) {
			return true;
		}

		return false;

	}
}
