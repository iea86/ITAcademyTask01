package by.training.tasks.aliv.oop.Task3.model;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String districtName;
	private double Square;
	private List<City> districtcities = new ArrayList<City>();

	public District() {
		this.districtName = "не определен";
		this.Square = 0;
	}

	public District(String districtName, double square, List<City> districtcities) {
		this.districtName = districtName;
		this.Square = square;
		this.districtcities = districtcities;

	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public double getSquare() {
		return Square;
	}

	public void setSquare(double square) {
		Square = square;
	}

	public List<City> getDistrictcities() {
		return districtcities;
	}

	public void setDistrictcities(List<City> districtcities) {
		this.districtcities = districtcities;
	}

}
