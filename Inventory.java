package com.somerpg;

import java.io.FileReader;
import java.util.Properties;

public class Inventory {
	
	private int pokeCount		= 226;

	private String[] itemNames		= new String[pokeCount];
	private String[] itemDescs		= new String[pokeCount];
	private int[] itemQuantities 	= new int[pokeCount];
	
	public Inventory()
	{
		
	}
}
