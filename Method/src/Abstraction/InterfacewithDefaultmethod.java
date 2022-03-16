package Abstraction;

public interface InterfacewithDefaultmethod {
	
	//This is default method --because there is keyword called default 
	//Method name- default method
	//return type- void
	//parameter - zero
	default void DefaultMethod() { 
		System.out.println(" I am default method from interface without parameter ");
	}
	//Even interface support implementation you access modifier should be public
	//if you use other access modifier you will get error
	//Method name- default method
	//return type- void
	//parameter - one parameter
	public default void DefaultMethod(int a) {
		System.out.println(" I am default method ");
	}

}
