package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demotest2 {
	@Test
	
	public void testtitle() {
		SoftAssert sa= new SoftAssert(); 
		String expText = "Search";
		WebDriver dr = new FirefoxDriver();
		dr.get("https://mvnrepository.com/");
		System.out.println(dr.getTitle());
		System.out.println("Verifying Title");
		String exptitle = "Maven Repository: Search/Browse/Explore";
		String acttitle = dr.getTitle();
		sa.assertEquals(acttitle, exptitle);
		System.out.println("Verifying Text");
		String actText = dr.findElement(By.xpath("/html/body/header/div[2]/form/input[2]")).getAttribute("value");
	    sa.assertEquals(actText, expText,"Comparing text ....");
	    sa.assertAll();
	}

}
