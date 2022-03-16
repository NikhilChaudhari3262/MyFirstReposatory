package operators;

public class FinalKeyword {

	public float pi;//inal=3.14f;
	public static final int p;
	
	 FinalKeyword(){
		 pi=3.14f;
		 System.out.println("I am constructor block");
	 }
	 static {
		 p=3;
		 System.out.println("I am static block");
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword obj=new FinalKeyword();
      //  obj.pi=45;
        System.out.println(obj.pi);
	}

}
