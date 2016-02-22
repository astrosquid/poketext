package com.somerpg;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventoryTester {

	@Test
	public void test() {
		
		String itemprop = "pokemonitems.properties";
		String itemq = "itemquantities.properties";
		
		//File here = new File(".");
		//System.out.println(here.getAbsolutePath());
		
		Inventory.init(itemprop);
		Inventory.init(itemq);
		
		assert(Inventory.getItemName(0).equals("Nothing"));
		assert(Inventory.getItemName(9).equals("Pokedex"));
		assert(Inventory.getItemName(5).equals("Town Map"));
		
		assert(Inventory.getItemQuantity(5) == 99);
		assert(Inventory.getItemQuantity(7) == 4);
		assert(Inventory.getItemQuantity(0) == 0);
	}

}
