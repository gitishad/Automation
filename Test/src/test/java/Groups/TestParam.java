package Groups;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParam {
WebDriver driver;
@Test(dataProvider="met3")// used string datatype(u can use for int, float)
public void Met1(String str) {
	System.out.println(str);
}
@DataProvider()
public String[] met3(){
	String[] data= new String[] {
			"isha"
	};
	return data;
}

}
