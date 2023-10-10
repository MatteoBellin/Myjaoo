/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;

/**
 * Exercise: create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 */
public class Main {
    /**
     * Create a bunch of actors
     * <p>
     * Let them fight against each others
     * <p>
     * Peer-to-peer fight, the most skilled one wins
     * <p>
     * Wizards always beat warriors
     * <p>
     * In the end, let the user knows who survived
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: create actors, both warriors and wizards
        Actor[] actors = {new Warrior("A"), new Wizard("B"), new Warrior("C"), new Warrior("D"), new Wizard("E")};
        
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " " + actor.getClass().getSimpleName() + " " + actor.getLvl());
        }
        
        boolean result;
        System.out.println("Let's fight ...");
        for (Actor actor : actors) {
            System.out.println("Actor: " + actor.getName());
            for(Actor actor2 : actors) {
            	if(actor != actor2) {
            		//Fight and decrease loser's hp
            		actor.fight(actor2);
            	}
            }
        }
    }
}
