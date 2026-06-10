package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import base.BaseTest;
import data.LoginDataProvider;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test (dataProvider="loginData", dataProviderClass= LoginDataProvider.class)
	public void loginTest(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		Assert.assertTrue(driver.getCurrentUrl().contains("inventroy"));
	}
}
