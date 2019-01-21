package com.KrissSaviour.CarCollection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.KrissSaviour.CarCollection.integration.CarCollectionRestClientImpl;
import com.KrissSaviour.CarCollection.integration.dto.Cars;

@Controller
public class CarCollectionController {

	private ModelMap model;
	
	@Autowired
	private CarCollectionRestClientImpl carRestClient;

	// loads Index page
	@RequestMapping("/")
	public String index(ModelMap mode) {
		if (model == null) {
			return "index";
		}
		mode.addAttribute("msg", model.get("msg"));
		return "index";
	}
	
	@RequestMapping("/checkCar")
	public String checkCar(@RequestParam("plateNumber") String plateNumber, ModelMap mode) {
		
		Cars car = carRestClient.findCar(plateNumber);
		
		if(car == null) {
			model=mode.addAttribute("msg", "Sorry Car with "+plateNumber+" not parked here");
			return "redirect:/";
		}
		
		model=mode.addAttribute("msg", "Car with plate number "+plateNumber+" is parked at "+car.getParkingSpot().getSpotName());
		return "redirect:/";
	}
}
