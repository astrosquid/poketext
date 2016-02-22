package com.somerpg;

import java.util.Properties;
import java.util.HashMap;
import java.io.*;

public class UsePropFile {

	InputStream inputStream;
	private static String path
		= "/Users/chris/Documents/workspace/some-rpg/src/com/somerpg/";
	
	//looks up a property file in another prop file
	public void writeToProp(String propToSave)
	{
		
	}
	
	/*
	 * Makes an array of property values based on the index of
	 * the array it will return. For each index in the array.
	 * it calls the number padding method, which will give this
	 * a string that can be used as a key in a property file.
	 * Since it will return an entire array, this is meant 
	 * mostly for initialization. 
	 */
	public static String[] getPropValues(String propFileName,
			int arrayLength) throws IOException
	{
		String[] propValues = new String[arrayLength];
		
		try
		{
			Properties prop = new Properties();
			prop.load(new FileInputStream(
					path+propFileName));
			/*inputStream = getClass().getClassLoader().
					getResourceAsStream(
					"/Users/chris/Documents/workspace/some-rpg"+propFileName);
			
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			*/
			String lookup;
			for (int i = 0; i < arrayLength; i++)
			{
				lookup = Utilities.padPropIndex(i);
				propValues[i] = prop.getProperty(lookup);
			}
		}
		catch(Exception err)
		{
			err.printStackTrace();
		}
		finally
		{
			//inputStream.close();
		}
		
		return propValues;
	}
	
}
