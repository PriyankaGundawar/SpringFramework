package com.priya.Springframe;

import org.springframework.stereotype.Component;

@Component
public class TyreAutowire {
	private String brand;
	

	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	@Override
	public String toString() {
		return "working from tyre";
	}
	
	

}
