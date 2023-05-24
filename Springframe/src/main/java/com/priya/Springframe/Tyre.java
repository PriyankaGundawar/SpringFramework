package com.priya.Springframe;

public class Tyre {
	private String brand;

	

	public Tyre(String brand) {  //creating constructor for constructor injection
		super();
		this.brand = brand;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	@Override
	public String toString() {
		return "Tyre [Brand=" + brand + "]";
	}
	
	

}
