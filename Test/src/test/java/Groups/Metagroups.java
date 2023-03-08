package Groups;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test(groups= {"all"})
public class Metagroups {
WebDriver driver;
	
	@Test(groups= {"smoke","sanity"})
	public void metagrp1() {
		System.out.println("hii, its first method of metagroup class");
	}
	@Test
	public void metagrp2() {
		System.out.println("hii, its second method of metagroup class");
	}
	@Test(groups= {"functional","regression"})
	public void metagrp3() {
		System.out.println("hii, its third method of metagroup class");
	}
}

