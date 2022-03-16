package System;

import java.io.PrintStream;
import java.util.Properties;

import Array.MultiDimensionalArray;

public class SystemExample {
	
	// Below out variable is written in System class
	//Access modifier - public
	//variable type -static
	//Data type-  non-primitive and which class it is representing /printStream
	public static  PrintStream out;
	// Below out1 variable is written by use in our class
	//Access modifier - public
	//variable type -static
	//Data type-  non-primitive and which class it is representing /MultiDimensionalArray
	public static MultiDimensionalArray out1; // non-primitive data type

	public static void main(String[] args) {
		 //SystemExample obj ----Reference/object declaration
		//=new SystemExample();---Object initilization
		SystemExample obj=new SystemExample(); //declaration+initilization
		 
		System.out.println(SystemExample.out1);
		SystemExample.out1=new MultiDimensionalArray ();
		System.out.println(SystemExample.out1);
		//System.err.println("I am error ");
		Properties prop=System.getProperties();
		prop.list(System.out);
		System.out.println(System.getProperty("user.langauge"));
		System.exit(1);//System.exit(1);---Nothing will run after this

	}

}
