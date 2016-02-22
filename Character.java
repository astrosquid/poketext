package com.somerpg;

public abstract class Character {

	private String			name;
	private int				money;
	
	public Character() {}
	
	public Character(String name, int money)
	{
		this.name = name;
		this.money = money;
	}

	public void loadInventory()
	{
		
	}
	
	public void useInventoryItem()
	{
		
	}
	
	public String getName() 
	{
		return name;
	}
	
	public int getMoney()
	{
		return this.money;
	}
	
	public void gainMoney(int moneyGained)
	{
		this.money += moneyGained;
	}
	
	public void loseMoney(int moneyLost)
	{
		if (money - moneyLost <= 0)
		{
			money = 0;
		}
		else
		{
			money -= moneyLost;
		}
	}
	
}
