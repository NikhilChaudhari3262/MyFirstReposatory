package Abstraction;

// Whenever you add abstract non access modifier in class it become abstract class
//A abstract class can have a zero or any number of abstract method
//But if you have a abstract method then it is mandatory to make class as abstract
public abstract class FirstAbstractClass {
	// Abstract class can have instance variable/ static variable
	int a;
	static int b;
	
	//Though you can't create object of abstract class but you can have a constructor
	public FirstAbstractClass() {
		System.out.println("I am abstract class but i have constructor ");
	}
	
	//this is instance method---This is normal method having implementation
	//to call instance method you need to object but abstract class can't create object
	public void M1(){
		System.out.println("There is no Abstract method from abstract class ");
	}
	
	public abstract void M2(); //It having only declaration
	public abstract void M3();
//	private abstract void M3(); //you can't abstract method with private modifier
	
		
		public static void main(String[] args) {
			// You can not create object of abstract class
		//	FirstAbstractClass test=new FirstAbstractClass();
		
	}

}
