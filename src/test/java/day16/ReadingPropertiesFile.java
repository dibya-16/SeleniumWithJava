package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {
	
	/*
	 have to create a file name config.properties at testData folder
	 here ei value gula thakbe
	 appURL="https://www.moneycontrol.com/";
	 email="adg@gmail.com";
	 password="xy34"
	 
	 
	 */

	public static void main(String[] args) throws FileNotFoundException {
		//Location of properties file
		FileInputStream file=new FileInputStream(System.getProperty("dir.user")+"\\testData\\config.properties");
		//Loading properties file
		Properties propertiesObject=new Properties();
		propertiesObject.load(file);
		
		//reading data from properties file
		String url=propertiesObject.getProperty(" appURL");
		String email=propertiesObject.getProperty("email");
		String password=propertiesObject.getProperty("password");
		
		System.out.println(url+" "email+" "+password);
		
		//reading all the keys from properties file
		//Set<String> keys=propertiesObject.stringPropertyNames();
		//System.out.println(keys);
		
		Set<String> keys=propertiesObject.keySet();
		System.out.println(keys);
		
		//reading all the values from properties files
		Collection<Object> values=propertiesObject.values();
		System.out.println(values);
		
	}

}
