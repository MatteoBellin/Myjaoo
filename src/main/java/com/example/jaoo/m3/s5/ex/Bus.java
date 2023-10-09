/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: Bus is-a Vehicle and Conditioning
 */
public class Bus extends Vehicle implements Conditioning {
	private static final Logger log = Logger.getGlobal();
	private float temp;

	/**
	 * No-arg constructor
	 */
	public Bus() {
		log.info("Bus created");
	}

	@Override
	public void steer(boolean direction) {
		if(direction)
			System.out.println("Giro a destra come un bus");
		else
			System.out.println("Giro a sinistra come un bus");
	}
	
	
	@Override
	public void brake() {
		System.out.println("Freno come un bus");
	}

	@Override
	public void setTemperature(float temp) {
		this.temp = temp;
	}
}
