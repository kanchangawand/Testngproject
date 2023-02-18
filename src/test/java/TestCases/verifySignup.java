//package TestCases;
//
//import java.io.IOException;
//
//import org.testng.annotations.Test;
//
//import PageObjectModel.SignupPageObject;
//import Resources.baseClass;
//
//public class verifySignup extends baseClass {
//
//	@Test
//	public void signup() throws IOException {
//
//		driverInitilize();
//		// This driver have 
//		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
//		SignupPageObject obj = new SignupPageObject(driver);
//
//		obj.enterFirstName().sendKeys("kanchan");
//
//		obj.enterLastName().sendKeys("Gawand");
//
//		obj.enterTitle().sendKeys("tester");
//
//		obj.enterEmailInput().sendKeys("kanchansahane27@gmail.com");
//
//		obj.enterPhoneInput().sendKeys("8308680206");
//
//		obj.enterselectFieldInput().sendKeys("Employee");
//
//		obj.enterCompany().sendKeys("Wipro");
//
//		obj.clickOntrysubmitButton().click();
//
//	}
//
//}
//

package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObject;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class verifySignup extends baseClass {

	@Test
	public void signup() throws IOException, InterruptedException {

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.clickOntryForFreee().click();

		SignupPageObject spo = new SignupPageObject(driver);

		Thread.sleep(5000);

		spo.enterFirstname().sendKeys(constants.firstname);

		/*
		 * Select s=new Select(spo.selectEmployee()); s.selectByIndex(1);
		 * 
		 * 
		 * Select s1=new Select(spo.selectCountry()); s1.selectByIndex(1);
		 */

		commonMethods.selectDropdown(spo.selectEmployee(), 1);

		commonMethods.selectDropdown(spo.selectCountry(), 2);

	}

}