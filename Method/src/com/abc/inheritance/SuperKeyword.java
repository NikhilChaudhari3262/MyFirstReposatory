package com.abc.inheritance;

class Parent {
	int a;
	
	public void M1() {
		System.out.println("I am from Parent");
	}
}

public class SuperKeyword extends Parent{
	
	int a;
	
	SuperKeyword (int a){
		this.a=a; //child class / current class instance variable
		super.a=a; //Parent class instance variable
		super.M1();// this will call parent class M1
	    this.M1(); // this will call parent class M1
		
	}
	public void M1() {
		System.out.println("I am from Child");
	}
	

	public static void main(String[] args) {
		SuperKeyword obj=new SuperKeyword (5);
		

	}

}
