package by.htp.itacademy.task3;

import java.math.BigInteger;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// 1
		// printOne();

		// 2
		// printTwo();

		// 3
		// printThree();

		// 4
		// printFour();

		// 5
		// printFive();

		// 6
		// printSix();

		// 7
		// printSeven(1, 5, 1);

		// 8
		// printEight(1, 5, 1);

		// 9
		// printNine(1, 5, 1);

		// 10
		// printTen();

		// 11
		// printEleven();

		// 12
		// printTwelve();

		// 13
		printThirteen();

		// 14
		// printFourteen(200);

		// 15
		// printFifteen(18);

		// 16
		// printSixteen();

		// 17
		// printSeventeen(2, 10);

		// 18
		// printEighteen(5,1);

		// 19
		// printNineteen(5, 1);

		// 20
		// printTwenty(5, 1);

		// 21
		// printTwentyOne(0, 60,10);

		// 22
		// printThentyTwo(0, 60, 10);

		// 23
		// printTwentyThree(0, 60, 10);

		// 24
		// printTwentyFour(2456789);

		// 25
		// printTwentyFive(5);

		// 26
		// printTwentySix();		

		// 27
		// printTwentySeven(45, 47);

		// 28
		// printTwentyEight(45, 47, "-");

		// 29
		// printTwentyNine(546, 675);

		// 30
		// printThirty();

		// 31
		// printThirtyOne();

		// 32
		// printThirtyTwo("a11_.sdf");

		// 33
		// printThirtyThree(56789);

		// 34
		// printThirtyFour();

		// 35
		// printThirtyFive(12346);

		// 36
		// printThirtySix();

		// 37
		// printThirtySeven();

		// 38
		// printThirtyEight(13570);

		// 39
		// printThirtyNine();

		// 40
		// printFourty(100);

	}

	// 1. Необходимо вывести на экран числа от 1 до 5
	public static void printOne() {
		int n = 1;

		while (n <= 5) {

			System.out.println(n);
			n = n + 1;

		}
	}

	// 2. Необходимо вывести на экран числа от 5 до 1.
	public static void printTwo() {
		int n = 5;

		while (n > 0) {
			System.out.println(n);
			n = n - 1;
		}
	}

	// 3. Необходимо вывести на экран таблицу умножения на 3
	public static void printThree() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + "*" + 3 + "=" + i * 3);
		}
	}

	// 4. С помощью оператора while напишите программу
	// вывода всех четных чисел в диапазоне от 2 до 100 включительно.

	public static void printFour() {
		int i = 2;
		while (i <= 200) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// 5. С помощью оператора while напишите программу определения
	// суммы всех нечетных чисел в диапазоне от 1 до 99 включительно

	public static void printFive() {
		int n = 1;
		int sum = 0;
		while (n <= 99) {
			if (n % 2 == 0) {
				sum = sum + n;
			}
			n++;
		}
		System.out.println(sum);
	}

	// 6. Напишите программу, где пользователь вводит любое целое положительное
	// число. А программа суммирует все числа от 1 до введенного пользователем числа
	public static void printSix() {

		int x = 0;
		int sum = 0;
		int i = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите любое целое положительное число: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
			while (i <= x) {

				sum = sum + i;
				i++;
			}
		}
		System.out.println("sum=" + sum);
	}

	// 7. Вычислить значения функции на отрезке [а,b] c шагом h
	public static void printSeven(int a, int b, int h) {

		for (int i = a; i <= b; i = i + h) {
			if (i > 2) {
				System.out.print("x=" + i);
				System.out.print("  y= " + i);
				System.out.println();

			} else {
				System.out.print("x=" + i);
				System.out.print("  y= " + (-i));
				System.out.println();

			}

		}
	}

	// 8. Вычислить значения функции на отрезке [а,b] c шагом h:
	public static void printEight(int a, int b, int h) {
		int c = 1;
		int y;

		for (int i = a; i <= b; i = i + h) {
			if (i == 15) {
				System.out.print("x=" + i);
				y = (i + c) * 2;
				System.out.print("  y= " + y);
				System.out.println();

			} else {
				System.out.print("x=" + i);
				y = (i - c) + 6;
				System.out.print("  y= " + y);
				System.out.println();

			}

		}
	}

	// 9 Найти сумму квадратов первых ста чисел
	public static void printNine() {
		int i = 0;
		int sum = 0;

		while (i <= 200) {
			sum = sum + i * i;
			i++;
		}
		System.out.println(sum);

	}

	// 10. Составить программу нахождения
	// произведения квадратов первых двухсот чисел.
	public static void printTen() {
		int i = 1;
		BigInteger bi2 = BigInteger.valueOf(1);
		BigInteger p = BigInteger.valueOf(1);

		while (i <= 200) {
			// convert int i to biginteger bi
			BigInteger bi = BigInteger.valueOf(i);

			bi2 = bi.multiply(bi);
			p = p.multiply(bi2);
			i++;
		}
		System.out.println(p);
	}

	// 11. Составить программу нахождения
	// разности кубов первых двухсот чисел

	public static void printEleven() {
		int i = 1;
		int p = 0;

		while (i <= 200) {

			p = p - (i * i * i);

			i++;
		}

		System.out.println(p);

	}

	// 12. Последовательность аn строится так: а1 = 1, an = 6+ аn-1 ,
	// для каждого n >1 Составьте программу нахождения произведения
	// первых 10 членов этой последовательности.
	public static void printTwelve() {
		int a = 1;
		int n = 2;
		int p = 1;

		while (n <= 10) {
			a = 6 + a;
			n = n + 1;
			p = p * a;
		}
		System.out.println(p);
	}

	// 13. Составить таблицу значений функции y = 5 - x2/2
	// на отрезке [-5; 5] с шагом 0.5.

	public static void printThirteen() {
		double y;
		double i = -5.0;
		while (i <= 5) {
			y = 5 - i * i / 2;

			System.out.print("x=" + i);
			System.out.println(" y=" + y);
			i = i + 0.5;

		}
	}

	// 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
	public static void printFourteen(int n) {
		double s = 0;
		int i = 1;

		while (i <= n) {
			s = s + (1 / i);
			i++;
		}
		System.out.println(s);
	}

	// 15. Вычислить : 1+2+4+8+...+ n в 10 степени.
	public static void printFifteen(int n) {
		long s = 0;
		BigInteger b = BigInteger.valueOf(0);
		int i = 1;

		while (i <= n) {
			s = s + i;
			i++;
		}

		BigInteger bs = BigInteger.valueOf(s);

		b = bs.pow(10);

		System.out.println(b);
	}

	// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
	public static void printSixteen() {
		long s = 1;
		long b = 1;
		int i = 2;

		while (i <= 10) {
			s = s + i;
			b = b * s;
			i++;
		}
		System.out.println(b);
	}

	// 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
	public static void printSeventeen(int a, int n) {
		int s = 1;
		int b = 1;
		int i = 1;

		while (i <= n) {
			s = a + i - 1;
			b = b * s;
			i++;
		}

		System.out.println(b);
	}

	// 18.Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
	// модуль которых больше или равен заданному е. Общий член ряда имеет вид:
	// (-1) в степени (n-1) / n
	public static void printEighteen(int n, int e) {
		int a = 0;
		int sum = 0;
		int i = 1;

		while (i <= n) {
			a = (int) ((Math.pow(-1, i - 1)) / i);// член ряда
			if ((Math.abs(a)) >= e) {
				sum = sum + a;
			}
			i++;
		}

		System.out.println(sum);
	}

	// 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
	// модуль которых больше или равен заданному е.
	public static void printNineteen(int n, int e) {
		int a = 0;
		int sum = 0;
		int i = 0;

		while (i <= n) {
			a = (int) ((1 / Math.pow(2, i)) + (1 / Math.pow(3, i)));// член ряда
			if ((Math.abs(a)) >= e) {
				sum = sum + a;
			}
			i++;
		}

		System.out.println(sum);
	}

	// 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
	// модуль которых больше или равен заданному е.
	public static void printTwenty(int n, int e) {
		int a = 0;
		int sum = 0;
		int i = 0;

		while (i <= n) {
			a = 1 / ((3 * i - 2) * (3 * i + 1));// член ряда
			if ((Math.abs(a)) >= e) {
				sum = sum + a;
			}
			i++;
		}

		System.out.println(sum);
	}

	// 21. Составить программу для вычисления значений функции F(x) на отрезке [а,
	// b] с шагом h.
	// Результат представить в виде таблицы, первый столбец которой – значения
	// аргумента,
	// второй - соответствующие значения функции: F(x) = x - sin(x);
	public static void printTwentyOne(int a, int b, int h) {

		double y = 0;
		double r;

		for (int i = a; i <= b; i = i + h) {
			r = Math.toRadians(i);
			y = i - Math.sin(r);

			System.out.println("x=" + i + " F(x)=" + y);
		}

	}

	// 22.Составить программу для вычисления значений функции F(x) на отрезке [а,
	// b] с шагом h.
	// Результат представить в виде таблицы, первый столбец которой – значения
	// аргумента,
	// второй - соответствующие значения функции: F(x) = sin2(x);

	public static void printTwentyTwo(int a, int b, int h) {
		double y = 0;
		double r;

		for (int i = a; i <= b; i = i + h) {
			r = Math.toRadians(i);
			y = (Math.sin(r)) * (Math.sin(r));
			System.out.println("x=" + i + " F(x)=" + y);
		}
	}
	// 23.Составить программу для вычисления значений функции F(x) на отрезке [а,
	// b] с шагом h.
	// Результат представить в виде таблицы, первый столбец которой – значения
	// аргумента,
	// второй - соответствующие значения функции: F(x) = ctg(x/3)+1/2*sin(x);

	public static void printTwentyThree(int a, int b, int h) {
		double y = 0;
		double r;

		for (int i = a; i <= b; i = i + h) {
			r = Math.toRadians(i);
			y = (Math.cos(r / 3)) / (Math.sin(r / 3)) + (Math.sin(r)) / 2;
			System.out.println("x=" + i + " F(x)=" + y);
		}
	}

	// 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его
	// состав.
	// Преобразовать его в другое число, цифры которого будут следовать в обратном
	// порядке по сравнению с введенным числом.
	public static void printTwentyFour(int n) {
		int count = 0;
		int g;
		int e = 0;
		int stepen;
		int sum = 0;
		g = n;

		// количество разрядов
		while (n > 0) {
			count = count + 1;
			n = n / 10;
		}

		int[] mas = new int[count];

		// инициализировать маccив из n цифр
		for (int j = 0; j < mas.length; j++) {
			mas[j] = g % 10;
			g = g / 10;
		}

		for (int j = 0; j < mas.length; j++) {
			if (mas[j] % 2 == 0) {
				sum = sum + mas[j];
			}
		}

		for (int j = 0; j < mas.length; j++) {
			stepen = count - 1;
			e = e + mas[j] * ((int) Math.pow(10, stepen));

			count = count - 1;
		}
		System.out.println("сумма четных цифр=" + sum);
		System.out.println("число в обратном порядке=" + e);
	}

	// 25.Требуется определить факториал числа, которое ввел пользователь.
	public static void printTwentyFive(int n) {

		int s = 1;
		int i = 1;

		while (i <= n) {
			s = s * i;
			i++;
		}

		System.out.println(s);
	}

	// 26. Вывести на экран соответствий между символами и их численными
	// обозначениями в памяти
	// компьютера (Таблицу ASCII).
	public static void printTwentySix() {
		char c;

		for (int i = 0; i <= 255; i++) {
			c = (char) i;

			System.out.println(i + " - " + c);
		}
	}

	// 27. Для каждого натурального числа в промежутке от m до n вывести все
	// делители,
	// кроме единицы и самого числа. m и n вводятся с клавиатуры.

	public static void printTwentySeven(int m, int n) {

		while (m <= n) {
			System.out.println("число = " + m);
			System.out.println("делители:");

			for (int i = 2; i <= 9; i++) {

				if (m % i == 0) {
					System.out.println(i + "  ");
				}

			}
			m++;
		}
	}

	// 28. Написать программу, в которой вводятся два операнда Х и Y и знак операции
	// (+, –, /, *).
	// Вычислить результат Z в зависимости от знака. Предусмотреть реакции на
	// возможный неверный знак операции, а также на ввод Y=0 при делении.
	// Организовать возможность многократных вычислений без перезагрузки программа
	// (т.е. построить цикл).
	// В качестве символа прекращения вычислений принять ‘0’.

	public static void printTwentyEight(int x, int y, String c) {
		int z = 0;

		if ((c == "+") || (c == "-") || (c == "/") || (c == "*")) {
			if (c == "+") {
				z = x + y;
			} else if (c == "-") {
				z = x - y;
			} else if (c == "*") {
				z = x * y;
			} else if (c == "*") {
				if (y == 0) {
					System.out.println("деление на ноль");
				} else {
					z = x / y;
				}
			} else {
				System.out.println("неверный знак");
			}

			System.out.println("z=" + z);
		}
	}

	// 29. Даны два числа. Определить цифры, входящие в запись как первого так и
	// второго числа.
	public static void printTwentyNine(int a, int b) {
		int d = 0;
		int c = 0;

		while (a > 0) {
			d = a % 10;
			a = a / 10;
			c = b;
			// есть ли эта цифра во втором числе
			while (c > 0) {
				if (c % 10 == d) {
					System.out.println(d + " ");
					break;
				}
				c = c / 10;
			}
		}
	}

	// 30. Написать программу, переводящую римские цифры в арабские.
	public static void printThirty() {
		String c = "MDLXVI"; // romanian
		char letter;
		int arabian = 0;
		int sum = 0;

		for (int i = 0; i < c.length(); i++) {
			letter = c.charAt(i);

			switch (letter) {
			case ('I'):
				arabian = 1;
				break;
			case ('V'):
				arabian = 5;
				break;
			case ('X'):
				arabian = 10;
				break;
			case ('L'):
				arabian = 50;
				break;
			case ('C'):
				arabian = 100;
				break;
			case ('D'):
				arabian = 500;
				break;
			case ('M'):
				arabian = 1000;
				break;

			}
			sum = sum + arabian;

		}
		System.out.println(sum);
	}

	// 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно.
	// Человек пытается их угадать. Программа должна выводить угаданные и
	// неугаданные числа из тех,
	// что сгенерировала программа, а также ошибочные числа пользователя.
	public static void printThirtyOne() {
		int[] mas = new int[5];
		int[] array = new int[5];
		int found = 0;

		// массив чисел, сгенерированный компьютером
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 15 + 1);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}

		// Заполняем массив элементами, введёнными с клавиатуры
		Scanner input = new Scanner(System.in);
		System.out.println("Введите 5 чисел в диапазоне от 1 до 15: ");
		for (int i = 0; i < 5; i++) {
			array[i] = input.nextInt();
		}
		// cравниваем числа в двух массивах, found=0 если нет совпадений
		for (int i = 0; i < mas.length; i++) {
			found = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == mas[i]) {
					found++;
				}
			}

			if (found > 0) {
				System.out.println("угадали: " + mas[i]);
			} else {
				System.out.println("не угадали: " + mas[i]);
			}

		}

		// проверка введенных символов с клавиатуры
		for (int j = 0; j < array.length; j++) {
			if ((array[j] <= 0) || (array[j] > 15)) {
				System.out.println("ошибочнов ввели с клавиатуры:" + array[j]);
			}
		}
	}

	// 32. Проверить введенную пользователем строку на наличие недопустимых
	// символов.
	// В качестве первого символа допустимы только буквы и знак подчеркивания.
	// Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
	public static void printThirtyTwo(String s) {
		char a;
		System.out.println(s);

		// проверка первого символа
		a = s.charAt(0);
		if ((Character.isLetter(a)) || (a == '_')) {
			System.out.println("верно введен первый символ");
		} else {
			System.out.println("неверно введен первый символ");
		}

		// проверка остальных символов
		for (int i = 1; i < s.length(); i++) {
			a = s.charAt(i);
			if ((Character.isLetter(a)) || (a == '_') || (Character.isDigit(a))) {
				System.out.println("верно введен " + (i + 1) + " символ:" + a);
			} else {
				System.out.println("неверно введен " + (i + 1) + " символ:" + a);
			}
		}

	}

	// 33. Найдите наибольшую цифру данного натурального числа.
	public static void printThirtyThree(int n) {

		int count = 0;
		int max;
		int g;
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

		max = mas[0];

		for (int j = 0; j < mas.length; j++) {
			if (mas[j] > max) {
				max = mas[j];
			}
		}

		System.out.println(max);
	}

	// 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
	public static void printThirtyThree() {
		int a = 1000;
		int x, y, z, d;

		while (a <= 9999) {
			x = a % 10;
			y = (a / 10) % 10;
			z = (a / 100) % 10;
			d = (a / 1000) % 10;

			if (x + y + z + d == 15) {
				System.out.println(a);
			}
			a++;
		}
	}

	// 35. Найдите количество четных цифр данного натурального числа.
	public static void printThirtyFive(int n) {
		int g;
		int count = 0;
		g = n;
		int c = 0;

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

		for (int j = 0; j < mas.length; j++) {
			if (mas[j] % 2 == 0) {
				c++;
			}
		}
		System.out.println(c);
	}

	// 36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное
	// число,которое делится на их произведение. Найти эти числа.
	public static void printThirtySix() {

		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				if ((i * 100 + j) % (i * j) == 0) {
					System.out.println("первое число = " + i + " второе число = " + j);
				}

			}
		}
	}
	// 37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных
	// числа:
	// первое число получили путем написания сначала числа А, затем В.
	// Для получения второго числа сначала записали число В, затем А.
	// Найти числа А и В если известно , что первое четырехзначное число нацело
	// делится на 99,
	// а второе на 49.

	public static void printThirtySeven() {
		int a;
		int b;

		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				a = i * 100 + j;
				b = j * 100 + i;
				if ((a % 99 == 0) && (b % 49 == 0)) {
					System.out.println("первое число = " + i + " второе число = " + j);
				}

			}
		}
	}

	// 38. Для заданного натурального числа определить, образуют ли его цифры
	// арифметическую прогрессию.
	// Предполагается, что в числе не менее трёх цифр. Например: 1357, 963

	public static void printThirtyEight(int n) {
		int g;
		int count = 0;
		g = n;
		int d;

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

		d = mas[1] - mas[0];
		for (int j = 1; j < mas.length - 1; j++) {
			if (mas[j + 1] - mas[j] != d) {
				System.out.println("не образуют арифметическую прогрессию");
				return;
			}
		}

		System.out.println("образуют арифметическую прогрессию");

	}

	// 39. В трехзначном числе зачеркнули старшую цифру.
	// Когда полученное число умножили на 7, то получили исходное число. Найти это
	// число.

	public static void printThirtyNine() {
		int x;
		int y;
		int z;
		int n = 100;
		while (n < 999) {
			x = n % 10;
			y = (n / 10) % 10;
			z = (n / 100) % 10;

			if ((y * 10 + x) * 7 == z * 100 + y * 10 + x) {
				System.out.println(n);
			}
			n++;
		}
	}

	// 40. Получить все числа, не превышающие заданного числа N, которые делятся без
	// остатка на все свои цифры.
	public static void printFourty(int n) {
		int count = 0;
		int g;
		int g_buf;
		int k = 1;
		int chislo;
		chislo = k;

		int check;

		while (chislo < n) {
			g = chislo;
			g_buf = chislo;
			check = 0;

			// количество разрядов
			while (k > 0) {
				count = count + 1;
				k = k / 10;
			}

			int[] mas = new int[count];

			// инициализировать маccив из цифр числа n
			for (int j = 0; j < mas.length; j++) {
				mas[j] = g % 10;
				g = g / 10;
			}

			// если цифра числа равна 0 или число не делится нацело, то меняем флаг check
			for (int j = 0; j < mas.length; j++) {
				if ((mas[j] == 0) || (chislo % mas[j] != 0)) {
					check++;
				}
			}

			// если флаг не поменялся, значит число выводим на консоль
			if (check == 0) {
				System.out.println(chislo);
			}

			chislo++;
		}

	}

}
