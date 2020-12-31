package com.sampleApp.SpringMVC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.Interfaces.Vehicle;

public class SampleApp{
	public static void main ( String [] args) {
		System.out.println("Main Method Invoked");
		

		//BeanFactory - small application 
		//ApplicationContext - WEB APPLICATION 	/ Enterprise application 
		
		//	Vehicle obj=new Car();	obj.drive();
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		//Vehicle obj = (Vehicle) context.getBean("vehicle");	
		
		Vehicle obj = (Vehicle) context.getBean("bike");
		obj.drive();
		
		
	}

}
