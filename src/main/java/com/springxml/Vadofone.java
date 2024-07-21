package com.springxml;

public class Vadofone implements Sim{

	public Vadofone() {
		System.out.println("Vadofone Constr called ");
	}
	
	@Override
	public void calling() {
		System.out.println("Vadofone sim calling ");
		
	}

	@Override
	public void data() {
		System.out.println("Vadofone sim data calling ");
		
	}

}
