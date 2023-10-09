/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: is-a Vehicle and Conditioning
 */
public class Car extends Vehicle implements Conditioning{
    private static final Logger log = Logger.getGlobal();
    private float temp;

    /**
     * No-arg constructor
     */
    public Car() {
        log.info("Car created");
    }
    
    @Override
	public void steer(boolean direction) {
		if(direction)
			System.out.println("Giro a destra come un auto");
		else
			System.out.println("Giro a sinistra come un auto");

	}
	
	@Override
	public void brake() {
		System.out.println("Freno come un auto");
	}

	@Override
	public void setTemperature(float temp) {
		this.temp = temp;
	}
}
