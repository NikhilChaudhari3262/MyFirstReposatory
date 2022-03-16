package Abstraction;

public interface firstinterface {
	//within interface if we declare variable it need to be initialised 
		//Each and every variable will be static and final
		 int a=122;
		 //after compilation variable name will be like below
		 //public static final int a=2;
		 
		 //within interface you will only have static variable
		 
		 //If you try to add another access modifier , you will compilation error
		 //protected int b;
		
		// No need to add abstract keyword 
		 //By default only public access modifier is allow
		 
		 // within interface till java 8 you will have only abstract instance method
		   int add();
		  int sub();
		   
		  
		   // As each and every method is abstract by default after compilation defination will change as
		   //public abstract void add();

	}