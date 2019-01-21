package com.KrissSaviour.CarCollection.integration.dto;


/*
 * This is the car model class use for the car Data transfer Object
 * */

public class Cars {

	
	private int id;
	private String plateNumber;
	private ParkingSpot parkingSpot;

	/**
	 * No Args Constructor
	 */
	public Cars() {

	}

	/**
	 * @param id
	 * @param carPlateNumber
	 */
	public Cars(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	@Override
	public String toString() {
		return "Cars [id=" + id + ", plateNumber=" + plateNumber + "]";
	}

	
	

	
}
