package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
     
public class PropertiesBrowserExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//To read the property file we need to user properties class
		Properties prop=new Properties();
		prop.load(new FileInputStream(".\\config\\config.properties"));
		//F:\\workspace\\Method\\config\\config.properties
		System.out.println(prop.getProperty("browsername"));
		//. --your workspace +current project 
		prop.setProperty("url", "check");
		System.out.println(prop.getProperty("url"));
		
		FileOutputStream test=new FileOutputStream(".\\config\\config.properties");
		prop.store(test, "changing value");

	}

}
