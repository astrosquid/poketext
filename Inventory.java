package com.somerpg;

import java.io.IOException;

public class Inventory {
	
	private static int itemCount		= 10;
	/*
	private static String itemPropFile 
		= "pokemonitems.properties";
	private static String itemQuantPropFile
		= "itemquantities.properties";
	*/

	private static String[] itemNames;
	private static String[] itemDescs;
	private static String[] itemQuants;
	private static String itemNamesProp = "pokemonitems.properties";
	private static String itemQuantsProp = "itemquantities.properties";
	
	static
	{
		init(itemNames, itemNamesProp);
		init(itemQuants, itemQuantsProp);
	}
	
	/*
	 * This method must be called as many times as there are
	 * property files necessary for it to fetch info from.
	 * Eventually I think I can abstract this out to an even
	 * higher layer, since monsters will likely be doing the 
	 * same thing.
	 * @TODO: abstract this further.
	 */
	public static void init(String[] itemArray, 
			String propertyFileName)
	{
		System.out.println("in init begin");
		try
		{
			itemArray = UsePropFile.getPropValues(
					propertyFileName, itemCount);
		}
		catch(IOException ioerr)
		{
			ioerr.printStackTrace();
		}
	}
	
	public static String[] getNamesArray()
	{
		return itemNames;
	}
	
	public static String[] getQuantArray()
	{
		return itemQuants;
	}
	
	public static String getItemName(int itemIndex)
	{
		return itemNames[itemIndex];
	}
	
	public static String getItemQuantity(int itemIndex)
	{
		return itemQuants[itemIndex];
	}
}
