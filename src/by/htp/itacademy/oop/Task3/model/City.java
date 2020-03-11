package by.training.tasks.aliv.oop.Task3.model;

public class City {
	private String cityName;
	private boolean isCapital;
	private boolean isRegionCenter;

	public City() {
		this.cityName = "не определен";
		this.isCapital = false;
		this.isRegionCenter = false;
	}

	public City(String cityName, boolean isCapital, boolean isRegionCenter) {
		this.cityName=cityName;
		this.isCapital=isCapital;
		this.isRegionCenter=isRegionCenter;		
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public boolean isCapital() {
		return isCapital;
	}

	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}

	public boolean isRegionCenter() {
		return isRegionCenter;
	}

	public void setRegionCenter(boolean isRegionCenter) {
		this.isRegionCenter = isRegionCenter;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", isCapital=" + isCapital + ", isRegionCenter=" + isRegionCenter + "]";
	}
	
	

}
