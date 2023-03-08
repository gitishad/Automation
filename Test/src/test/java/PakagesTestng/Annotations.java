package PakagesTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeClass
	public void Method1() {
		System.out.println("Hii");
	}
	@BeforeTest
	public void Methodw() {
		System.out.println("How are u");
	}
	@Test(priority=3)
	public void Method2() {
		System.out.println("have a great day");
		
	}
	@Test
	public void Beforemethod() {
		System.out.println("ahead");
	
}
	@Test(priority=0)
	public void Aftermethod() {
	System.out.println("This is ");
}
	@AfterTest
	public void Beforclass() {
		System.out.println("Isha");
	
}
	@AfterClass
	public void bfterclass() {
		System.out.println("bye");
	}
		@AfterClass
		public void afterclasse() {
			System.out.println("bye-bye");
	
}
}
