/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s6;

/**
 * This exercise should be solved using a method in a primitive wrapper
 */
public class Exercise {
    /**
     * See requests in the "to do" comments
     * 
     * @param args used to test the code
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Pass me one argument!");
        } else {
            // TODO (1) check if the argument contains only digits
        	boolean foundNonDigit = false;
        	for(int i = 0; i < args[0].length(); i++) {
        		if(!Character.isDigit(args[0].charAt(i))) {
        			foundNonDigit = true;
        			break;
        		}
        	}
        	
        	if(foundNonDigit) {
        		System.out.println("La stringa non contiene solo numeri");
        	} else {
        		System.out.println("La stringa contiene solo numeri");
        	}
        	
            // TODO (2) check if the argument contains at least one digit
        	boolean foundDigit = false;
        	for(int i = 0; i < args[0].length(); i++) {
        		if(Character.isDigit(args[0].charAt(i))) {
        			foundDigit = true;
        			break;
        		}
        	}
        	
        	if(foundDigit) {
        		System.out.println("La stringa contiene almeno un numero");
        	} else {
        		System.out.println("La stringa non contiene numeri");
        	}
        	
            System.out.println("Done");
        }
    }
}
