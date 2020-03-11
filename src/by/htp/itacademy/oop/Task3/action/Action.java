package by.training.tasks.aliv.oop.Task3.action;

import by.training.tasks.aliv.oop.Task3.model.City;
import by.training.tasks.aliv.oop.Task3.model.District;
import by.training.tasks.aliv.oop.Task3.model.Region;
import by.training.tasks.aliv.oop.Task3.model.State;

import java.util.ArrayList;
import java.util.List;



public class Action {
	public City getCapital(State st) {

		List<Region> regions = st.getRegions();

		for (Region r : regions) {
			List<District> districts = r.getRegiondistricts();
			for (District d : districts) {
				List<City> cities = d.getDistrictcities();
				for (City c : cities) {
					if (c.isCapital()) {
						return c;
					}
				}

			}

		}

		return null;

	}

	public int getNumberOfRegions(State st) {
		int number = st.getRegions().size();

		return number;
	}

	public int getSquare(State st) {
		int s=0;
		List<Region> r = st.getRegions();

		for (Region region : r) {
			List<District> d = region.getRegiondistricts();
			for (District district : d) {
				s += district.getSquare();
			}

		}

		return s;
	}
	
	public List<City> getRegionCenters(State st) {
		List<City> result = new ArrayList<City>();
		List<Region> regions = st.getRegions();

		for (Region region : regions) {
			List<District> districts = region.getRegiondistricts();
			for (District district : districts) {
				List<City> c = district.getDistrictcities();
				for (City city: c) {
					if (city.isRegionCenter()) {result.add(city);}
				}
				
			}

		}

		return result;
	}

}
