package FirstPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
	
	@BeforeMethod
	public void Precondition() {
		System.out.println("Home Page Before Method");
	}
	
	@Test
	public void TC1() {
		System.out.println("I am Home Page test case");
	}
	
	@AfterMethod
	public void Aftercondition() {
		System.out.println("I am Home Page test case");
	}
	

}

	

