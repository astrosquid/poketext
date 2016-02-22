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
	}

}
