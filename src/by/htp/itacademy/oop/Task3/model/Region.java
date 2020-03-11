package by.training.tasks.aliv.oop.Task3.model;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private String regionName;	
	private List<District> regiondistricts =  new ArrayList<District>();
	

	public Region() {		
	}


	public Region(String regionName, List<District> regiondistricts) {		
		this.regionName = regionName;
		this.regiondistricts=regiondistricts;
	}


	public String getRegionName() {
		return regionName;
	}


	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}


	public List<District> getRegiondistricts() {
		return regiondistricts;
	}


	public void setRegiondistricts(List<District> regiondistricts) {
		this.regiondistricts = regiondistricts;
	}


	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", regiondistricts=" + regiondistricts + "]";
	}
	
	
}