package by.training.tasks.aliv.simpleobjects.Task5;

public class Schetchik {
	private int start;
	private int end;
	private int currentState;

	public Schetchik() {

	}

	public Schetchik(int start, int end, int currentState) {
		this.start = start;
		this.end = end;
		this.currentState = currentState;
	}

	public void toIncrease() {
		currentState++;

		if (currentState > end) {
			currentState = 0;
		}
	}

	public void toDecrease() {
		currentState--;

		if (currentState < start) {
			currentState = 0;
		}
	}

	public int getCurrentState() {
		return currentState;
	}

}
