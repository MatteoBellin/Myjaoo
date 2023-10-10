package com.example.jaoo.m3.s9.ex1;

import java.util.Random;

public class Wizard extends Actor {

	protected Wizard(String name, int lvl) {
		super(name, lvl);
	}
	
	public Wizard(String name) {
		super(name);
	}

	@Override
	public boolean fight(Actor enemy) {
		Random result = new Random();
		boolean res = result.nextBoolean();
		if(enemy.getClass().getSimpleName().equals("Warrior"))
			return true;
		else if(this.lvl > enemy.getLvl())
			return true;
		else if(this.lvl < enemy.getLvl())
			return false;
		else
			if(res)
				return true;
			else
				return false;
	}
	
	

}
