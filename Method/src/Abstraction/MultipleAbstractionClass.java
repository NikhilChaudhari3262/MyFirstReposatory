package Abstraction;

public abstract class MultipleAbstractionClass {
	 
	public abstract void ReverseNumber();

}
 abstract class ChildAbstract extends MultipleAbstractionClass {
	 
	 public abstract void NoNumber(); 
 }
class anotherchild extends ChildAbstract{


	public void NoNumber() {
		// TODO Auto-generated method stub
		
	}

	
	public void ReverseNumber() {
		// TODO Auto-generated method stub
		
	}
	
}
class finalclass extends anotherchild{
	
}