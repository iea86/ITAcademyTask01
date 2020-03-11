package by.training.tasks.aliv.simpleobjects.Task6.main;


import by.training.tasks.aliv.simpleobjects.Task6.model.Time;
import by.training.tasks.aliv.simpleobjects.Task6.service.TimeAction;
import by.training.tasks.aliv.simpleobjects.Task6.view.TimeInput;

public class Main {

	public static void main(String[] args) {
		TimeInput input = new TimeInput();
		TimeAction action = new TimeAction();
		Time t;
		t = input.create();
		input.print(t);

		System.out.println("устанавливаем время");
		int h = input.inputHour();
		action.setHours(t, h);
		input.print(t);

		int m = input.inputMinute();
		action.setMinutes(t, m);
		input.print(t);

		int s = input.inputSeconds();
		action.setSeconds(t, s);
		input.print(t);
		
		System.out.println("изменяем time");

		// изменяем time на hs часов
		int hs = input.inputHour();
		t = action.changetHours(t, hs);
		input.print(t);

		// изменяем time на ms минут
		int ms = input.inputMinute();
		t = action.changeMinutes(t, ms);
		input.print(t);

		// изменяем time на ss секунд
		int ss = input.inputSeconds();
		t = action.changeSeconds(t, ss);
		input.print(t);

	}

}
