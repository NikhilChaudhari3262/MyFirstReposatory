package com.abc.inheritance;

class Vehicle{
	
	public void Speed() {
		
		System.out.println(" I am from Vehicle Class");
	}
}
class Car{
	
public void Speed() {
		
	}
}
public class MultipleInheritance extends Vehicle{
	
    public void carType(){
    	System.out.println("Honda City");	
    }
         
	public static void main(String[] args) {
		MultipleInheritance obj=new MultipleInheritance();
		obj.Speed();
		obj.carType();
}
}