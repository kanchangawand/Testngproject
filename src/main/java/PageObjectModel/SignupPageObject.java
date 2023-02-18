//package PageObjectModel;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//public class SignupPageObject {
//
//	private static final By Country = null;
//
//	private static final By Employee = null;
//
//	public WebDriver driver;
//
//	private By firstName = By.xpath("//input[@id='UserFirstName-0Rrd']");
//	private By lastName = By.xpath("//input[@id='UserLastName-UsG7']");
//	private By title = By.xpath("//input[@id='UserTitle-5Uft']");
//	private By emailInput = By.xpath("//input[@id='UserEmail-0Tft']");
//	private By phoneInput = By.xpath("//input[@id='UserPhone-2xqt']");
//	private By selectFieldInput = By.xpath("//select[@id='CompanyEmployees-bUS6']");
//	private WebElement Employees;
//	Select s = new Select(Employees);
//	private By company = By.xpath("//input[@id='CompanyName-n9GP']");
//	private By submitButton = By.xpath("//button[@type='submit']");
//
//	public SignupPageObject(WebDriver driver2) {
//
//		this.driver = driver2;
//
//	}
//
//	public WebElement enterFirstName() {
//		return driver.findElement(firstName);
//
//	}
//
//	public WebElement enterLastName() {
//		return driver.findElement(lastName);
//
//	}
//
//	public WebElement enterTitle() {
//		return driver.findElement(title);
//
//	}
//
//	public WebElement enterEmailInput() {
//		return driver.findElement(emailInput);
//
//	}
//
//	public WebElement enterPhoneInput() {
//		return driver.findElement(phoneInput);
//
//	}
//
//	public WebElement enterselectFieldInput() {
//		return driver.findElement(selectFieldInput);
//
//	}
//
//	public WebElement clickOntrysubmitButton() {
//		return driver.findElement(submitButton);
//
//	}
//
//	public WebElement enterCompany() {
//		return driver.findElement(company);
//
//	}
//
//	public WebElement enterFirstname() {
//		// TODO Auto-generated method stub
//		return driver.findElement(firstName);
//	}
//
//	public WebElement selectCountry() {
//		// TODO Auto-generated method stub
//		return driver.findElement(Country);
//	}
//
//	public WebElement selectEmployee() {
//		// TODO Auto-generated method stub
//		return driver.findElement(Employee);
//	}
//
//	// public WebElement clickOnLogin() {
//	// return driver.findElement(login);
//
//	// }
//
//}

package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {

	public WebDriver driver;

	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By employee = By.xpath("//select[@name='CompanyEmployees']");

	private By country = By.xpath("//select[@name='CompanyCountry']");

	public SignupPageObject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement enterFirstname() {

		return driver.findElement(firstName);
	}

	public WebElement selectEmployee() {

		return driver.findElement(employee);
	}

	public WebElement selectCountry() {

		return driver.findElement(country);
	}

}