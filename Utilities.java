package com.somerpg;

public class Utilities {
	
	/*
	 * If a number is less than three digits long,
	 * this will return a string of the number that's 
	 * padded out to three places.
	 * If a number already has three orders of magnitude,
	 * this will simply return a string version of 
	 * the number.
	 */
	public static String padPropIndex(int index)
	{
		if (shouldIntBePadded(index))
		{
			String formatted = String.format("%03d", index);
			return formatted;
		}
		else
		{
			return String.valueOf(index);
		}
	}
	
	/*
	 * Tests to see if a number has less than three places.
	 */
	public static boolean shouldIntBePadded(int index)
	{
		int length = String.valueOf(index).length();
		if (length < 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
