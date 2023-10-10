package com.example.jaoo.m3.s9.ex1;

import java.util.Random;

public class Warrior extends Actor {

	public Warrior(String name, int lvl) {
		super(name, lvl);
	}

	public Warrior(String name) {
		super(name);
	}

	@Override
	public boolean fight(Actor enemy) {
		Random result = new Random();
		boolean res = result.nextBoolean();
		if (enemy.getClass().getSimpleName().equals("Wizard")) {
			this.decreaseHp(1);
			if (enemy.getHp() == 0)
				System.out.println(this.getName() + " loses!");
			return false;
		} else if (this.lvl > enemy.getLvl()) {
			enemy.decreaseHp(1);
			if (enemy.getHp() == 0)
				System.out.println(this.getName() + " wins!");
			return true;
		} else if (this.lvl < enemy.getLvl()) {
			this.decreaseHp(1);
			if (this.getHp() == 0)
				System.out.println(this.getName() + " loses!");
			return false;
		} else if (res) {
			enemy.decreaseHp(1);
			if (enemy.getHp() == 0)
				System.out.println(this.getName() + " wins!");
			return true;
		} else {
			this.decreaseHp(1);
			if (this.getHp() == 0)
				System.out.println(this.getName() + " loses!");
			return false;
		}
	}

}
