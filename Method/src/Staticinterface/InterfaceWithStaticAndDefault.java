package Staticinterface;

public interface InterfaceWithStaticAndDefault {

	//Abstract Method
	void Add(int a, int b); //compiler will cover to public abstract void Add(int a,intb)
	
	//Default method
	default void sub (int a, int b) {
		System.out.println(a-b);
	}
	//static method
	static void multiplication(int a,int b) {
		System.out.println(a*b);
	}
}
