package by.training.tasks.aliv.oop.Task3.model;

import java.util.ArrayList;
import java.util.List;

public class State {

	private String stateName;
	private List<Region> regions = new ArrayList<Region>();

	public State() {
	}

	public State(String stateName, List<Region> regions) {
		this.stateName = stateName;
		this.regions = regions;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", regions=" + regions + "]";
	}

}
