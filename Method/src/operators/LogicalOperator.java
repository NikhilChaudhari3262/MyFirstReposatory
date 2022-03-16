package operators;

public class LogicalOperator {

	public static void main(String[] args) {
	 int var=5; //assignment oerator
	 
	 System.out.println("---------------AND Condition-------------------");
	 
	   //true  && true---final result will be true
       System.out.println("Both condition is true so final result is " +(5<6 && 6>3));
       //false  && true---final result will be false
       System.out.println("First condition is false so final result is " +(7<6 && 6>3));
	  //true  && false---final result will be false
       System.out.println("Second condition is false so final result is " +(5<6 && 6>7));
      //false && false----final result will be false
       System.out.println("Both condition is false so final result is " +(7<6 && 6>7));
     
       
       System.out.println("---------------OR Condition-------------------");
  	 
	   //true  || true---final result will be true
       System.out.println("Both condition is true so final result is " +(5<6 || 6>3));
       //false  && true---final result will be true
       System.out.println("First condition is false so final result is " +(7<6 || 6>3));
	  //true  && false---final result will be true
       System.out.println("Second condition is false so final result is " +(5<6 || 6>7));
      //false && false----final result will be false
       System.out.println("Both condition is false so final result is " +(7<6 || 6>7)); 
	}
}
