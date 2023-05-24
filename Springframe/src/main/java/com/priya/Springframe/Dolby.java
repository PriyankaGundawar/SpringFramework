package com.priya.Springframe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dolby implements Music {
   
	//@Autowired
	public void sound() {
		System.out.println("it Dolby Music");

	}

}
