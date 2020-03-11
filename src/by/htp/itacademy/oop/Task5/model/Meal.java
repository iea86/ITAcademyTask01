package by.training.tasks.aliv.oop.Task5.model;

public enum Meal {
	HB(1),
	BB(2),
	AL(3);
	
	private final int mealCode;

	private Meal(int mealCode) {
		this.mealCode = mealCode;
	}

	public int getMealCode() {
		return mealCode;
	}
	

}
