package PakagesTestng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
WebDriver driver;
	@Ignore
	@Test(enabled=true)
	public void ig1() {
		System.out.println("hii, its first method of first class");
	}
	@Test
	public void ig2() {
		System.out.println("hii, its second method of first class");
	}
	@Test
	public void ig3() {
		System.out.println("hii, its third method of first class");
	}
}


