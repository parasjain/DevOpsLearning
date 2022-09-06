package com.telus.annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ClassLevel {

	public WebDriver driver;
	@BeforeClass
	public void launchApplication() {

		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		String url ="https://nxtgenaiacademy.com";

		driver.get(url);

		driver.manage().window().maximize();

		Reporter.log("Application Launched Successfully");

		System.out.println("Application is launched");
	}

	@AfterClass
	public void closeApplication() {

		driver.close();

		System.out.println("Application is closed");
	}

	@Test
	public void navigateToRegister() {

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

		System.out.println("Register Page is opened");
	}

	@Test
	public void navigateToPopUp() {

		Actions action = new Actions(driver);

		// Hovering Mouse on the QA AUTOMATION

		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();

		// Hovering Mouse on the Practice Automation

		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();

		// Hovering Mouse on the Registration page then Click to the Registration page

		WebElement regForm = driver.findElement(By.partialLinkText("Alert And Popup"));
		action.moveToElement(regForm).click().perform();

		System.out.println("Pop-Up Page is opened");

	}

	@Test
	public void navigateToWebTable() {

		Actions action = new Actions(driver);

		// Hovering Mouse on the QA AUTOMATION

		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();

		// Hovering Mouse on the Practice Automation

		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(pracAutomation).perform();

		// Hovering Mouse on the Registration page then Click to the Registration page

		WebElement regForm = driver.findElement(By.partialLinkText("WebTable"));
		action.moveToElement(regForm).click().perform();

		System.out.println("Web-Table Page is opened");
	}
}
