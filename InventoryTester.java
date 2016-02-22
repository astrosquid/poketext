package com.somerpg;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventoryTester {

	@Test
	public void test() {
		
		//File here = new File(".");
		//System.out.println(here.getAbsolutePath());
		
		assert(Inventory.getItemName(0).equals("Nothing"));
		assert(Inventory.getItemName(9).equals("Pokedex"));
		assert(Inventory.getItemName(5).equals("Town Map"));
		
		assert(Inventory.getItemQuantity(5).equals("99"));
		assert(Inventory.getItemQuantity(7).equals("4"));
		
		String[] names;
		String[] quant;
		names = Inventory.getNamesArray();
		quant = Inventory.getQuantArray();
		System.out.println("woohoo");
		for (int i = 0; i < names.length; i++)
		{
			System.out.print("item "+i+" is "+names[i]
					+" of which there are "+quant[i]);
		}
	}

}
