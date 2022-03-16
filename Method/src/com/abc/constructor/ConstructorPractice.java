package com.abc.constructor;

public class ConstructorPractice {

	int a;
	int b;
	boolean c;
	int d;
	
	
	public ConstructorPractice() 
	{     //no parameterized constructor
		System.out.println("I am constructor");
		this.a=34;
		this.b=33;
		this.c=true;
		this.d=45;
	}
	
	
	
	public ConstructorPractice(int a) 
	{     // parameterized constructor
		System.out.println("I am parameterized  constructor");
		
	}
	
	public static void main(String[] args) 
	{
		ConstructorPractice obj= new ConstructorPractice();
		// What constructor---initialize the variable
		//If you don't provide---compiler will add default constructor
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
	    ConstructorPractice obj1= new ConstructorPractice(5);
	    System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
	}

}
