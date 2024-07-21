package com.springxml;

public class Airtel implements Sim{

	public Airtel() {
		System.out.println("Airtel Constr called ");
	}
	
	@Override
	public void calling() {
		System.out.println("Airtel sim calling ");
		
	}

	@Override
	public void data() {
		System.out.println("Airtel sim data calling ");
		
	}

}
