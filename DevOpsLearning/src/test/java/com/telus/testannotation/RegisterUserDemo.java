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

		System.out.println("Application Launched Successfully");
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
			System.out.println("Registration Title is Displayed");	

			if(actTitle.equals(expTitle))
			{
				System.out.println("Registration Title is Matched");
			}
			else
			{
				System.out.println("Registration Title is not Matched");
			}
		}
		else
		{

			System.out.println("Registration is not Displayed");

			Reporter.log("Registration is not Displayed ");

		}

		System.out.println("Registraion Form opened Successfully");
	}
	
	@Test(priority=3)
	public void registerUser() {
		// First Name

		System.out.println("******************************************************************************");

		// -> Checking First Name are entered or not, If not entered then value will be inserted.

		WebElement fName = driver.findElement(By.xpath("//*[@id=\"vfb-5\"]"));

		if(fName.isEnabled()) 
		{
			System.out.println("First name is Enabled");
			fName.sendKeys(fNameValue);
			System.out.println("First name is "+ fNameValue);

		}
		else
		{
			System.out.println("First name is disabled");
		}

		// Last Name

		System.out.println("******************************************************************************");

		// -> Checking Last Name are entered or not, If not entered then value will be inserted.

		WebElement lName = driver.findElement(By.xpath("//*[@id='vfb-7']"));

		if(lName.isEnabled()) 
		{
			System.out.println("Last name is Enabled");
			lName.sendKeys(lNameValue);
			System.out.println("Last name is "+ lNameValue);

		}
		else
		{
			System.out.println("Last name is disabled");
		}

		// Radio Button

		System.out.println("******************************************************************************");

		// -> Checking Female radio button is Selected or not, If not then select the value.

		WebElement radBtn = driver.findElement(By.xpath("//*[@id='vfb-8-1']")) ;

		if(radBtn.isSelected()) 
		{
			System.out.println("Male is Selected");
		}
		else
		{
			System.out.println("Male is not Selected");
			radBtn.click();
			System.out.println("Male is now Selected");
		}


		// Address

		System.out.println("******************************************************************************");

		// -> Checking Address are entered or not, If not entered then value will be inserted.		

		WebElement address = driver.findElement(By.id("vfb-13-address"));

		if(address.isEnabled()) 
		{
			System.out.println("Address is Enabled");
			address.sendKeys(addressI);
			System.out.println("Address is "+ addressI);

		}
		else
		{
			System.out.println("Address name is disabled");
		}

		//Street Address

		System.out.println("******************************************************************************");

		// -> Checking Street are entered or not, If not entered then value will be inserted.

		WebElement streetAddress = driver.findElement(By.id("vfb-13-address-2"));

		if(streetAddress.isEnabled()) 
		{
			System.out.println("Street is Enabled");
			streetAddress.sendKeys(addressI);
			System.out.println("Street is "+ streetAddressI);

		}
		else
		{
			System.out.println("Street name is disabled");
		}

		// City

		System.out.println("******************************************************************************");

		// -> Checking City are entered or not, If not entered then value will be inserted.

		WebElement city = driver.findElement(By.id("vfb-13-city"));

		if(city.isEnabled()) 
		{
			System.out.println("City is Enabled");
			city.sendKeys(cityI);
			System.out.println("City is "+ cityI);

		}
		else
		{
			System.out.println("City name is disabled");
		}

		// State

		System.out.println("******************************************************************************");

		// -> Checking state are entered or not, If not entered then value will be inserted.

		WebElement state = driver.findElement(By.id("vfb-13-state"));

		if(state.isEnabled()) 
		{
			System.out.println("State is Enabled");
			state.sendKeys(stateI);
			System.out.println("State is "+ stateI);

		}
		else
		{
			System.out.println("State name is disabled");
		}

		// Zip-Code

		System.out.println("******************************************************************************");

		// -> Checking Zip-Code are entered or not, If not entered then value will be inserted.

		WebElement zipCode = driver.findElement(By.id("vfb-13-zip"));

		if(zipCode.isEnabled()) 
		{
			System.out.println("Zip-code is Enabled");
			zipCode.sendKeys(zipI);
			System.out.println("Zip-code is "+ zipI);
		}
		else
		{
			System.out.println("Zip-code name is disabled");
		}

		// Country Drop-Down Menu

		System.out.println("******************************************************************************");

		WebElement cDropDown = driver .findElement(By.xpath("//*[@id='vfb-13-country']"));

		Select cDropDownList = new Select(cDropDown);

		if(cDropDown.isEnabled()) 
		{
			System.out.println("Country dropdown Enabled");
			cDropDownList.selectByVisibleText(cDD);
			System.out.println("Country dropdown "+ cDD);

		}
		else
		{
			System.out.println("Country dropdown name is disabled");
		}

		// E-Mail

		System.out.println("******************************************************************************");

		// -> Checking E-Mail are entered or not, If not entered then value will be inserted.

		WebElement e_mail = driver.findElement(By.xpath("//*[@id='vfb-14']"));

		if(e_mail.isEnabled()) 
		{
			System.out.println("E-Mail is Enabled");
			e_mail.sendKeys(eMail);
			System.out.println("E-Mail is "+ eMail);

		}
		else
		{
			System.out.println("E-Mail name is disabled");
		}

		// Date of Demo

		System.out.println("******************************************************************************");

		// -> Checking Date Of Demo are entered or not, If not entered then value will be inserted.

		WebElement dateOfDemo = driver.findElement(By.xpath("//*[@id='vfb-18']"));

		if(dateOfDemo.isEnabled()) 
		{
			System.out.println("Date of Demo is Enabled");
			dateOfDemo.sendKeys(dOD);
			System.out.println("Date of Demo is "+ dOD);

		}
		else
		{
			System.out.println("Date of Demo name is disabled");
		}

		dateOfDemo.sendKeys(dOD);

		// Convenient Time

		System.out.println("******************************************************************************");

		// -> Hour

		// -> Checking Hour are entered or not, If not entered then value will be inserted.

		WebElement cTimeHour = driver.findElement(By.id("vfb-16-hour"));

		Select cTimeHourList = new Select(cTimeHour);

		if(cTimeHour.isEnabled()) 
		{
			System.out.println("Hour is Enabled");
			cTimeHourList.selectByVisibleText(conTimeHr);
			System.out.println("Hour is "+ conTimeHr);

		}
		else
		{
			System.out.println("Hour name is disabled");
		}

		// -> Minutes

		// -> Checking Minutes are entered or not, If not entered then value will be inserted.

		WebElement cTimeMin = driver.findElement(By.id("vfb-16-min"));

		Select cTimeMinList = new Select(cTimeMin);

		if(cTimeMin.isEnabled()) 
		{
			System.out.println("Minutes is Enabled");
			cTimeMinList.selectByVisibleText(conTimeMin);
			System.out.println("Minutes is "+ conTimeMin);

		}
		else
		{
			System.out.println("Minutes is disabled");
		}

		// Mobile Number

		System.out.println("******************************************************************************");

		// -> Checking Mobile Number are entered or not, If not entered then value will be inserted.

		WebElement mobNum = driver.findElement(By.id("vfb-19"));

		if(mobNum.isEnabled()) 
		{
			System.out.println("Mobile Number is Enabled");
			mobNum.sendKeys(mobileNum);
			System.out.println("Mobile Number is "+ mobileNum);

		}
		else
		{
			System.out.println("Mobile Number name is disabled");
		}

		//Query

		System.out.println("******************************************************************************");

		WebElement qUery = driver.findElement(By.id("vfb-23"));

		if(qUery.isEnabled()) 
		{
			System.out.println("Query is Enabled");
			qUery.sendKeys(query);
			System.out.println("Query is "+ query);

		}
		else
		{
			System.out.println("Query name is disabled");
		}

		// Course Interested

		WebElement coreJava = driver.findElement(By.xpath("//*[@value ='Core Java']"));

		// -> Checking Courses are Selected or not, If not then select the value.

		System.out.println("******************************************************************************");

		if(coreJava.isSelected()) 
		{
			System.out.println("Core Java checkbox is Selected");
		}
		else
		{
			System.out.println("Core Java checkbox is not Selected");
			coreJava.click();
			System.out.println("Core Java checkbox is now Selected");
		}	

		WebElement testNG = driver.findElement(By.xpath("//*[@value = 'TestNG']"));

		if(testNG.isSelected()) 
		{
			System.out.println("Test NG checkbox is Selected");
		}
		else
		{
			System.out.println("Test NG checkbox is not Selected");
			testNG.click();
			System.out.println("Test NG checkbox is now Selected");
		}

		// Two Digit Verification

		System.out.println("******************************************************************************");

		WebElement two_Digit = driver.findElement(By.xpath("//*[text()='Example: 99']"));

		String digit[] = two_Digit.getText().split(":");		

		String digit1 = digit[1].trim();

		WebElement two_Dig = driver.findElement(By.id("vfb-3"));

		if(two_Dig.isEnabled())
		{
			System.out.println("Two-Digits are Enabled");
			two_Dig.sendKeys(digit1);
			System.out.println("Two Digits are : " + digit1);
		}
		else
		{
			System.out.println("Two-Digits are not Enabled");
		}

		// Submit Button

		System.out.println("******************************************************************************");

		WebElement submitBtn = driver.findElement(By.xpath("//*[@id='vfb-4']")) ;

		if(submitBtn.isEnabled())
		{
			System.out.println("Submit button is Enabled");
			submitBtn.click();
			System.out.println("Submit button is Clicked");
		}
		else
		{
			System.out.println("Submit button is not Enabled");
		}


		System.out.println("User Registered Successfully");
	}
	@Test(priority=4)
	public void validateSuccessFullMsg() {

		System.out.println("******************************************************************************");

		WebElement ValidateTransactionID = driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-7e205e7c']//div[@class='elementor-widget-container']//div[1]"));

		String actValMsg = ValidateTransactionID.getText();
		String expValMsg = "Registration Form is Successfully Submitted. The Transaction ID : NXTGEN1937465";

		//WebElement transID = driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-7e205e7c']//div[@class='elementor-widget-container']//div[1]"));

		String transactionID[] = ValidateTransactionID.getText().split(":");		

		String transactionID1 = transactionID[1].trim();
		
		if(ValidateTransactionID.isDisplayed())
		{
			System.out.println("Registration Successfull is Displayed");	
			System.out.println("Transaction ID is " + transactionID1);
			
			if(actValMsg.contains(expValMsg))
			{
				//System.out.println("Registration Successful message is Matched");
				System.out.println("Actual message -> " + actValMsg);
			}
			else
			{
				System.out.println("Registration Successfull message is not Matched");
				System.out.println("Actual message -> " + actValMsg);
				System.out.println("Expected message -> " + expValMsg);
			}
		}
		else
		{
			System.out.println("Registration is not Displayed");
		}


		System.out.println("Validation is Successfull");
	}

	@Test(priority=5)
	public void closeApplication() {

		driver.close();

		System.out.println("Application Closed Successfully"); 
	}

}
