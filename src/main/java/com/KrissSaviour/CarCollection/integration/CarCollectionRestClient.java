package com.KrissSaviour.CarCollection.integration;

import com.KrissSaviour.CarCollection.integration.dto.Cars;

public interface CarCollectionRestClient {

	public Cars findCar(String plateNumber);
	
	public Cars getCar(String plateNumber);
}
