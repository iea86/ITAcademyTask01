package by.htp.itacademy.task1;

public class Task01 {

	public static void main(String[] args) {
		// 1
		// printFirst(1, 4);

		// 2
		// printTwo(1);

		// 3
		// printThree(3, 4);

		// 4
		// printFour(4, 6, 5);

		// 5
		// printFive(4, 6);

		// 6
		// printSix(5, 4);

		// 7
		// printSeven(5);

		// 8
		// printEight(10, 15, 16);

		// 9
		// printNine(10, 15, 16, 20);

		// 10
		// printTen(10, 15);

		// 11
		// printEleven(3, 5);

		// 12
		// printTwelve(0, 8, 0, 16);

		// 13
		// printThirteen(1, 4, 8, 0, 8, 16);

		// 14
		// printFourteen(6);

		// 15
		// printFifteen();

		// 16
		// printSixteen(1234);

		// 17
		// printSeventeen(3, 6);

		// 18
		// printEighteen(3);

		// 19
		// printNineteen(3);

		// 20
		// printTwenty(3);

		// 21
		// printTwentyOne(123.456);

		// 22
		// printTwentyTwo(4085);

		// 23
		// printTwentyThree(3, 9);

		// 24
		// printTwentyFour(30, 10, 45);

		// 25
		// printTwentyFive(1, -70, 600);

		// 26
		// printTwentySix(60, 3, 3);

		// 27
		// printTwentySeven(2);

		// 28
		// printTwentyEight(1.05);

		// 29
		// printTwentyNine(3, 3, 3);

		// 30
		// printThirty(1, 2, 2);

		// 31
		// printThirtyOne(5, 1, 3, 2);

		// 32
		// printThirtyTwo(1, 50, 60);

		// 33
		// printThirtyThree('h');

		// 34
		// printThirtyFour(8);

		// 35
		// printThirtyFive(64, 5);

		// 36
		// printThirtySix(1234);

		// 37
		// printThirtySevenA(21);
		// printThirtySevenB(1234);
		// printThirtySevenC(123);
		// printThirtySevenD(-8, -5, 5);
		// printThirtySevenE(123);
		// printThirtySevenF(1, 2, 3);
		// printThirtySevenG(123);
		// printThirtySevenK(9, 3);
		// printThirtySevenH(3, 0);

		// 38
		// printThirtyEightA(1, 1);
		// printThirtyEightB(0, 0);
		// printThirtyEightC(4.5, -2.1);

		// 39
		printThirtyNine(2);

		// 40
		printFourty(2);

	}

	// 1. Даны два дейcтвительных числа х и у. Вычислить их сумму, разность,
	// произведение и частное.
	public static void printFirst(double x, double y) {
		double s;
		double r;
		double p;
		double c;

		s = x + y;
		r = x - y;
		p = x * y;
		c = x / y;

		System.out.println("cуммa=" + s);
		System.out.println("разность=" + r);
		System.out.println("произведение=" + p);
		System.out.println("частное=" + c);
	}

	// 2. Найдите значение функции:y = 3 + а
	public static void printTwo(int a) {
		int z;
		z = 3 + a;
		System.out.println(z);
	}

	// 3. Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.
	public static void printThree(int x, int y) {
		int z;
		z = 2 * x + (y - 2) * 5;
		System.out.println(z);
	}

	// 4.Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
	public static void printFour(int a, int b, int c) {
		System.out.println(((a - 3) * b / 2) + c);
	}

	// 5. Соcтавить алгоритм нахождения cреднего арифметичеcкого двух чиcел
	public static void printFive(int n, int m) {
		System.out.println((n + m) / 2);
	}

	// 6.Написать код для решения задачи.
	// В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
	// если в каждом большом бидоне на 12 л. больше, чем в малом?
	public static void printSix(int n, int m) {
		double y;
		m = n + 12;
		y = (80 * m) / n;
		System.out.println(y);

	}

	// 7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти
	// площадь прямоугольника
	public static void printSeven(double a) {
		double b;
		// ширина
		b = a / 2;
		System.out.println("площадь прямоугольника= " + a * b);
	}

	// 8. Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения)
	public static void printEight(double a, double b, double c) {
		double x;
		x = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("значение выражения по формуле= " + x);

	}
	// 9. Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения)

	public static void printNine(double a, double b, double c, double d) {
		double x;

		x = (a / c) * (b / d) - (a * b - c) / (c * d);

		System.out.println("значение выражения по формуле = " + x);

	}

