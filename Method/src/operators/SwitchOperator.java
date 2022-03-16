package operators;

public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var=1;
		
		if(var==1) {
			System.out.println("Jan");
		}else if (var==2) {
			System.out.println("Feb");	
		}else if (var==3) {
			System.out.println("Mar");	
		}else  {
			System.out.println("Please put the value between 1 to 12");	
		}
		
	
	  switch(var) {
		
		case 1:
			System.out.println("Jan");
		case 2:
			System.out.println("Feb");
		case 3:
			System.out.println("Mar");
		case 4:
			System.out.println("April");
		case 5:
			System.out.println("May");
		case 6:
			System.out.println("June");
		case 7:
				System.out.println("July");
		case 8:
			System.out.println("Aug");
		case 9:
			System.out.println("Sept");
		case 10:
			System.out.println("Oct");
		case 11:
			System.out.println("Nov");
		case 12:
			System.out.println("Dec");
				
		    break;
		default:
			System.out.println("Please put the value between 1 to12");
		
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}


