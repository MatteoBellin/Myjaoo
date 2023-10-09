/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.Arrays;

/**
 * Interface vs class exercise
 */
public class Main {
    /**
     * See requests in the "to do" comments
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: (1) put objects of (at least) three different types in this array
        Vehicle[] vehicles = {new Car(), new Bus(), new MotorBike()};
        System.out.println(Arrays.toString(vehicles));

        // TODO: (2) let all vehicle steer in alternate directions
        boolean direction = true;
        for(Vehicle v : vehicles) {
        	v.steer(direction);
        	direction = !direction;
        }

        // TODO: (3) put objects of (at least) three different types in this array
        Conditioning[] conditionings = {new Bus(), new Car(), new Flat()};
        System.out.println(Arrays.toString(conditionings));

        // TODO: (4) set the temperature of each conditioned to 20
        for(Conditioning c : conditionings) {
        	c.setTemperature(20);
        }
    }
}
