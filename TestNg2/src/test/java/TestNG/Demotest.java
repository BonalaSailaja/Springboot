package TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demotest {
	@BeforeTest
	public void test1() {
		System.out.println("before every test ......");
	}
	@AfterTest
	public void test2() {
		System.out.println("after every test ......");
	}
	@BeforeMethod
	public void DBisConnected() {
		System.out.println("data base connected ....");
	}
	@AfterMethod
	public void DBisDisconnected() {
		System.out.println("data base is disconnected ....");
	}
	
	@Test
	public void show() {
		System.out.println("Print here .....");
	}
	@Test(priority=2,groups="First")
	public void alogin() {
		System.out.println("a login succesful .....");
	}
	@Test(priority=1,groups="second")
	public void blogin() {
		System.out.println("b login succesful .....");
	}

}
