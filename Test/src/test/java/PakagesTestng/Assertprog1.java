package PakagesTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertprog1 {

	WebDriver driver;
	
	@Test
	public void browser() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");		
		//SoftAssert object= new SoftAssert();
		String expectedtitle="dance - Google Search";
		String actualTitile= driver.getTitle();
		Assert.assertEquals(actualTitile, expectedtitle,"matched");
		//object.assertNotEquals(actualTitile, expectedtitle);
		System.out.println();
		
		driver.quit();
		//driver.assertAll();
	}
}
