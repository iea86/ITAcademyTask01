package by.htp.itacademy.task2;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// 1
		// printOne(3, 4);

		// 2
		// printTwo(3, 4);

		// 3
		// printThree();

		// 4
		// printFour(2, 3);

		// 5
		// printFive(1,3);

		// 6
		// printSix(1, 3);

		// 7
		// printSeven(1, 2, 3, -20);

		// 8
		// printEight(2,3);

		// 9
		// printNine(3, 3, 3);

		// 10
		// printTen(5, 6);

		// 11
		// printEleven(1, 2, 3, 4, 5, 6);

		// 12
		// printTwelve(1, 2, -3);

		// 13
		// printThirteen(1, 2, -3, -4);

		// 14
		// printFourteen(45, 45);

		// 15
		// printFifteen(4, 2);

		// 16
		// printSixteen(1, 0);

		// 17
		// printSeventeen(1, 2);

		// 18
		// printEighteen(2, -3, -8);

		// 19
		// printNineteen(1, 2, 3);

		// 20
		// printTwenty(1, 2, 3, 1);

		// 21
		// printTwentyOne();

		// 22
		// printTwentyTwo(1, 5);

		// 23
		// printTwentyThree(31, 11);

		// 24
		// printTwentyFour(6);

		// 25
		// printTwentyFive();

		// 26
		// printTwentySix(1, 2, 3);

		// 27
		// printTwentySeven(1, 2, 3, 4);

		// 28
		// printTwentyEight(1, 2, 3, 4);

		// 29
		// printTwentyNine(1, 2, 3, 4, 5, 7);

		// 30
		// printThirty(3, -2, 1);

		// 31
		// printThirtyOne(3, 5, 4, 4, 4);

		// 32
		// printThirtyTwo(2, -9, 0);

		// 33
		// printThirtyThree();

		// 34
		// printThirtyFour();

		// 35
		printThirtyFive(231);

		// 36
		// printThirtySix();

		// 37
		// printThirtySeven();

		// 38
		// printThirtyEight();

		// 39
		// printThirtyNine();

		// 40
		// printFourty();

	}

	// 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
	// на экран цифру 7, в противном случае – цифру 8
	public static void printOne(int a, int b) {

		if (a > b) {
			System.out.println(8);
		}
		{
			System.out.println(7);
		}
	}

	// 2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
	// на экран слово «yes», в противном случае – слово «no»
	public static void printTwo(int a, int b) {

		if (a > b) {
			System.out.println("no");
		}
		{
			System.out.println("yes");
		}
	}

	// 3. Составить программу сравнения введенного числа а и цифры 3.
	// Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести
	// слово «no».
	public static void printThree() {
		int x = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите любое число: ");

		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}

		if (x < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	// 4. Составить программу: равны ли два числа а и b?
	public static void printFour(int a, int b) {

		if (a > b) {
			System.out.println("a>b");
		} else if (a < b) {
			System.out.println("a<b");
		} else {
			System.out.println("a=b");
		}

	}

	// 5. Составить программу: определения наименьшего из двух чисел а и b.
	public static void printFive(int a, int b) {

		if (a > b) {
			System.out.println("наименьшеe число:" + b);
		} else if (a < b) {
			System.out.println("наименьшеe число:" + a);
		} else {
			System.out.println("числа равны");
		}
	}

	// 6. Составить программу: определения наибольшего из двух чисел а и b.
	public static void printSix(int a, int b) {

		if (a > b) {
			System.out.println("наибольшее число:" + a);
		} else if (a < b) {
			System.out.println("наибольшее число:" + b);
		} else {
			System.out.println("числа равны");
		}
	}

	// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при
	// заданных значениях a, b, c и х
	public static void printSeven(int a, int b, int c, int x) {
		int y = 0;

		y = a * x * x + b * x + c;

		if (y >= 0) {
			System.out.println(y);
		} else {
			System.out.println(Math.abs(y));
		}

	}

	// 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
	public static void printEight(int a, int b) {

		if (a * a > b * b) {
			System.out.println("наименьший - b^2:" + b * b);
		} else if (a * a < b * b) {
			System.out.println("наименьший - a^2:" + a * a);
		} else {
			System.out.println("квадраты чисел равны");
		}
	}

	// 9. Составить программу, которая определит по трем введенным сторонам,
	// является ли данный треугольник равносторонним.
	public static void printNine(int a, int b, int c) {

		if ((a == b) && (b == c) && (a == c)) {
			System.out.println("треугольник равносторонний");
		} else {
			System.out.println("треугольник не равносторонний");
		}
	}

	// 10. Составить программу, которая определит площадь какого круга меньше.
	public static void printTen(int r1, int r2) {
		int s1 = 0;
		int s2 = 0;

		s1 = (int) (Math.PI * r1 * r1);
		s2 = (int) (Math.PI * r2 * r2);

		if (s1 > s2) {
			System.out.println("площадь второго круга меньше");
		} else if (s2 > s1) {
			System.out.println("площадь первого круга меньше");
		} else {
			System.out.println("площади равны");
		}
	}

	// 11. Составить программу, которая определит площадь какого треугольника больше

	public static void printEleven(int a1, int b1, int c1, int a2, int b2, int c2) {
		double p1 = 0;
		double p2 = 0;
		double s1 = 0;
		double s2 = 0;

		p1 = (a1 + b1 + c1) / 2;
		p2 = (a2 + b2 + c2) / 2;

		s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

		if (s1 > s2) {
			System.out.println("площадь первого треугольника больше");
		} else if (s2 > s1) {
			System.out.println("площадь второго треугольника больше");
		} else {
			System.out.println("площади равны");
		}
	}

	// 12 Даны три действительных числа. Возвести в квадрат те из них, значения
	// которых неотрицательны, и в четвертую степень — отрицательные.

	public static void printTwelve(int a, int b, int c) {

		if (a >= 0) {
			System.out.println(a * a);
		} else {
			System.out.println(a * a * a * a);
		}

		if (b >= 0) {
			System.out.println(b * b);
		} else {
			System.out.println(b * b * b * b);
		}

		if (c >= 0) {
			System.out.println(c * c);
		} else {
			System.out.println(c * c * c * c);
		}

	}

	// 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
	// которая из точек находится ближе к началу координат
	public static void printThirteen(int x1, int x2, int y1, int y2) {

		double d1 = 0;
		double d2 = 0;

		d1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		d2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

		if (d1 < d2) {
			System.out.println("А(х1, у1) находится ближе к началу координат");
		} else if (d2 < d1) {
			System.out.println("В(х2, у2) находится ближе к началу координат");
		} else {
			System.out.println("Точки расположены на одном расстоянии от начала координат");
		}

	}

	// 14. Даны два угла треугольника (в градусах).
	// Определить, существует ли такой треугольник, и если да, то будет ли он
	// прямоугольным.

	public static void printFourteen(int a, int b) {
		if (a + b < 180) {
			System.out.println("треугольник существует");

			if ((a + b) == 90 || (a == 90) || (b == 90)) {
				System.out.println("треугольник прямоугольный");
			}
		} else {
			System.out.println("треугольник не существует");
		}

	}

	// 15.Даны действительные числа х и у, не равные друг другу.
	// Меньшее из этих двух чисел заменить половиной их суммы, а большее — их
	// удвоенным произведением

	public static void printFifteen(int x, int y) {
		int xBuf = 0;
		int yBuf = 0;

		if (x < y) {
			xBuf = x;
			x = (x + y) / 2;
			y = 2 * xBuf * y;
		} else {
			yBuf = y;
			y = (x + y) / 2;
			x = 2 * yBuf * x;
		}
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

	// 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
	// расположена (на какой оси или в каком координатном угле).

	public static void printSixteen(int x, int y) {

		if ((x > 0) && (y > 0)) {
			System.out.println("точка находится в первой четверти");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("точка находится во второй четверти");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("точка находится в третьей четверти");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("точка находится в четвертой четверти");
		} else if ((x == 0) && (y != 0)) {
			System.out.println("точка находится на оси X");
		} else if ((x != 0) && (y == 0)) {
			System.out.println("точка находится на оси Y");
		} else {
			System.out.println("точка находится в начале координат");
		}
	}

	// 17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них
	// одним и тем же числом,
	// равным большему из исходных, а если равны, то заменить числа нулями.
	public static void printSeventeen(int x, int y) {
		int b = 0;

		if (x > y) {
			b = x;
		} else {
			b = y;
		}

		if (x != y) {
			x = b;
			y = b;
		} else {
			x = 0;
			y = 0;
		}

		System.out.println(x);
		System.out.println(y);

	}

	// 18. Подсчитать количество отрицательных среди чисел а, b, с.

	public static void printEighteen(int a, int b, int c) {
		int count = 0;

		if (a < 0) {
			count = 1;
		}

		if (b < 0) {
			count++;
		}

		if (c < 0) {
			count++;
		}

		System.out.println(count);

	}

	// 19. Подсчитать количество положительных среди чисел а, b, с.

	public static void printNineteen(int a, int b, int c) {
		int count = 0;

		if (a > 0) {
			count = 1;
		}

		if (b > 0) {
			count++;
		}

		if (c > 0) {
			count++;
		}

		System.out.println(count);
	}

	// 20. Определить, делителем каких чисел а, b, с является число k.

	public static void printTwenty(double a, double b, double c, double k) {
		if ((a % k != 0) && (b % k != 0) && (c % k != 0)) {
			System.out.println("никаких");
		} else {
			if (a % k == 0) {
				System.out.println("числа a");
			}

			if (b % k == 0) {
				System.out.println("числа b");
			}

			if (c % k == 0) {
				System.out.println("числа c");
			}
		}
	}

	// 21. Программа — льстец. На экране высвечивается вопрос
	// «Кто ты: мальчик или девочка? Введи Д или М».
	// В зависимости от ответа на экране должен появиться текст
	// «Мне нравятся девочки!» или «Мне нравятся мальчики!».

	public static void printTwentyOne() {
		Scanner sc = new Scanner(System.in);
		String x;

		System.out.print("Кто ты: мальчик или девочка? Введи Д или М: ");
		if (sc.hasNext()) {
			x = sc.next();

			if (x.equals("Д")) {
				System.out.println("Мне нравятся мальчики!");
			} else if (x.equals("М")) {
				System.out.println("Мне нравятся девочки!");
			} else {
				System.out.println("Проверьте правильность введенного символа");
			}
		}
	}

	// 22. Перераспределить значения переменных х и у так,
	// чтобы в х оказалось большее из этих значений, а в y - меньшее

	public static void printTwentyTwo(double x, double y) {
		double xBuf;

		if (x < y) {
			xBuf = x;
			x = y;
			y = xBuf;
		}

		System.out.println("x=" + x + " y=" + y);

	}

	// 23. Определить правильность даты,
	// введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12).
	// Если введены некорректные данные, то сообщить об этом.

	public static void printTwentyThree(int d, int m) {

		if (m == 2) {
			if ((d < 1) || (d > 29)) {
				System.out.println("Неверно введен день для февраля");
			}
		} else if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 10) || (m == 12)) {
			if ((d > 31) || (d < 1)) {
				System.out.println("Неверно введен день");
			}
		}

		else if ((m == 4) || (m == 6) || (m == 9) || (m == 11)) {
			if ((d > 30) || (d < 1)) {
				System.out.println("Неверно введен день");
			}

		} else if ((m > 12) || (m < 1)) {
			System.out.println("Неверно введен месяц");
		}
	}

	// 24. Составить программу, определяющую результат гадания на ромашке —
	// «любит—не любит», взяв за исходное данное количество лепестков п.

	public static void printTwentyFour(int n) {

		if (n % 2 == 0) {
			System.out.println("не любит");
		} else {
			System.out.println("любит");
		}

	}

	// 25. Написать программу — модель анализа пожарного датчика в помещении,
	// которая выводит сообщение «Пожароопасная ситуация » , если температура в
	// комнате превысила 60° С.

	public static void printTwentyFive() {
		double x;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите температуру: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();

			if (x > 60) {
				System.out.println("Пожароопасная ситуация");
			} else {
				System.out.println("Температура в норме");
			}
		}
	}

	// 26. Написать программу нахождения суммы большего и меньшего из трех чисел

	public static void printTwentySix(double a, double b, double c) {

		if ((a > b) && (a > c)) {
			System.out.println("max - " + a);
		} else if ((b > a) && (b > c)) {
			System.out.println("max - " + b);
		} else {
			System.out.println("max - " + c);
		}

		if ((a < b) && (a < c)) {
			System.out.println("min - " + a);
		} else if ((b < a) && (b < c)) {
			System.out.println("min - " + b);
		} else {
			System.out.println("min - " + c);
		}

	}

	// 27. Найти max{min(a, b), min(c, d)}.

	public static void printTwentySeven(double a, double b, double c, double d) {
		System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));

	}

	// 28.
	// Даны три числа a, b, с. Определить, какое из них равно d.
	// Если ни одно не равно d, то найти max(d — a, d — b, d —c).

	public static void printTwentyEight(double a, double b, double c, double d) {
		if (a == d) {
			System.out.println("a=d");
		} else if (b == d) {
			System.out.println("b=d");
		}

		else if (c == d) {
			System.out.println("c=d");
		} else {
			System.out.println(Math.max(Math.max(d - a, d - b), d - c));
		}

	}

	// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
	// Определить, будут ли они расположены на одной прямой
	public static void printTwentyNine(double x1, double x2, double x3, double y1, double y2, double y3) {
		double s;
		double p;
		double a;
		double b;
		double c;

		a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		p = (a + b + c) / 2;

		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		if (s == 0) {
			System.out.println("Лежат на одной прямой");
		} else {
			System.out.println("Не лежат на одной прямой");
		}

	}

	// 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с,
	// и заменить их абсолютными значениями, если это не так.

	public static void printThirty(double a, double b, double c) {
		if ((a > b) && (b > c) && (a > c)) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
			System.out.println("a=" + a + " b=" + b + " c=" + c);
		} else {
			System.out.println("a=" + Math.abs(a) + " b=" + Math.abs(b) + " c=" + Math.abs(c));
		}

	}

	// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
	// Определить, пройдет ли кирпич через отверстие.

	public static void printThirtyOne(double a, double b, double x, double y, double z) {
		if ((x * y < a * b) || (x * z < a * b) || (y * z < a * b)) {
			System.out.println("Кирпич пройдет");
		}

		else {
			System.out.println("Кирпич не пройдет");
		}

	}

	// 32.Написать программу, которая по заданным трем числам определяет,
	// является ли сумма каких-либо двух из них положительной.
	public static void printThirtyTwo(double x, double y, double z) {

		if (x + y > 0) {
			System.out.println("дa, сумма первого и второго положительна");
		} else if (y + z > 0) {
			System.out.println("сумма второго и третьего положительна");
		} else if (x + z > 0) {
			System.out.println("сумма первого и третьего положительна");
		} else {
			System.out.println("ни одна пара не положительна");
		}
	}

	// 33. Написать программу, которая по паролю будет определять уровень доступа
	// сотрудника к секретной информации в базе данных. Доступ к базе имеют только
	// шесть человек,
	// разбитых на три группы по степени доступа.
	// Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С;
	// 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.

	public static void printThirtyThree() {

		Scanner sc = new Scanner(System.in);
		double x = 0;

		System.out.print("Введите пароль: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
			if ((x == 9583) || (x == 1747)) {
				System.out.println("доступны модули баз А, В, С");
			} else if ((x == 3331) || (x == 7922)) {
				System.out.println("доступны модули баз В, С");
			} else if ((x == 9455) || (x == 8997)) {
				System.out.println("доступны модули базы С");
			} else {
				System.out.println("вы не имеете доступа к модулям база");
			}
		}
	}

	// 34. Составить программу, реализующую эпизод применения компьютера в книжном
	// магазине.
	// Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
	// если сдачи не требуется,
	// печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то
	// печатает «возьмите сдачу»
	// и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об
	// этом
	// и указывает размер недостающей суммы

	public static void printThirtyFour() {
		double x = 0;
		double y = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите стоимость книг: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}

		System.out.print("Введите сумму денег, внесенную покупателем: ");
		if (sc.hasNextInt()) {
			y = sc.nextInt();
		}

		if (x == y) {
			System.out.println("cпасибо");
		} else if (x < y) {

			System.out.println("возьмите сдачу  " + (y - x));
		}

	}

	// 35. Вычислить число и месяц в невисокосном году по номеру дня.
	public static void printThirtyFive(int a) {

		if ((a <= 0) || (a > 365)) {
			System.out.println("проверьте правильность введенного числа");
		} else {

			if ((a <= 31) && (a > 0)) {
				System.out.println(a + " января");
				return;
			}

			a = a - 31;

			if ((a <= 28) && (a > 0)) {
				System.out.println(a + " февраля");
				return;
			}

			a = a - 28;

			if ((a <= 31) && (a > 0)) {
				System.out.println(a + " марта");
				return;
			}

			a = a - 31;

			if ((a <= 30) && (a > 0)) {
				System.out.println(a + " апреля");
				return;
			}

			a = a - 30;

			if ((a <= 31) && (a > 0)) {
				System.out.println(a + " мая");
				return;
			}

			a = a - 31;

			if ((a <= 30) && (a > 0)) {
				System.out.println(a + " июня");
				return;
			}

			a = a - 30;

			if ((a <= 31) && (a > 0)) {
				System.out.println(a + " июля");
				return;
			}

			a = a - 31;

			if ((a <= 30) && (a > 0)) {
				System.out.println(a + " августа");
				return;
			}

			a = a - 31;

			if ((a <= 30) && (a > 0)) {
				System.out.println(a + " сентября");
				return;
			}

			a = a - 30;

			if ((a <= 31) && (a > 0)) {
				System.out.println(a + " октября");
				return;
			}

			a = a - 31;

			if ((a <= 30) && (a > 0)) {
				System.out.println(a + " ноября");
				return;
			}

			a = a - 30;

			if ((a <= 31) && (a > 0)) {
				System.out.println(a + " декабря");
				return;
			}
		}
	}

	// 36. Вычислить значение функции
	public static void printThirtySix() {
		double f;
		double x;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
			if (x <= 3) {
				f = x * x - 3 * x + 9;
			} else {
				f = 1 / (x * x * x + 6);
			}
			System.out.println(f);
		}
	}

	// 37. Вычислить значение функции

	public static void printThirtySeven() {
		double f;
		double x;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();

			if (x >= 3) {
				f = -x * x + 3 * x + 9;
			} else {
				f = 1 / (x * x * x - 6);
			}
			System.out.println(f);
		}
	}

	// 38. Вычислить значение функции

	public static void printThirtyEight() {
		double f;
		double x = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();

			if ((x <= 3) && (x >= 0)) {
				f = x * x;
			} else {
				f = 4;
			}
			System.out.println(f);
		}
	}

	// 39. Вычислить значение функции

	public static void printThirtyNine() {
		double f;
		double x;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();

			if (x >= 8) {
				f = -x * x + x - 9;
			} else {
				f = 1 / (Math.pow(x, 4) - 6);
			}
			System.out.println(f);
		}
	}

	// 40. Вычислить значение функции

	public static void printFourty() {
		double f;
		double x;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();

			if (x <= 13) {
				f = -x * x * x + 9;
			} else {
				f = -3 / (x + 1);
			}
			System.out.println(f);
		}
	}
}
