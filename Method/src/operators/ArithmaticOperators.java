package operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		 
		ArithmaticOperators obj=new ArithmaticOperators();
	    obj.add(2, 3);
		obj.sub(3, 1);
		obj.multi(2, 4);
		ArithmaticOperators.division(5,2);
		ArithmaticOperators.modulus(5);
	}
   
	
	
	 // This is for + Arithmetic operators
	public void add(int a,int b) {
		
	    System.out.println("This is + operator test" + (a+b));
	}

  
	//This is for - Arithmetic operators
    public void sub(int a,int b) {
        System.out.println("This is - operator test" + (a-b));
    }
    
    
    // This is for * Arithmetic operators
    public void multi(int a,int b) {
    	System.out.println("This is * operator test" + (a*b));
    }
    
    // This is for /  Arithmetic operators
    public static void division(int a,int b) {
    	System.out.println("This is / operator test" + (a/b));
    }
   
    
    // This is for % modulus operator
    public static void modulus(int a) {
    	System.out.println("This is % operator test" + (a%2));
    }}
    
    