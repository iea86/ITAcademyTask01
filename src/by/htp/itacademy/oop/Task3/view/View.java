package by.training.tasks.aliv.oop.Task3.view;

import by.training.tasks.aliv.oop.Task3.model.City;
import by.training.tasks.aliv.oop.Task3.model.District;
import by.training.tasks.aliv.oop.Task3.model.Region;
import by.training.tasks.aliv.oop.Task3.model.State;

import java.util.ArrayList;
import java.util.List;



public class View {

	public State create() {

		List<City> ct1 = new ArrayList<City>();
		ct1.add(new City("Minsk", true, true));
		ct1.add(new City("Derginsk", false, false));
		District district1 = new District("Minsk district", 5000, ct1);

		List<City> ct2 = new ArrayList<City>();
		ct2.add(new City("Soligorsk", true, false));
		ct2.add(new City("Slutsk", false, false));

		District district2 = new District("Soligorsk district", 5000, ct2);

		List<City> ct3 = new ArrayList<City>();
		ct3.add(new City("Gomel", false, true));
		ct3.add(new City("rechica", false, false));

		District district3 = new District("Gomel district", 5000, ct3);

		List<District> regiondistrictsMinsk = new ArrayList<District>();
		regiondistrictsMinsk.add(district1);
		regiondistrictsMinsk.add(district2);

		Region region1 = new Region("Minsk region", regiondistrictsMinsk);

		List<District> regiondistrictsGomel = new ArrayList<District>();
		regiondistrictsGomel.add(district3);

		Region region2 = new Region("Gomel region", regiondistrictsGomel);

		List<Region> regions = new ArrayList<Region>();
		regions.add(region1);
		regions.add(region2);

		State state = new State("Belarus", regions);

		return state;

	}

	public void print(List<City> cities) {
		System.out.println("Областные центры:");

		for (City city : cities) {
			System.out.println(city.getCityName());
		}

	}
}
