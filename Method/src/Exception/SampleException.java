package Exception;

public class SampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleException obj =new SampleException();
		obj.M1();
   }
	public void M1() {
		M2();
	}
	public void M2() {
		System.out.println(10/0);
	}
	
	

}
