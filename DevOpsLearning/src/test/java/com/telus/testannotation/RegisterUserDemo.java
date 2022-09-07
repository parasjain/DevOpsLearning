package com.telus.testannotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterUserDemo {

	public WebDriver driver;
	
	// Dynamic Value is using for validating data.
	
	String fNameValue = "Paras";                //First Name
	String lNameValue = "Jain";                 //Last Name
	String addressI = "Keshavkunj";             //Address
	String streetAddressI = "Govindpuram";      //Street Address
	String cityI = "Ghaziabad";                 //City
	String stateI = "Uttarpradesh";				//State
	String zipI = "201013";						//Zip-Code
	String cDD = "India";                       //Country Drop-Down
	String eMail = "parasjain@gmail.com";       //E-Mail
	String dOD = "01/08/2022";                  //Date of Demo
	String conTimeHr = "08";                    //Hour Selection
	String conTimeMin = "55";                   //Minute Selection
	String mobileNum = "8745999499";            //Mobile number
	String query ="Enter your query"; 

	@Test(priority=1)
	public void launchApplication() {
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		String url ="https://nxtgenaiacademy.com";

		driver.get(url);

		driver.manage().window().maximize();

		Reporter.log("Application Launched Successfully");
	}
	
	@Test(priority=2)
	public void navigateToRegistraionForm() {

		Actions action = new Actions(driver);

		// Hovering Mouse on the QA AUTOMATION

		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();

		// Hovering Mouse on the Practice Automation

		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();

		// Hovering Mouse on the Registration page then Click to the Registration page

		WebElement regForm = driver.findElement(By.partialLinkText("Registration Form"));
		action.moveToElement(regForm).click().perform();

		// Check Title is same as Described

		WebElement regTitle = driver.findElement(By.xpath("//*[normalize-space()='Register For Demo']"));

		String actTitle = regTitle.getText();
		String expTitle = "Register For Demo";

		if(regTitle.isDisplayed())
		{
			Reporter.log("Registration Title is Displayed");	

			if(actTitle.equals(expTitle))
			{
				Reporter.log("Registration Title is Matched");
			}
			else
			{
				Reporter.log("Registration Title is not Matched");
			}
		}
		else
		{
			Reporter.log("Registration is not Displayed ");
		}

		Reporter.log("Registraion Form opened Successfully");
	}
	
	@Test(priority=3)
	public void registerUser() {
		// First Name

		Reporter.log("******************************************************************************");

		// -> Checking First Name are entered or not, If not entered then value will be inserted.

		WebElement fName = driver.findElement(By.xpath("//*[@id=\"vfb-5\"]"));

		if(fName.isEnabled()) 
		{
			Reporter.log("First name is Enabled");
			fName.sendKeys(fNameValue);
			Reporter.log("First name is "+ fNameValue);

		}
		else
		{
			Reporter.log("First name is disabled");
		}

		// Last Name

		Reporter.log("******************************************************************************");

		// -> Checking Last Name are entered or not, If not entered then value will be inserted.

		WebElement lName = driver.findElement(By.xpath("//*[@id='vfb-7']"));

		if(lName.isEnabled()) 
		{
			Reporter.log("Last name is Enabled");
			lName.sendKeys(lNameValue);
			Reporter.log("Last name is "+ lNameValue);

		}
		else
		{
			Reporter.log("Last name is disabled");
		}

		// Radio Button

		Reporter.log("******************************************************************************");

		// -> Checking Female radio button is Selected or not, If not then select the value.

		WebElement radBtn = driver.findElement(By.xpath("//*[@id='vfb-8-1']")) ;

		if(radBtn.isSelected()) 
		{
			Reporter.log("Male is Selected");
		}
		else
		{
			Reporter.log("Male is not Selected");
			radBtn.click();
			Reporter.log("Male is now Selected");
		}


		// Address

		Reporter.log("******************************************************************************");

		// -> Checking Address are entered or not, If not entered then value will be inserted.		

		WebElement address = driver.findElement(By.id("vfb-13-address"));

		if(address.isEnabled()) 
		{
			Reporter.log("Address is Enabled");
			address.sendKeys(addressI);
			Reporter.log("Address is "+ addressI);

		}
		else
		{
			Reporter.log("Address name is disabled");
		}

		//Street Address

		Reporter.log("******************************************************************************");

		// -> Checking Street are entered or not, If not entered then value will be inserted.

		WebElement streetAddress = driver.findElement(By.id("vfb-13-address-2"));

		if(streetAddress.isEnabled()) 
		{
			Reporter.log("Street is Enabled");
			streetAddress.sendKeys(addressI);
			Reporter.log("Street is "+ streetAddressI);

		}
		else
		{
			Reporter.log("Street name is disabled");
		}

		// City

		Reporter.log("******************************************************************************");

		// -> Checking City are entered or not, If not entered then value will be inserted.

		WebElement city = driver.findElement(By.id("vfb-13-city"));

		if(city.isEnabled()) 
		{
			Reporter.log("City is Enabled");
			city.sendKeys(cityI);
			Reporter.log("City is "+ cityI);

		}
		else
		{
			Reporter.log("City name is disabled");
		}

		// State

		Reporter.log("******************************************************************************");

		// -> Checking state are entered or not, If not entered then value will be inserted.

		WebElement state = driver.findElement(By.id("vfb-13-state"));

		if(state.isEnabled()) 
		{
			Reporter.log("State is Enabled");
			state.sendKeys(stateI);
			Reporter.log("State is "+ stateI);

		}
		else
		{
			Reporter.log("State name is disabled");
		}

		// Zip-Code

		Reporter.log("******************************************************************************");

		// -> Checking Zip-Code are entered or not, If not entered then value will be inserted.

		WebElement zipCode = driver.findElement(By.id("vfb-13-zip"));

		if(zipCode.isEnabled()) 
		{
			Reporter.log("Zip-code is Enabled");
			zipCode.sendKeys(zipI);
			Reporter.log("Zip-code is "+ zipI);
		}
		else
		{
			Reporter.log("Zip-code name is disabled");
		}

		// Country Drop-Down Menu

		Reporter.log("******************************************************************************");

		WebElement cDropDown = driver .findElement(By.xpath("//*[@id='vfb-13-country']"));

		Select cDropDownList = new Select(cDropDown);

		if(cDropDown.isEnabled()) 
		{
			Reporter.log("Country dropdown Enabled");
			cDropDownList.selectByVisibleText(cDD);
			Reporter.log("Country dropdown "+ cDD);

		}
		else
		{
			Reporter.log("Country dropdown name is disabled");
		}

		// E-Mail

		Reporter.log("******************************************************************************");

		// -> Checking E-Mail are entered or not, If not entered then value will be inserted.

		WebElement e_mail = driver.findElement(By.xpath("//*[@id='vfb-14']"));

		if(e_mail.isEnabled()) 
		{
			Reporter.log("E-Mail is Enabled");
			e_mail.sendKeys(eMail);
			Reporter.log("E-Mail is "+ eMail);

		}
		else
		{
			Reporter.log("E-Mail name is disabled");
		}

		// Date of Demo

		Reporter.log("******************************************************************************");

		// -> Checking Date Of Demo are entered or not, If not entered then value will be inserted.

		WebElement dateOfDemo = driver.findElement(By.xpath("//*[@id='vfb-18']"));

		if(dateOfDemo.isEnabled()) 
		{
			Reporter.log("Date of Demo is Enabled");
			dateOfDemo.sendKeys(dOD);
			Reporter.log("Date of Demo is "+ dOD);

		}
		else
		{
			Reporter.log("Date of Demo name is disabled");
		}

		dateOfDemo.sendKeys(dOD);

		// Convenient Time

		Reporter.log("******************************************************************************");

		// -> Hour

		// -> Checking Hour are entered or not, If not entered then value will be inserted.

		WebElement cTimeHour = driver.findElement(By.id("vfb-16-hour"));

		Select cTimeHourList = new Select(cTimeHour);

		if(cTimeHour.isEnabled()) 
		{
			Reporter.log("Hour is Enabled");
			cTimeHourList.selectByVisibleText(conTimeHr);
			Reporter.log("Hour is "+ conTimeHr);

		}
		else
		{
			Reporter.log("Hour name is disabled");
		}

		// -> Minutes

		// -> Checking Minutes are entered or not, If not entered then value will be inserted.

		WebElement cTimeMin = driver.findElement(By.id("vfb-16-min"));

		Select cTimeMinList = new Select(cTimeMin);

		if(cTimeMin.isEnabled()) 
		{
			Reporter.log("Minutes is Enabled");
			cTimeMinList.selectByVisibleText(conTimeMin);
			Reporter.log("Minutes is "+ conTimeMin);

		}
		else
		{
			Reporter.log("Minutes is disabled");
		}

		// Mobile Number

		Reporter.log("******************************************************************************");

		// -> Checking Mobile Number are entered or not, If not entered then value will be inserted.

		WebElement mobNum = driver.findElement(By.id("vfb-19"));

		if(mobNum.isEnabled()) 
		{
			Reporter.log("Mobile Number is Enabled");
			mobNum.sendKeys(mobileNum);
			Reporter.log("Mobile Number is "+ mobileNum);

		}
		else
		{
			Reporter.log("Mobile Number name is disabled");
		}

		//Query

		Reporter.log("******************************************************************************");

		WebElement qUery = driver.findElement(By.id("vfb-23"));

		if(qUery.isEnabled()) 
		{
			Reporter.log("Query is Enabled");
			qUery.sendKeys(query);
			Reporter.log("Query is "+ query);

		}
		else
		{
			Reporter.log("Query name is disabled");
		}

		// Course Interested

		WebElement coreJava = driver.findElement(By.xpath("//*[@value ='Core Java']"));

		// -> Checking Courses are Selected or not, If not then select the value.

		Reporter.log("******************************************************************************");

		if(coreJava.isSelected()) 
		{
			Reporter.log("Core Java checkbox is Selected");
		}
		else
		{
			Reporter.log("Core Java checkbox is not Selected");
			coreJava.click();
			Reporter.log("Core Java checkbox is now Selected");
		}	

		WebElement testNG = driver.findElement(By.xpath("//*[@value = 'TestNG']"));

		if(testNG.isSelected()) 
		{
			Reporter.log("Test NG checkbox is Selected");
		}
		else
		{
			Reporter.log("Test NG checkbox is not Selected");
			testNG.click();
			Reporter.log("Test NG checkbox is now Selected");
		}

		// Two Digit Verification

		Reporter.log("******************************************************************************");

		WebElement two_Digit = driver.findElement(By.xpath("//*[text()='Example: 99']"));

		String digit[] = two_Digit.getText().split(":");		

		String digit1 = digit[1].trim();

		WebElement two_Dig = driver.findElement(By.id("vfb-3"));

		if(two_Dig.isEnabled())
		{
			Reporter.log("Two-Digits are Enabled");
			two_Dig.sendKeys(digit1);
			Reporter.log("Two Digits are : " + digit1);
		}
		else
		{
			Reporter.log("Two-Digits are not Enabled");
		}

		// Submit Button

		Reporter.log("******************************************************************************");

		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='vfb-4']")) ;

		if(submitBtn.isEnabled())
		{
			Reporter.log("Submit button is Enabled");
			submitBtn.click();
			Reporter.log("Submit button is Clicked");
		}
		else
		{
			Reporter.log("Submit button is not Enabled");
		}


		Reporter.log("User Registered Successfully");
	}
	@Test(priority=4)
	public void validateSuccessFullMsg() {

		Reporter.log("******************************************************************************");

		WebElement ValidateTransactionID = driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-7e205e7c']//div[@class='elementor-widget-container']//div[1]"));

		String actValMsg = ValidateTransactionID.getText();
		String expValMsg = "Registration Form is Successfully Submitted. The Transaction ID : NXTGEN1937465";

		//WebElement transID = driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-7e205e7c']//div[@class='elementor-widget-container']//div[1]"));

		String transactionID[] = ValidateTransactionID.getText().split(":");		

		String transactionID1 = transactionID[1].trim();
		
		if(ValidateTransactionID.isDisplayed())
		{
			Reporter.log("Registration Successfull is Displayed");	
			Reporter.log("Transaction ID is " + transactionID1);
			
			if(actValMsg.contains(expValMsg))
			{
				//Reporter.log("Registration Successful message is Matched");
				Reporter.log("Actual message -> " + actValMsg);
			}
			else
			{
				Reporter.log("Registration Successfull message is not Matched");
				Reporter.log("Actual message -> " + actValMsg);
				Reporter.log("Expected message -> " + expValMsg);
			}
		}
		else
		{
			Reporter.log("Registration is not Displayed");
		}


		Reporter.log("Validation is Successfull");
	}

	@Test(priority=5)
	public void closeApplication() {

		driver.close();

		Reporter.log("Application Closed Successfully"); 
	}

}
