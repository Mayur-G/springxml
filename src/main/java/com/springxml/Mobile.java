package com.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
//		
//		Sim sim = new Vadofone();
//		sim.calling();
//		sim.data();
		
		//app is not configurable , to make it configurable , use spring
		//we should not change source code
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		Airtel air = (Airtel)context.getBean("airtel");
		air.calling();
		air.data();
		
		System.out.println();
		Vadofone vadofone = context.getBean("vadofone",Vadofone.class);
		vadofone.calling();
		vadofone.data();
		
		System.out.println();
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
	}
}
