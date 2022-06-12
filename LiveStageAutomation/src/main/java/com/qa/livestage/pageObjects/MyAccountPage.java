package com.qa.livestage.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

	public WebDriver driver;
	private By myaccount=By.xpath("//h1[text()='My Account']");
	
	
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getMyAccountPageTitle(){
		
		return driver.getTitle();
	}
	
	public int getMyAccountsection(){
		return driver.findElements(myaccount).size();
		
	}
	public List<String> getMyAccountSectionList(){
		
		List<String> myaccountList=new ArrayList<>();
		List<WebElement> accountsHeaderList = driver.findElements(myaccount);
		
		for(WebElement e : accountsHeaderList){
			String text = e.getText();
			System.out.println(text);
			myaccountList.add(text);
		}
		return myaccountList;
	}
}
