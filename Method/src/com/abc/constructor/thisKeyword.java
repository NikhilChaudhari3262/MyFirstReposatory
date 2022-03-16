package com.abc.constructor;

public class thisKeyword {

	int a;
	int b;
	
	public void M1() {
		System.out.println("Reference Id of this" +this);
		//if you have a call instance variable or method, you need to create a object
		a=5; //this.a=5 //xyz.a=5;
	}
	
	public void M1(thisKeyword test) {
		System.out.println(test);
	}
	public static void main(String[] args) {
		thisKeyword abc=new thisKeyword(); //object name is abc
		System.out.println("Reference Id of abc" +abc);
		thisKeyword xyz=new thisKeyword(); //object name is xyz
		System.out.println("Reference Id of xyz" +xyz);
		abc.M1();
		//we have two object and while calling M1 we are using abc

	}

}
