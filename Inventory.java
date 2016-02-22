package com.somerpg;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Inventory {
	
	private static int itemCount		= 10;
	private static String itemPropFile 
		= "pokemonitems.properties";
	private static String itemQuantPropFile
		= "itemquantities.properties";

	private static String[] itemNames;
	private static String[] itemDescs;
	private static int[] itemQuantities;
	
	public static void init(String propertyFileName)
	{
		try
		{
			itemNames = UsePropFile.getPropValues(
					propertyFileName, itemCount);
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
