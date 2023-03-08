package PakagesTestng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class First {

	
	WebDriver driver;
	
	@Test
	public void method1() {
		System.out.println("hii, its first method of first class");
	}
	@Test
	public void method12() {
		System.out.println("hii, its second method of first class");
	}
	@Test
	public void method3() {
		System.out.println("hii, its third method of first class");
	}
}
