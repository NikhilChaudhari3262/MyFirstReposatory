package operators;

public class IfElseifCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc=220;
		//Print the message as I am less than 10
		//Print the message as I am greater than 10 but less than 20
		//Print the message as I am greater than 20
		//syntax error //logical error----defect
		
		
		
		if(abc<=10) {
			System.out.println("I am less than 10");
		}else if (abc>10 && abc<20) {
			System.out.println("I am greater than 10 but less than 20");
		}else  {
			System.out.println("I am greater than 20");
	}

}}
