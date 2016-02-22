package com.somerpg;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Inventory {
	
	private static int itemCount		= 10;
	private static String itemPropFile = "pokemonitems.properties";
	private String itemQuantPropFile;

	private static String[] itemNames;
	private String[] itemDescs;
	private static int[] itemQuantities;
	
	public Inventory()
	{
		
	}
	
	public static void init()
	{
		try
		{
			itemNames = UsePropFile.getPropValues(
					itemPropFile, itemCount);
		}
		catch(IOException ioerr)
		{
			ioerr.printStackTrace();
		}
	}
	
	public static String getItemName(int itemIndex)
	{
		return itemNames[itemIndex];
	}
	
	public static int getItemQuantity(int itemIndex)
	{
		return itemQuantities[itemIndex];
	}
}
