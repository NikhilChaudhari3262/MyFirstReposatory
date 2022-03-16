package StringPackage;

public class StringDeclaration {
	
	//String Declaration
	public static String var;
	public StringDeclaration var1;
	public int var3=3; //3literal integer;
	
	//String initlization can be done in two ways 
	
	// A. By using literal
	//String a="abc";
	//  B. By using new object
	//String b=new String ("abc");
	
	public static void main(String[] args) {
		//String initialization
		var= new String("Nikhil");
		System.out.println(var);
		
		String a="Test";
		System.out.println(a);
		String p=var.concat("Chaudhari");
		
		StringBuffer obj=new StringBuffer("Nikhil");
		obj.append(" Chaudhari");
		System.out.println(obj);

	}

}
