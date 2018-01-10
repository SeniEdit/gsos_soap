package nl.hu.iac.soap.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class AverageServiceTest {
	private AverageService avgService = new AverageService();
	private Double x;
	private Double y;
	
	@Before
	public void setup() {
		this.x = (double) 10;
		this.y = (double) 30;
	}
	
	@Test
	public void testCalcAverageEqualTo() {
		assertEquals(20, avgService.calcAverage(x, y), 0);
	}
}
