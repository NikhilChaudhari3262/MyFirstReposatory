package Abstraction;

public class ChildClassForAbstract extends FirstAbstractClass{

	public ChildClassForAbstract()  {
		System.out.println("I am child class constructor ");
	}
	
	public void M2() {
			System.out.println("I am abstract method M2 implement in child class");	
	}

	public void M3() {
		
		System.out.println("I am abstract method M3 implement in child class");	
	}
	public static void main(String[] args) {
		ChildClassForAbstract xyz=new ChildClassForAbstract();
		xyz.M1();
		xyz.M2();
		xyz.M3();
	}
}
