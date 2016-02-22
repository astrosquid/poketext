package com.somerpg;

public class Hero extends Character {

	private String			name;
	private int				maxHealth;
	private int				currentHealth;
	
	public Hero(String name, int maxHealth, 
			int currentHealth)
	{
		this.name = name;
		this.maxHealth = maxHealth;
		this.currentHealth = currentHealth;
	}
	
	
}
