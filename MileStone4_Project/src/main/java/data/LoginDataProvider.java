package data;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
	@DataProvider(name = "loginData")
	public Object[][] loginData(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user", "secret_sauce"}
		};
		
	}

}