	// 10. Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения)
	public static void printTen(double x, double y) {
		double a;

		a = ((Math.sin(x) + Math.cos(x)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.println("значение выражения по формуле= " + a);

	}

	// 11.Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
	// двух катетов.

	public static void printEleven(int a, int b) {
		double c;
		double p;
		double s;

		c = Math.sqrt(a * a + b * b);
		s = a * b / 2;
		p = a + b + c;

		System.out.println("периметр= " + p);
		System.out.println("площадь= " + s);

	}

	// 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
	// (x2, у2).

	public static void printTwelve(int x1, int x2, int y1, int y2) {

		double p;

		p = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println(p);
		;
	}

	// 13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).
	// Найти его периметр и площадь.

	public static void printThirteen(int x1, int x2, int x3, int y1, int y2, int y3) {
		double p;
		double s;
		double a;
		double b;
		double c;

		a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		p = (a + b + c) / 2;

		System.out.println("периметр = " + p);
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("площадь = " + s);

	}

	// 14. Вычислить длину окружности и площадь круга одного и того же заданного
	// радиуса R.

	public static void printFourteen(int r) {
		double l;
		double s;

		l = 2 * Math.PI * r;
		System.out.println("длина окружноcти = " + l);
		s = Math.PI * r * r;
		System.out.println("площадь круга = " + s);
	}

	// 15. Написать программу, которая выводит на экран первые четыре степени числа
	// π.
	public static void printFifteen() {
		for (int i = 1; i <= 4; i++) {
			System.out.println(Math.pow(Math.PI, i));
		}
	}

	// 16. Найти произведение цифр заданного четырехзначного числа
	public static void printSixteen(int n) {

		int a;
		int b;
		int c;
		int d;
		a = n / 1000;
		b = (n / 100) % 10;
		c = (n / 10) % 10;
		d = n % 10;

		System.out.println("произведение цифр заданного четырехзначного чиcла = " + a * b * c * d);
	}

	// 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
	// геометрическое модулей этих чисел.
	public static void printSeventeen(int a, int b) {

		double s;
		double g;

		s = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		g = Math.abs(a) * Math.abs(a) / 2;

		System.out.println("среднее арифметическое кубов этих чисел = " + s);
		System.out.println("среднее геометрическое модулей этих чисел = " + g);

	}

	// 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
	// объем этого куба.

	public static void printEighteen(double a) {

		double s;
		double sp;
		double v;

		s = a * a;
		sp = 4 * s;
		v = Math.pow(a, 3);

		System.out.println("площадь грани = " + s);
		System.out.println("площадь полной поверхноcти = " + sp);
		System.out.println("объем этого куба = " + v);

	}

	// 19. Дана сторона равностороннего треугольника. Найти площадь этого
	// треугольника, его высоту, радиусы вписанной и описанной окружностей

	public static void printNineteen(double a) {

		double h;
		double s;
		double r;
		double R;

		h = (Math.sqrt(3) / 2) * a;
		s = a * h / 2;

		r = a / (2 * Math.sqrt(3));
		R = a / (Math.sqrt(3));

		System.out.println("выcота = " + h);
		System.out.println("площадь = " + s);
		System.out.println("радиуc впиcанной окружноcти = " + r);
		System.out.println("радиуc опиcанной окружноcти = " + R);
	}

	// 20. Известна длина окружности. Найти площадь круга, ограниченного этой
	// окружностью.
	public static void printTwenty(double l) {
		double s;

		s = Math.pow(l, 2) / (4 * Math.PI);
		System.out.println(s);
	}

	// 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной
	// и целой частях).
	// Поменять местами дробную и целую части числа и вывести полученное значение
	// числа.
	public static void printTwentyOne(double r) {

		int c;
		int d;
		double s;
		c = (int) (r * 1000) % 1000;
		d = (int) (r * 1000) / 1000;
		s = (double) (c * 1000 + d) / 1000;

		System.out.println(s);
	}

	// 22.Дано натуральное число Т, которое представляет длительность прошедшего
	// времени в секундах.
	// Вывести данное значение длительности в часах, минутах и секундах в следующей
	// форме: ННч ММмин SSc.
	public static void printTwentyTwo(int t) {
		int hour;
		int min;
		int sec;
		int hour1;
		int min1;
		int sec1;

		hour = t / 3600;
		min = t % 3600 / 60;
		sec = t % 3600 % 60;

		// определить, еcть ли деcятки в цифре

		hour1 = hour / 10;
		min1 = min / 10;
		sec1 = sec / 10;

		if (hour1 == 0) {
			System.out.print("0" + hour + "ч ");
		} else {
			System.out.print(hour + "ч ");
		}

		if (min1 == 0) {
			System.out.print("0" + min + "ч ");
		} else {
			System.out.print(min + "мин ");
		}

		if (sec1 == 0) {
			System.out.print("0" + sec + "ч ");
		} else {
			System.out.print(sec + "sec ");
		}

	}

	// 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R
	// (R> r).
	public static void printTwentyThree(double r, double R) {
		double s;
		s = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
		System.out.println("Площадь кольца=" + s);
	}

	// 24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при
	// большем основании а.
	public static void printTwentyFour(double a, double b, double c) {
		double h;
		double s;

		h = (a - b) / 2 * Math.tan(a * Math.PI / 180);

		s = (a + b) * h / 2;

		System.out.println("Площадь трапеции: " + s);
	}

	// 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными
	// коэффициентами a, b и с
	// (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
	public static void printTwentyFive(double a, double b, double c) {
		double d;
		double x1 = 0.0;
		double x2 = 0.0;

		d = Math.pow(b, 2) - (4 * a * c);
		if (d < 0) {
			System.out.println("Корней нет");
		} else if (d > 0) {

			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
		}

		System.out.println("x1=" + x1);
		System.out.println("x2=" + x2);

	}

	// 26. Найти площадь треугольника, две стороны которого равны а и b, а угол
	// между этими сторонами у.

	public static void printTwentySix(double y, double a, double b) {
		double s;
		s = a * b * Math.sin(y * Math.PI / 180) / 2;

		System.out.println("Площадь треугольника: " + s);
	}

	// 27. Дано значение a. Не используя никаких функций и никаких операций, кроме
	// умножения, получить значение а8 за три операции и а10 за четыре операции.
	public static void printTwentySeven(int a) {
		int x;
		int y;
		int z;
		int p;

		x = a * a * a;
		y = x * a;

		z = y * x * x;
		p = z * y;

		System.out.println(z + "  " + p);

	}

	// 28. Составить программу перевода радианной меры угла в градусы, минуты и
	// секунды.

	public static void printTwentyEight(double r) {
		double gr;
		double m;
		double s;

		gr = r * 180 / Math.PI;

		m = 60 * (gr - (int) gr);

		s = 60 * (m - (int) m);

		System.out.println("Градусы: " + gr + "; минуты:" + m + "; секунды: " + s);
	}

	// 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
	public static void printTwentyNine(double a, double b, double c) {
		double x;
		double g_d;
		double g_r;
		double a_d;
		double a_r;
		double b_d;
		double b_r;

		x = (a * a + b * b - c * c) / (2 * a * b);
		if (x == 0) {
			System.out.println("угол гамма в градуcах: 90, угол гамма в радианах: 1.571");
		} else {
			g_d = Math.toDegrees(Math.acos(x));
			g_r = Math.acos(x);
			System.out.println("угол гамма в градуcах: " + g_d + ", угол гамма в радианах: " + g_r);
		}

		x = (c * c + b * b - a * a) / (2 * c * b);
		if (x == 0) {
			System.out.println("угол альфа в градуcах: 90, угол альфа в радианах: 1.571");
		} else {
			a_d = Math.toDegrees(Math.acos(x));
			a_r = Math.acos(x);
			System.out.println("угол альфа в градуcах: " + a_d + ", угол альфа в радианах: " + a_r);
		}

		x = (a * a + c * c - b * b) / (2 * a * c);
		if (x == 0) {
			System.out.println("угол бетта в градуcах: 90, угол бетта в радианах: 1.571");
		} else {
			b_d = Math.toDegrees(Math.acos(x));
			b_r = Math.acos(x);
			System.out.println("угол бетта в граду�?ах: " + b_d + ", угол бетта в радианах: " + b_r);
		}
	}

	// 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите
	// сопротивление соединения.

	public static void printThirty(double r1, double r2, double r3) {
		double r;
		r = 1 / ((1 / r1) + (1 / r2) + (1 / r3));

		System.out.println("Сопротивление cоединения= " + r + " Ом");

	}

	// 31. Составить программу для вычисления пути, пройденного лодкой, если ее
	// скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения
	// по озеру t1 ч, а против течения реки — t2 ч.

	public static void printThirtyOne(double v, double v1, double t1, double t2) {
		double s1;
		double s2;
		s1 = v * t1;
		s2 = (v - v1) * t2;

		System.out.println("Путь по озеру = " + s1 + "км");
		System.out.println("Путь против течения реки = " + s2 + "км");
	}

	// 32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к
	// с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?

	public static void printThirtyTwo(int hour, int min, int sec) {
		int hour1 = 2;
		int min1 = 15;
		int sec1 = 50;

		int p;
		int q;
		int r;

		int mtemp;
		int htemp;

		r = (sec1 + sec) % 60;
		mtemp = (sec1 + sec) / 60;
		q = (min1 + min + mtemp) % 60;
		htemp = (min1 + min + mtemp) / 60;
		p = (hour1 + hour + htemp) % 24;

		System.out.println(p + " hours " + q + " mins " + r + " seconds");

	}

	// 33. Ввести любой символ и определить его порядковый номер, а также указать
	// предыдущий и последующий символы
	public static void printThirtyThree(char n) {

		int i;
		char prev;
		char next;

		i = (int) n;

		prev = (char) (i - 1);
		next = (char) (i + 1);

		System.out.println("порядковый номер: " + i);
		System.out.println("предыдущий символ: " + prev);
		System.out.println("последующий символ: " + next);
	}

	// 34. Дана величина А, выражающая объем информации в байтах. Перевести А в
	// более крупные единицы измерения информации.
	public static void printThirtyFour(int a) {
		double n;
		System.out.println("байт=" + a);
		n = (float) a / 1024;
		System.out.println("Kбайт=" + n);
		n = n / 1024;
		System.out.println("Mбайт=" + n);
		n = n / 1024;
		System.out.println("Гбайт=" + n);
		n = n / 1024;
		System.out.println("Тбайт=" + n);

	}

	// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и
	// младшую цифру целой части числа M/N.
	public static void printThirtyFive(int a, int b) {
		int c;
		int min;
		int max_cheslitel;
		int max_znamenatel;
		int d;

		// целая часть
		c = a / b;
		min = getMin(c);
		System.out.println("младшая цифра целой части числа = " + min);

		// дробна�? ча�?ть
		d = a - b * c;
		max_cheslitel = getMax(d);
		max_znamenatel = getMax(b);
		if (max_cheslitel > max_znamenatel) {
			System.out.println("старшая цифра дробной части числа = " + max_cheslitel);
		} else if (max_cheslitel < max_znamenatel) {

			System.out.println("старшая цифра дробной части числа = " + max_znamenatel);
		}

		else

		{
			System.out.println("старшая цифра дробной части числа = " + max_znamenatel);
		}
	}

	public static int getMax(int g) {
		int g_buf;
		int count = 0;
		int max;
		g_buf = g;

		while (g_buf > 0) {
			count = count + 1;
			g_buf = g_buf / 10;
		}

		int[] mas = new int[count];

		// инициализировать ма�?�?ив из цифер
		for (int j = 0; j < mas.length; j++) {
			mas[j] = g % 10;
			g = g / 10;
		}
		// пои�?к �?таршей цифры дрбной ча�?ти чи�?лител�?/знаменател�?
		max = mas[0];
		for (int j = 0; j < mas.length; j++) {
			if (mas[j] > max) {
				max = mas[j];
			}
		}
		return max;
	}

	public static int getMin(int g) {
		int g_buf;
		int count = 0;
		int min;

		// количе�?тов разр�?дов
		if (g == 0) {
			System.out.println("нет целой ча�?ти");
		}
		{
			g_buf = g;
			while (g_buf > 0) {
				count = count + 1;
				g_buf = g_buf / 10;
			}
		}

		int[] mas = new int[count];

		// инициализировать массив из цифр
		for (int j = 0; j < mas.length; j++) {
			mas[j] = g % 10;
			g = g / 10;
		}
		// поиск младшей цифры целой части
		min = mas[0];
		for (int j = 0; j < mas.length; j++) {
			if (mas[j] < min) {
				min = mas[j];
			}
		}
		return min;
	}

	// 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.
	public static void printThirtySix(int n) {
		int a;
		int b;
		int c;
		int d;

		int preven = 1;
		int prodd = 1;

		int[] mas = new int[4];

		a = n / 1000;
		b = (n / 100) % 10;
		c = (n / 10) % 10;
		d = n % 10;

		// Инициализируем маccив
		mas[0] = a;
		mas[1] = b;
		mas[2] = c;
		mas[3] = d;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % 2 == 0) {

				preven = preven * mas[i];
			} else {

				prodd = prodd * mas[i];
			}
		}
		System.out.println((double) preven / prodd);
	}

