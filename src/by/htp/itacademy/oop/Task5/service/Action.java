package by.training.tasks.aliv.oop.Task5.service;

import by.training.tasks.aliv.oop.Task5.model.Voucher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Action {

	public List<Voucher> getOfferperChoice(List<Voucher> offer, int transportCode, int mealCode, int durationCode) {
		List<Voucher> offerperChoice = new ArrayList<Voucher>();

		for (Voucher v : offer) {
			if (v.getTransport().getTransportCode() == transportCode && v.getMeal().getMealCode() == mealCode
					&& v.getDuration().getDurationCode() == durationCode) {
				offerperChoice.add(v);
			}
		}
		return offerperChoice;
	}

	public void sortbyPrice(List<Voucher> offer) {
		Collections.sort(offer);

	}

}
