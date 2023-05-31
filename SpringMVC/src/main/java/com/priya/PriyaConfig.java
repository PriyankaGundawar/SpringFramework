package com.priya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.priya"}) //package name 
public class PriyaConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {  //this config is to remove extension(.jsp) from Controller class.
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
	

}

//this class has created to remove priya-servlet.xml file.
