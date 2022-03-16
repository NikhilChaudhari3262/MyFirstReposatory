package Staticinterface;

public class Math implements InterfaceWithStaticAndDefault,NEwInterfaceWithStaticAndDefault{

public static void main(String[] args) {
		
		Math obj=new Math();
		obj.Add(4, 5);
		obj.sub(4, 9);
		obj.multiplication(4, 2);
		NEwInterfaceWithStaticAndDefault.multiplication(4, 10);


	}

	//Both interface is having same abstract method but while implementing you need have only one implementation
	public void Add(int a, int b) {
		
		System.out.println("Addition " + (a+b));
	}

	
	static void multiplication(int a, int b) {
		System.out.println("Class static " + (a*b));
	}
	
 // As both interface is having same default methods to resolve method ambuigity 
	//java force us to mentions which interface method we have to call
	public void sub(int a, int b) {
		
		// TODO Auto-generated method stub
		InterfaceWithStaticAndDefault.super.sub(a, b);
	}

}