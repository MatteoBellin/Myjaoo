/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s8.exercise;

/**
 * Complete the code
 * 
 * @see Main the user class
 */
public class Circle {
    // TODO: every circle should have its own radius
	private double radius;

    /**
     * Constructor
     * 
     * @param radius the circle radius
     */
    public Circle(double radius) {
        // TODO: initialize the current circle radius
    	this.radius = radius;
    }

    /**
     * The circle area is π * radius ^ 2
     * 
     * @return the circle area
     */
    public double area() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    /**
     * The circle perimeter is 2 * π * radius
     * 
     * @return the circle perimeter
     */
    public double perimeter() {
        return this.radius * 2 * Math.PI;
    }
}
