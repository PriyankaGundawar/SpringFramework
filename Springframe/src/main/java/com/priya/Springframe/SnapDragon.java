package com.priya.Springframe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SnapDragon implements MobileProcessor {
//    @Autowired
	public void process() {
		System.out.println("World best CPU");

	}

}
