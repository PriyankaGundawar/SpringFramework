package com.priya.Springframe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarAutowire implements Vehicle{
	
	@Autowired
	private TyreAutowire tyreautowire;
	
	
	
	public TyreAutowire getTyreautowire() {
		return tyreautowire;
	}



	public void setTyreautowire(TyreAutowire tyreautowire) {
		this.tyreautowire = tyreautowire;
	}



	public void drive() {
		System.out.println("driving " + tyreautowire);
	}

}
