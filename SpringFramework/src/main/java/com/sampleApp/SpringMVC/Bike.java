package com.sampleApp.SpringMVC;

import org.springframework.stereotype.Component;

import com.sample.Interfaces.Vehicle;

@Component
public class Bike  implements Vehicle {
	public  void drive () {
		System.out.println("Bike is running..");
	}
}
