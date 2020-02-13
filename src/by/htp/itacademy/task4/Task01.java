package by.htp.itacademy.task4;

public class Task01 {

	public static void main(String[] args) {
		double s;
		s = getS(0, 0, 4, 4, 6, 6);
		System.out.println("площадь треугольника="+ s);
	}

	public static double getS(int x1, int y1, int x2, int y2, int x3, int y3) {
		double s;
		double a;
		double b;
		double c;
		double p;

		a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

		p = (a + b + c) / 2;

		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return s;
	}

}


//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел: 

public class Task02 {

	public static void main(String[] args) {
		int nod;
		int nok;
		int a = 56;
		int b = 64;
		nod = getNod(a, b);
		System.out.println("наибольший общий делитель=" + nod);

		nok = getNok(a, b, nod);
		System.out.println("наименьшее общее кратное=" + nok);

	}

	public static int getNod(int a, int b) {
		int nod = 1;

		for (int i = a; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;
	}

	public static int getNok(int a, int b, int nod) {
		int nok;

		nok = a * b / nod;
		return nok;
	}

}

//3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task03 {

	public static void main(String[] args) {
		
		int a = 56;
		int b = 64;
		int c = 16;
		int d = 32;
		int x;
		int nod1;
		int nod2;
		
		nod1=getNod(a,b);
		nod2=getNod(c,d);
		
		x=getNod(nod1, nod2);
		
		System.out.println("наибольший общий делитель =" + x);

	}

	public static int getNod(int a, int b) {
		int nod = 1;

		for (int i = a; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;
	}
}


//4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.

public class Task04 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = 5;

		System.out.println(getNok(c, getNok(a, b)));

	}

	public static int getNod(int a, int b) {
		int nod = 1;

		for (int i = a; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;
	}

	public static int getNok(int a, int b) {
		int nok;

		nok = a * b / getNod(a, b);
		return nok;
	}

}


//5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

public class Task05 {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c = 6;

		System.out.println(getMax(a, b, c) + getMin(a, b, c));
	}

	public static int getMax(int a, int b, int c) {

		if ((a > b) && (a > c)) {
			return a;
		} else if ((b > a) && (b > c)) {
			return b;
		} else {
			return c;
		}
	}

	public static int getMin(int a, int b, int c) {
		if ((a > b) && (c > b)) {
			return b;
		} else if ((b > a) && (c > a)) {
			return a;
		} else {
			return c;
		}
	}

}

//6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника. 

public class Task06 {

	public static void main(String[] args) {
		int a = 4;	
		
		System.out.println(6 * getS(a));
	}

	public static double getS(int a) {
		double s;
		s = ((Math.sqrt(3)) / 4) * a * a;	
		return s;
	}
}


//7. На плоскости заданы своими координатами n точек. 
//Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. 
//Указание. Координаты точек занести в массив. 

public class Task07 {

	public static void main(String[] args) {
		int[][] a = new int[5][2];
		fillArray(a);
		printArray(a);
		getMaxDistance(a);
	}

	public static void fillArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 15);
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

	public static void getMaxDistance(int[][] a) {
		int x = a[0][0];
		int y = a[0][1];
		int x1 = a[1][0];
		int y1 = a[1][1];
		int xMax = x;
		int yMax = y;
		int x1Max = x1;
		int y1Max = y1;
		double max;

		max = Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));

		for (int i = 1; i < a.length - 1; i++) {
			x = a[i][0];
			y = a[i][1];

			for (int j = i + 1; j < a.length; j++) {
				x1 = a[j][0];
				y1 = a[j][1];
				if (Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1)) > max) {
					xMax = x;
					yMax = y;
					x1Max = x1;
					y1Max = y1;
				}
			}
		}
		System.out.println("x=" + xMax + " y=" + yMax + " x1=" + x1Max + " y1=" + y1Max);
	}
}

//8. Составить программу, которая в массиве A[N] находит второе по величине число 
//(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов). 

public class Task089 {

	public static void main(String[] args) {
		int[] mas = new int[5];
		int max;
		int max2;
		fillArray(mas);
		printArray(mas);
		System.out.println("------------");
		max = getMax(mas);
		max2 = getMax2(mas, max);
		System.out.println(max);
		System.out.println(max2);
	}

	public static void fillArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 100);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}

	public static int getMax(int[] mas) {
		int max = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

	public static int getMax2(int[] mas, int max) {
		int max2;

		if (mas[0] != max) {
			max2 = mas[0];
		} else {
			max2 = mas[1];
		}

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max2) {
				if (mas[i] != max) {
					max2 = mas[i];
				}
			}
		}
		return max2;
	}
}


//9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми (у которых наибольший общий делитель =1)

