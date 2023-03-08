//package Groups;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DataproviderTestDemo {
//	WebDriver driver;
//	
////	@DataProvider(name="Laabc")
////	public static Object[][] credentials() {
////	String[][] a = new String[2][2];
////	a[0][0] = "abc";
////	a[0][1]= "sdafs";
////	
////	//a[1][0]="123";
////	//a[1][1]="789";
////		
//	    //}
//	
//	@DataProvider(name="Laabc")
//	@Test
//	public void sets(Object data1, Object data2) {
//		WebDriver driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.getTitle();
//		driver.findElement(By.className("gLFyf")).sendKeys(data);
//		
//		
//	}
//}
