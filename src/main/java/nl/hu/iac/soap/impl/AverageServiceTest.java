package nl.hu.iac.soap.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class AverageServiceTest {
	private AverageService avgService = new AverageService();
	private List<Double> doubles;
	
	@Before
	public void setup() {
		this.doubles.set(0, -50.00);
		this.doubles.set(1, 30.00);
	}
	
	@Test
	public void testCalcAverageEqualTo() {
		assertEquals(20, avgService.calcAverage(this.doubles), 0);
	}
}
