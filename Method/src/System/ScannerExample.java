package System;

import java.util.Scanner;

public class ScannerExample {
	
     // To take value from console
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please let me know which value i need to check for odd/even");
		Scanner obj=new Scanner(System.in);
		int var=obj.nextInt();
	//	System.out.println(var);
		if(var%2==0) {
			System.out.println(var + " Number is even ");
		}else {
			System.out.println(var + " Number is odd ");
		}
		System.out.println("Please  enter string value ");
		String var3=obj.next();
		System.out.println(var3);
		System.out.println("Please  enter string value for nextLine");
		String var4=obj.nextLine();
		System.out.println(var4);
	}

}
