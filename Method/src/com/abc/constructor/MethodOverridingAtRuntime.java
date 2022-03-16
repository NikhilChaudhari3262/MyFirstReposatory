package com.abc.constructor;

public class MethodOverridingAtRuntime {

	
	public void add (int a, int b) {
		System.out.println("I am from parent " +(a+b));
	}



	}





class childclass extends MethodOverridingAtRuntime{
	
	public void add (int a, int b) {
		System.out.println("I am from parent " +(a+b));
	}
	public static void main(String[] args) {
		
		childClass obj=new childClass();
		obj.add(4,5);
		MethodOverridingAtRuntime obj1= new MethodOverridingAtRuntime();
		obj.add(5,6);
		MethodOverridingAtRuntime obj2 =new childClass();
	}

}