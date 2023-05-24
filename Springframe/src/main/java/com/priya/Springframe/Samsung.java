package com.priya.Springframe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor cpu;
	@Autowired
	Music soundV;	

	public Music getSoundV() {
		return soundV;
	}


	public void setSoundV(Music soundV) {
		this.soundV = soundV;
	}


	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config() {
		System.out.println("Octa core");
		cpu.process();
		soundV.sound();
	}

}
