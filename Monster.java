package com.somerpg;

public class Monster {

	private String			name;
	private String			nickname;
	private String			primaryType;
	private String			secondaryType;
	
	private int				level;
	private int				currentXp;
	private int				levelUpXp;
	private int				maxHealth;
	private int				currentHealth;
	
	private String			status;
	private String			heldItem;
	
	private String			move1;
	private String			move2;
	private String			move3;
	private String			move4;
	
	private String			originalTrainer;
	private String			ownerCode;
	
	public Monster() {}
	
	public Monster(String name, String nickname, String type,
			int maxHealth, int currentHealth,
			String primaryType, String secondaryType,
			String status, String heldItem)
	{
		this.name = name;
		this.nickname = nickname;
		this.maxHealth = maxHealth;
		this.currentHealth = currentHealth;
		this.primaryType = primaryType;
		this.secondaryType = secondaryType;
		this.status = status;
		this.heldItem = heldItem;
	}
	
	public void takeDamage(int damageTaken)
	{
		currentHealth -= damageTaken;
	}
	
	public void gainHealth(int healthGained)
	{
		if (currentHealth + healthGained >= maxHealth)
		{
			currentHealth = maxHealth;
		}
		else 
		{
			currentHealth += healthGained;
		}
	}
	
	//must be 1, 2, 3, or 4
	public void useMove(int move)
	{
		switch(move)
		{
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}
	
}
