package Groups;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test(groups= {"all"})

public class GroupTest {

WebDriver driver;
	
	@Test(groups= {"smoke","sanity"})
	public void grp1() {
		System.out.println("hii, its first method of grouptest class");
	}
	@Test(groups= {"sanity"})
	public void grp2() {
		System.out.println("hii, its second method of grouptest class");
	}
	@Test(groups= {"functional"})
	public void grp3() {
		System.out.println("hii, its third method of grouptest class");
	}
}
