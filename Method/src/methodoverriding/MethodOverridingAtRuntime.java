package methodoverriding;

public class MethodOverridingAtRuntime {

	public void add (int a, int b) {
		 System.out.println("I am from parent " +(a+b));
	}
	public static void main(String[] args) {
		
	}

}
 class childClass extends MethodOverridingAtRuntime {
	 
	 public void add (int a, int b) {
	 System.out.println("I am from child " +(a+b));
}

	 public static void main(String[] args) {
		 childClass obj=new childClass();
		 obj.add(3, 4);
		 MethodOverridingAtRuntime obj1 =new MethodOverridingAtRuntime();
		 obj1.add(5, 6);
		 MethodOverridingAtRuntime obj2 =new childClass();
		 obj2.add(6, 7);
	 }
 
 }