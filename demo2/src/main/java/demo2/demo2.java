package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo2 {

	public static void main(String[] args) {
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("kajal photos");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		dr.findElement(By.xpath("/html/body/div[5]/div/div[12]/div/div[2]/div[2]/div/div/div[8]/div/div/div[1]/div/div/span/a/h3")).click();
		//dr.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/main/div[1]/div/ul/li[1]/a/span")).click();
		
	}

}
