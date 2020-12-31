package com.sampleApp.SpringMVC;

import org.springframework.stereotype.Component;

import com.sample.Interfaces.Vehicle;

@Component
public class Car implements Vehicle{

	public  void drive () {
		System.out.println("CAR is running");
	}
}
