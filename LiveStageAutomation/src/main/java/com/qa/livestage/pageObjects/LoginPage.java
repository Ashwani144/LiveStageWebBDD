package com.qa.livestage.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//1. By Locators
	private By email=By.xpath("//input[@placeholder='Email']");
	private By pass=By.xpath("//input[@placeholder='Password']");
	private By loginbutton=By.xpath("//button[text()='Continue']");
	private By forgotPwdLink=By.xpath("//a[text()='Forgot Password?']");
	private By cookiesbuttton=By.xpath("//button[text()='Allow all cookies']");
	
	//2. Constructor of the page class 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//3. page actions : Feature
	public String getLoginPageTitle(){
		return driver.getTitle();
	}
	public boolean isForgotPwdLinkExist(){
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username){
		driver.findElement(email).sendKeys(username);
	}     
	public void enterPassword(String password){
		driver.findElement(pass).sendKeys(password);
	}
	
	public void clickOncookies(){
		driver.findElement(cookiesbuttton).click();
	}
	
	public void clickOnLogin(){
		driver.findElement(loginbutton).click();
	}
		
	public MyAccountPage dologin(String em, String pwd){
		System.out.println("Login with: " + em + " and " + pwd );
		driver.findElement(email).sendKeys(em);
		driver.findElement(pass).sendKeys(pwd);
		driver.findElement(cookiesbuttton).click();
		driver.findElement(loginbutton).click();
		return new MyAccountPage(driver);
		
	}
	
	
}
