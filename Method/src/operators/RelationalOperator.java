package operators;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RelationalOperator obj=new RelationalOperator();
        obj.greaterthan(5,2);
        obj.lessthan(5,2);
        obj.equalto(2,2);
        obj.greaterthanequalto(5,2);
        obj.lessthanequalto(5,2);
        obj.notequalto(5,2);
        
        
        
	}

	public void greaterthan(int a,int b) {
		System.out.println("a is greater than b ?" +(a>b)); //5>2
	}
	
	public void lessthan(int a,int b) {
		System.out.println("a is less than b ?" +(a<b)); //5<2
	}
	
	public void equalto(int a,int b) {
		System.out.println("a is equal to b ?" +(a==b)); //5=2
	}
	//  >=  <=  !=
	
	
	public void greaterthanequalto(int a,int b) {
		System.out.println("a is greater than equal to b ?" +(a>=b)); //5>=2
	}
	

	public void lessthanequalto(int a,int b) {
		System.out.println("a is less than equal to b ?" +(a<=b)); //5>=2
	}
	
	
	public void notequalto(int a,int b) {
		System.out.println("a is not equal to b ?" +(a>b)); //5!=2
	}
	
}
