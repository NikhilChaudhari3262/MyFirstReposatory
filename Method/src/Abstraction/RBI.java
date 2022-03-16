package Abstraction;

//Parent RBI has one implemented method as PinVerification 
//but one abstract method as CashWithdraw
abstract class RBI {
	
	public void PinVerification() {
		
		System.out.println("Ask user to enter four digit pin");
	}
	
	public abstract void CashWithdraw() ;
	
	public static void one() {
		
	}
	//static and abstract both are non-access modifier so static method can't be abstract 
	//public static abstract void two();

}