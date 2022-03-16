package com.abc.methodoverloading;

public class OverLoadingCompileTime {
	
	public void add (int a, int b) {
		 System.out.println("I am add with two parameter " +(a+b));
	}
	public void add (int a, int b ,int c) {
		 System.out.println("I am add with three parameter " +(a+b+c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingCompileTime obj=new OverLoadingCompileTime();
		obj.add(4, 5);

	}

}
