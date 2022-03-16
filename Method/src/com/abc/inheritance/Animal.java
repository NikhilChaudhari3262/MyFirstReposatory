package com.abc.inheritance;
//This program is to explain when super() is mandatory to call
//Parent class(Animal) is having only one constructor without parameter
//in this case compiler  add default super() call after compilation so you don't need to add it 
public class Animal {
	
	int a;
	
	Animal(int a){
		a=10;
		 System.out.println("I am animal class constructor ");
	}
	
	public void eat() {
		System.out.println("I am eating ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
