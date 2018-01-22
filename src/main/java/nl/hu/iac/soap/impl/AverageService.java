package nl.hu.iac.soap.impl;

import java.util.List;

public class AverageService {
	
	public AverageService() { }
	
	public Double calcAverage(List<Double> list) {
		Double total = 0.00;
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		
		return total / list.size();
	}
}
