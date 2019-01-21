package com.KrissSaviour.CarCollection.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.KrissSaviour.CarCollection.integration.dto.Cars;

@Component
public class CarCollectionRestClientImpl implements CarCollectionRestClient {

	@Override
	public Cars findCar(String plateNumber) {
		RestTemplate restTemplate = new RestTemplate();
		
		return restTemplate.getForObject("http://localhost:8080/carparking/findcar/"+plateNumber,Cars.class);
	}

	@Override
	public Cars getCar(String plateNumber) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:8080/carparking/getcar/"+plateNumber,Cars.class);
	}

}