public class Task09 {

	public static void main(String[] args) {
		int a = 13;
		int b = 64;
		int c = 88;

		isVspr(a, b, c);

	}

	public static int getNod(int a, int b) {
		int nod = 1;

		for (int i = a; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;
	}

	public static void isVspr(int a, int b, int c) {

		if (getNod(c, getNod(a, b)) == 1) {
			System.out.println("являются взаимно простыми");
		} else {
			System.out.println("не являются взаимно простыми");
		}

	}

}


//10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task10 {

	public static void main(String[] args) {
		int sum;
		sum = getSum();
		System.out.println(sum);
	}

	public static int getSum() {
		int i = 1;
		int sum = 0;
		int f = 1;

		while (i <= 9) {
			if (i % 2 != 0) {
				// находим факториал числа
				f = 1;
				for (int j = 1; j <= i; j++) {
					f = f * j;
				}
				// находим сумму факториалов нечетных чисел
				sum = sum + f;
			}

			i++;
		}

		return sum;
	}

}



//11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m

public class Task11 {

	public static void main(String[] args) {
		int[] mas = new int[15];
		fillArray(mas);
		
		// printArray(mas);
		getSum(mas, 2, 10);
		
	}

	public static void fillArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10);
		}
	}

	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}

	public static void getSum(int[] mas, int k, int m) {
		int sum;

		for (int i = k; i <= m; i=i+2) {
			sum = 0;
			sum = mas[i] + mas[i + 1] + mas[i + 2];
			System.out.println(sum);

		}
	}
}


//12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Task12 {

	public static void main(String[] args) {
		double s;
		s = getS(1, 2, 3, 4);
		System.out.println("площадь четырехугольника=" + s);
	}

	public static double getS(int x, int y, int z, int t) {
		double c;
		double s1;
		double s2;
		double p;

		s1 = x * y / 2;
		c = Math.sqrt(x * x + y * y);
		p = (z + t + c) / 2;

		s2 = Math.sqrt(p * (p - z) * (p - t) * (p - c));

		return s1 + s2;

	}
}


//13. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N. 

public class Task13 {

	public static void main(String[] args) {
		fillArray(45677686);
	}

	public static void fillArray(int n) {
		int g;
		int count = 0;
		g = n;

		// количество разрядов
		while (n > 0) {
			count = count + 1;
			n = n / 10;
		}

		int[] mas = new int[count];

		// инициализировать маccив из цифр числа n
		for (int j = 0; j < mas.length; j++) {
			mas[j] = g % 10;
			g = g / 10;
		}

		// вывести на консоль массив
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}
}


//14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

public class Task14 {

	public static void main(String[] args) {

		int a = 123456;
		int b = 9999999;
		compare(a, b);

	}

	public static int getCount(int n) {
		int count = 0;

		// количество разрядов
		while (n > 0) {
			count = count + 1;
			n = n / 10;
		}

		return count;
	}

	public static void compare(int a, int b) {

		int count1;
		int count2;

		count1 = getCount(a);
		count2 = getCount(b);

		if (count1 > count2) {
			System.out.println("в числе " + a + " больше цифр");
		} else if (count1 < count2) {
			System.out.println("в числе " + b + " больше цифр");
		} else {
			System.out.println("одинаковое число цифр");
		}
	}
}



//15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//  элементами которого являются числа, сумма цифр которых равна К и которые не большее N. 

public class Task15 {

	public static void main(String[] args) {
		int count;
		int k = 5;//сумма цифр
		int n = 300;

		count = getCount(n, k);
		int[] a = new int[count];
		fillArray(a, n, k);
		printArray(a);

	}

	public static int getSum(int chislo) {
		int count = 0;
		int g = chislo;
		int sum = 0;

		// количество разрядов
		while (chislo > 0) {
			count = count + 1;
			chislo = chislo / 10;
		}

		int[] mas = new int[count];

		// инициализировать маccив
		for (int j = 0; j < mas.length; j++) {
			mas[j] = g % 10;
			g = g / 10;
		}
		// найти сумму цифр числа
		for (int j = 0; j < mas.length; j++) {
			sum = sum + mas[j];
		}

		return sum;
	}

	public static int getCount(int n, int k) {
		int sum;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			sum = getSum(i);

			if (sum == k) {

				count++;
			}
		}
		return count;

	}

	public static void fillArray(int[] a, int n, int k) {
		int sum;
		int j = 0;

		for (int i = 1; i <= n; i++) {
			sum = getSum(i);
			if (sum == k) {
				a[j] = i;
				j++;
			}
		}
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}


//16. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
//Для решения задачи использовать декомпозицию. 

public class Task16 {

	public static void main(String[] args) {
		getC(30);
	}

