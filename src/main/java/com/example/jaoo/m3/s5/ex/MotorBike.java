/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: MotorBike is-a Vehicle
 */
public class MotorBike extends Vehicle {
	private static final Logger log = Logger.getGlobal();

	/**
	 * No-arg constructor
	 */
	public MotorBike() {
		log.info("MotorBike created");
	}

	@Override
	public void steer(boolean direction) {
		if (direction)
			System.out.println("Giro a destra come una moto");
		else
			System.out.println("Giro a sinistra come una moto");

	}

	@Override
	public void brake() {
		System.out.println("Freno come una moto");
	}
}
