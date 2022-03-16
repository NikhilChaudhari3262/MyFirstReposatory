package Abstraction;

public class HDFC  extends RBI {

	//Implemented the abstract method of RBI	
	public void CashWithdraw() {
		System.out.println("First withdraw the card and then process remaining part ");
		
	}
	
	public static void main (String[] args) {
		
		HDFC noobj=new HDFC();
		noobj.PinVerification();
		noobj.CashWithdraw();
	}

}


