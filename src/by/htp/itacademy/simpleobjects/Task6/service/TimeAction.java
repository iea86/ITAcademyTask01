package by.training.tasks.aliv.simpleobjects.Task6.service;


//6. Составьте описание класса для представления времени. 
//Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) 
//с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле 
//устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.

import by.training.tasks.aliv.simpleobjects.Task6.model.Time;

public class TimeAction {

	public Time setHours(Time t, int hour) {
		if (hour < 0) {
			t.setHour(0);
		} else {
			t.setHour(hour);
		}

		return t;

	}

	public Time setMinutes(Time t, int minute) {
		if (minute > 60 || minute < 0) {
			t.setMinute(0);
			;
		} else {
			t.setMinute(minute);
		}

		return t;

	}

	public Time setSeconds(Time t, int seconds) {
		if (seconds > 60 || seconds < 0) {
			t.setSeconds(0);
			;
		} else {
			t.setSeconds(seconds);
		}

		return t;

	}

	public Time changetHours(Time t, int hour) {
		t.setHour(t.getHour() + hour);

		return t;

	}

	public Time changeMinutes(Time t, int minute) {
		int newM = t.getMinute() + minute;
		if (newM > 60) {
			int m = newM % 60;// дробная часть от деления
			int h = (t.getMinute() + minute - m) / 60; /// целая часть от деления
			t.setHour(t.getHour() + h);
			t.setMinute(m);

		} else {
			t.setMinute(t.getMinute() + minute);
		}
		return t;

	}

	public Time changeSeconds(Time t, int seconds) {
		int newS = t.getSeconds() + seconds;
		System.out.println(newS);
		if (newS > 60) {
			int s = newS % 60;// дробная часть от деления

			int m = (t.getSeconds() + seconds - s) / 60; /// целая часть от деления

			t = changeMinutes(t, m);
			t.setSeconds(s);

		} else {
			t.setSeconds(t.getSeconds() + seconds);
		}
		return t;

	}

}
