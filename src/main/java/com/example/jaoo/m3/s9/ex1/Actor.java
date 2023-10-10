/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;

import java.util.Random;

/**
 * Exercise: create a hierarchy of classes
 * <p>
 * Abstract base class
 */
public abstract class Actor {
	protected String name;
	protected int lvl;
	protected int hp;
	protected Random rand = new Random();

	/**
	 * Canonical constructor
	 * 
	 * @param name the actor name
	 */
	protected Actor(String name, int lvl) {
		this.name = name;
		this.lvl = lvl;
	}
	
	protected Actor(String name) {
		this.name = name;
		this.hp = 1;
		this.lvl = rand.nextInt(3);
	}

	/**
	 * Fight against an enemy
	 * 
	 * @param enemy another actor
	 * @return true if the current actor wins
	 */
	public abstract boolean fight(Actor enemy);

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getLvl() {
		return this.lvl;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void decreaseHp(int dec) {
		this.hp -= dec;
		if(this.hp < 0)
			this.hp = 0;
	}
	
	public void increaseHp(int inc) {
		this.hp += inc;
	}
}