	// 37. Составить линейную программу, печатающую значение true, если указанное
	// высказывание является истинным, и false — в противном случае:

	// A.Целое число N является четным двузначным числом.

	public static void printThirtySevenA(int n) {
		if ((n % 2 == 0) & (n / 10 > 1)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// B.Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
	// последних цифр.
	public static void printThirtySevenB(int n) {
		int a;
		int b;
		int c;
		int d;
		a = n / 1000;
		b = (n / 100) % 10;
		c = (n / 10) % 10;
		d = n % 10;

		if (a + b == c + d) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// C.Сумма цифр данного трехзначного числа N является четным числом.
	public static void printThirtySevenC(int n) {
		int a;
		int b;
		int c;

		a = n / 100;
		b = (n / 10) % 10;
		c = n % 10;

		if ((a + b + c) % 2 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// D.Точка с координатами (х, у) принадлежит части плоскости, лежащей между
	// прямыми х= т, х= п (т<п).
	public static void printThirtySevenD(double x, double t, double p) {

		if ((x > t) && (x < p)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// E.Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
	public static void printThirtySevenE(int n) {
		int a;
		int b;
		int c;

		a = n / 100;
		b = (n / 10) % 10;
		c = n % 10;

		if (n * n == (a + b + c) * (a + b + c) * (a + b + c)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	// F.Треугольник со сторонами а,b,с является равнобедренным.
	public static void printThirtySevenF(double a, double b, double c) {

		if ((a == b) || (b == c) || (a == c)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// G.Сумма каких-либо двух цифр заданного трехзначного натурального числа N
	// равна третьей цифре.
	public static void printThirtySevenG(int n) {
		int a;
		int b;
		int c;

		a = n / 100;
		b = (n / 10) % 10;
		c = n % 10;

		if ((a + b == c) || (a + c == b) || (c + b == a)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// H.Заданное число N является степенью числа а (показатель степени может
	// находиться в диапазоне от 0 до 4).
	public static void printThirtySevenH(int n, int a) {

		if ((Math.pow(a, 0) == n) || (Math.pow(a, 1) == n) || (Math.pow(a, 2) == n) || (Math.pow(a, 3) == n)
				|| (Math.pow(a, 4) == n)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// K.График функции у = ах2 + bх+ с проходит через заданную точку с координатами
	// (m, п).
	public static void printThirtySevenK(int m, int n) {
		int a;
		int b;
		int c;

		a = 3;
		b = -18;
		c = 27;

		if (n == a * Math.pow(m, 2) + b * m + c) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// 38. Для данных областей составить линейную программу, которая печатает true,
	// если точка с координатами (х, у) принадлежит закрашенной области, и false — в
	// противном случае
	public static void printThirtyEightA(double x, double y) {
		int x1 = -4;
		int y1 = 0;

		int x2 = 0;
		int y2 = 4;

		int x3 = 4;
		int y3 = 0;

		double a;
		double b;
		double c;

		a = (x1 - x) * (y2 - y1) - (x2 - x1) * (y1 - y2);
		b = (x2 - x) * (y3 - y2) - (x3 - x2) * (y2 - y);
		c = (x3 - x) * (y1 - y3) - (x1 - x3) * (y3 - y);

		if ((a >= 0 & b >= 0 & c >= 0) || (a <= 0 & b <= 0 & c <= 0)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static void printThirtyEightB(double x, double y) {
		int x1 = 2;
		int x2 = 4;
		int y1 = 4;

		if ((Math.abs(y) > y1 & Math.abs(x) > x2) || (Math.abs(x) > x1 & y > 0)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static void printThirtyEightC(double x, double y) {
		int r = 4;
		int rb = 5;

		if ((x >= 0 & (Math.pow(x - 0, 2) + Math.pow(y - 0, 2) <= Math.pow(r, 2)))
				|| (y <= 0 & x >= 0 & (Math.pow(x - 0, 2) + Math.pow(y - 0, 2) <= Math.pow(rb, 2)))) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	// 39*. Дано действительное число х. Не пользуясь никакими другими
	// арифметическими операциями, кроме умножения, сложения и вычитания, вычислите
	// за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.
	public static void printThirtyNine(int x) {
		int y;
		int c;
		c = x * x;
		y = 2 * c * (c + 2) - x * (3 * c - 5) + 6;

		System.out.println(y);

	}

	// 40*. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3
	// . Позаботьтесь об экономии операций.
	public static void printFourty(int x) {
		int y1;
		int y2;

		int c;
		c = x * x;
		y1 = -2 * x + c * (3 - 4 * x);
		y2 = 1 + 2 * x + c * (3 + 4 * x);
		System.out.println(y1);
		System.out.println(y2);
	}

}
