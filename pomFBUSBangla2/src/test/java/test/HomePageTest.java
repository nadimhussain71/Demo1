package test;

import org.testng.annotations.Test;

import page.HomePage;

public class HomePageTest extends BaseTest {

	@Test
	public void hmTest() {
		//create an object of HomePage & invoke the method
		HomePage hp = new HomePage(driver);
		hp.clickOnCreateNewAccountBtn();
	}
}
