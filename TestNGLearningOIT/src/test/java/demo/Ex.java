package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex {

	
	@BeforeMethod
	void pre() {
		System.out.println("precondition");
	}
	
	@AfterMethod
	void post() {
		System.out.println("postcondition");
	}
	
	
	@Test(priority = 0)
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority = -1)
	public void seacrhproduct() {
		System.out.println("search");
	}
	
	@Test(priority = 3)
	public void SearchCategorie() {
		System.out.println("categ");
	}
	
	
}
