package FirstPackage;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(description="Verify that user is able to login with valid credential",priority=2)
	public void TC1() {
     System.out.println("I am First test case ");
}
	@Test(description="Verify that system should not allow to login with valid credential",priority=1)
	public void TC2() {
	 System.out.println("I am Second test case ");
}
	@Test(description="Verify the test case")
	public void TC3() {
	 System.out.println("I am Third test case ");
	}
	
	@Test(priority=3)
	public void TC4() {
	 System.out.println("I am Four test case ");
}
	@Test
	public void TC5() {
	 System.out.println("I am Five test case ");
}
	@Test(enabled=false)
	public void TC6() {
	 System.out.println("I am Six test case ");
}

}


