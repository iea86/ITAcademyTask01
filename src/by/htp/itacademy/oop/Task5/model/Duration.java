package by.training.tasks.aliv.oop.Task5.model;

public enum Duration {
	 ONE(1), TWO(2), FOUR(4), EIGHT(8), TEN(10), ELEVEN(11), TWENTY(12);
	
	private final int durationCode;
	
	

	private Duration(int durationCode) {
		this.durationCode = durationCode;
	}



	public int getDurationCode() {
		return durationCode;
	}
	
	

}