	public static int getNod(int a, int b) {
		int nod = 1;

		for (int i = a; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;
	}

	public static void getC(int n) {
		int nod;

		for (int i = n; i <= 2 * n; i++) {
			for (int j = i + 1; j <= 2 * n; j++) {
				nod = getNod(i, j);
				if ((nod == 1) && (Math.abs(i - j) == 2)) {
					System.out.println("1ое число - " + i + "   2ое число - " + j);
				}
			}
		}
	}
}



//17. Натуральное число, в записи которого n цифр, называется числом Армстронга, 
//если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. 
//Для решения задачи использовать декомпозицию. 

public class Task17 {

	public static void main(String[] args) {
		chisloArmstronga(100);

	}

	public static int getCount(int chislo) {
		int count = 0;

		// количество разрядов
		while (chislo > 0) {
			count = count + 1;
			chislo = chislo / 10;
		}
		return count;
	}

	public static int getSum(int count, int chislo) {
		int sum = 0;
		int[] mas = new int[count];

		// инициализировать маccив
		for (int j = 0; j < mas.length; j++) {
			mas[j] = chislo % 10;
			chislo = chislo / 10;
		}
		// найти сумму цифр числа
		for (int j = 0; j < mas.length; j++) {
			sum = sum + mas[j];
		}

		return sum;
	}

	public static void chisloArmstronga(int k) {
		double sum;
		int count;

		for (int i = 0; i <= k; i++) {
			count = getCount(i);
			sum = Math.pow(getSum(count, i), count);
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
}


//18. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
//(например, 1234, 5789). 
//Для решения задачи использовать декомпозицию. 

public class Task18 {

	public static void main(String[] args) {

		int n = 4;// четырехзначные числа
		getVosr(n);

	}

	public static int getCheck(int n, int chislo) {
		int check = 0;
		int[] mas = new int[n];

		// инициализировать маccив
		for (int j = 0; j < mas.length; j++) {
			mas[j] = chislo % 10;
			chislo = chislo / 10;
		}

		for (int j = 0; j < mas.length - 1; j++) {
			if (mas[j] <= mas[j + 1]) {
				check++;
			}
		}
		return check;
	}

	public static void getVosr(int n) {
		int check;
		for (int i = (int) Math.pow(10, n - 1); i <= (Math.pow(10, n)) - 1; i++) {
			check = getCheck(n, i);
			if (check == 0) {
				System.out.println(i);
			}
		}
	}
}


//19. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
//Определить также, сколько четных цифр в найденной сумме.
//Для решения задачи использовать декомпозицию

public class Task19 {

	public static void main(String[] args) {
		int n = 1;
		int sum;
		int count;

		sum = getSum(n);
		System.out.println("сумма чисел: " + sum);
		count = getCountEven(sum);
		System.out.println("количество четных цифр в найденной сумме: " + count);

	}

	public static int getCountEven(int chislo) {
		int countEven = 0;
		int count = 0;
		int g;
		g = chislo;//записываем число в буффер

		// количество разрядов
		while (chislo > 0) {
			count = count + 1;
			chislo = chislo / 10;
		}

		int[] mas = new int[count];

		// инициализировать маccив
		for (int j = 0; j < mas.length; j++) {
			mas[j] = g % 10;
			g = g / 10;
		}
		// число четных цифр в числе
		for (int j = 0; j < mas.length; j++) {
			if (mas[j] % 2 == 0) {
				countEven++;
			}
		}
		return countEven;
	}

	public static int getSum(int n) {
		int countEven;
		int sum = 0;
		for (int i = (int) Math.pow(10, n - 1); i <= (Math.pow(10, n)) - 1; i++) {
			countEven = getCountEven(i);
			if (countEven == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}


//20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
//Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task20 {

	public static void main(String[] args) {
		int n = 12;

		n = getNumber(n);
		System.out.println("количество действий = " + n);
	}

	public static int getCount(int chislo) {
		int count = 0;

		// количество разрядов
		while (chislo > 0) {
			count = count + 1;
			chislo = chislo / 10;
		}
		return count;
	}

	public static int getSum(int chislo) {
		int sum = 0;
		int c = getCount(chislo);
		int[] mas = new int[c];

		// инициализировать маccив
		for (int j = 0; j < mas.length; j++) {
			mas[j] = chislo % 10;
			chislo = chislo / 10;
		}
		// найти сумму цифр числа
		for (int j = 0; j < mas.length; j++) {
			sum = sum + mas[j];
		}
		return sum;
	}

	public static int getNumber(int chislo) {
		int sum;
		int n = 0;
		sum = getSum(chislo);

		while (chislo > 0) {
			chislo = chislo - sum;
			n++;
		}
		return n;
	}
}

