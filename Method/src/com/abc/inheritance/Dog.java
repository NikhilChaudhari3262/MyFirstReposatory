package com.abc.inheritance;
//Dog class is extending the Animal class
//Dog is subclass and Animal is parent class
public class Dog extends Animal {
	   // inheritance is a type is-a relationship
	Dog(){
		this(45);//As we added this constructor super(),will be called from Dog(int a)
		//super();//super keyword is similar to this() only difference is called parent class constructor
		//Adding super is not mandatory if not added java will add it
		System.out.println("I am from Dog class");
	}
	//Both  this() and super() should be on first line when you call in constructor
	Dog(int a){
		//here super()will be added by java by default if you have no parameter constructor in parent class
		//super() is not mandatory to add if any one if you have no parameter constructor in parent class
		super(1);// Now explicitly calling super is mandatory because you only have single parameter in constructor in parent
		this.a=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ptr=new Dog();// No parameter constructor
		System.out.println(ptr.a);

	}

}
