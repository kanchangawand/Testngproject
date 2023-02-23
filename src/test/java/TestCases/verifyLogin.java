package TestCases;
//

//import java.io.IOException;

//
//import org.testng.annotations.Test;
//
//import PageObjectModel.LoginPageObjects;
//import Resources.baseClass;
//
//public class verifyLogin extends baseClass {
//
//	@Test
//	public void login() throws IOException {
//
//		driverInitilize();
//		// This driver have scope
//		driver.get("https://login.salesforce.com/");
//
//		LoginPageObjects obj = new LoginPageObjects(driver);
//
//		obj.enterUsername().sendKeys("rahul");
//
//		obj.enterPassword().sendKeys("test");
//
//		obj.clickOnLogin().click();
//
//		obj.clickOntryForFreee().click();
//
//	}
//
//}

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class verifyLogin extends baseClass {

	@Test(dataProvider = "testData")
	public void login(String uname, String password) throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		LoginPageObjects obj = new LoginPageObjects(driver);

		obj.enterUsername().sendKeys(uname);

		obj.enterPassword().sendKeys(password);

		obj.clickOnLogin().click();

		//commonMethods.handleAssertions(obj.errorText().getText(), constants.expectedErrorMEssage,
				//"error message is not matchimg");

	}

	@DataProvider
	public Object[][] testData() {
		Object[][] data = new Object[2][2];
		data[0][0] = constants.username1;
		data[0][1] = constants.password1;
		data[1][0] = constants.username2;
		data[1][1] = constants.password2;

		return data;
	}

}