package Abstraction;

public class IcicIBank extends RBI {

	public static void main(String[] args) {
		IcicIBank test=new IcicIBank();
		test.PinVerification();
		test.CashWithdraw();

	}

   //Implemented the abstract method of RBI	
	public void CashWithdraw() {
		System.out.println("Lock the card and don't allow user to take the card till all processing completed");
		
	}

}