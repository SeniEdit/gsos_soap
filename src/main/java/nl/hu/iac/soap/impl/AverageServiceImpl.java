package nl.hu.iac.soap.impl;

import javax.jws.WebService;

import nl.hu.iac.soap.wsinterface.Fault;
import nl.hu.iac.soap.wsinterface.AverageFault;
import nl.hu.iac.soap.wsinterface.AverageRequest;
import nl.hu.iac.soap.wsinterface.AverageResponse;
import nl.hu.iac.soap.wsinterface.AverageServiceInterface;

@WebService(endpointInterface = "nl.hu.iac.soap.wsinterface.AverageServiceInterface")
public class AverageServiceImpl implements AverageServiceInterface {
	private AverageService avgService = new AverageService();

	public AverageResponse calculateaverage(AverageRequest request) throws Fault {		
		
		AverageResponse response = new AverageResponse();
		try {
			Double result = this.avgService.calcAverage(request.getValues());
			response.setResult(result);
		} catch (RuntimeException e) {
			AverageFault x = new AverageFault();
			x.setErrorCode((short) 1);
			Fault fault = new Fault(
					"Er ging iets mis met het berekenen van het gemiddelde", x);
			throw fault;
		}
		return response;
	}
} 