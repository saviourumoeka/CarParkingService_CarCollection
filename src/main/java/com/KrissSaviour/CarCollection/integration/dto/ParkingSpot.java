package com.KrissSaviour.CarCollection.integration.dto;


/*
 * This is the parking spot model class use to create the parking spot table in the DB
 * */


public class ParkingSpot {

	private int id;
	private String spotName;
	private Boolean vacancy;
	private Cars car;

	/**
	 * No ARGS
	 */
	public ParkingSpot() {
	}

	/**
	 * @param id
	 * @param parkingSpot
	 * @param vacancy
	 */
	public ParkingSpot(int id, String spotName, boolean vacancy) {
		this.id = id;
		this.spotName = spotName;
		this.vacancy = vacancy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpotName() {
		return spotName;
	}

	public void setParkingSpot(String parkingSpot) {
		this.spotName = parkingSpot;
	}

	public boolean isVacancy() {
		return vacancy;
	}

	public void setVacancy(boolean vacancy) {
		this.vacancy = vacancy;
	}

	public Cars getCar() {
		return car;
	}

	public void setCar(Cars car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "ParkingSpot [id=" + id + ", spotName=" + spotName + ", vacancy=" + vacancy + ", car=" + car + "]";
	}

}
