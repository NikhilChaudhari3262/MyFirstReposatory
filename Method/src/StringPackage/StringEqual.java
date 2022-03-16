package StringPackage;

public class StringEqual {
	
	public static String var="A";
	public static String var1="A";
	public static String var3="a";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var2=new String("A");
		System.out.println(var==var1);//true
		System.out.println(var==var2);//false
		
		System.out.println(var.equals(var1));
		System.out.println(var.equals(var2));
		
		System.out.println(var.compareTo(var1));
		System.out.println(var.compareTo(var2));
		
		

	}

}
