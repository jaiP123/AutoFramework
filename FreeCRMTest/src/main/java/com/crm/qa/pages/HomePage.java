package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	// OR - Page factory
	
	@FindBy(xpath="//td[contains(text(),'User: Naveen K')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),contact)]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),Deals)]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),Tasks)]")
	WebElement tasksLink;
	
	//Initialization of page objects
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
	
	public String verifyHomePageTitle(){
		
		return driver.getTitle();
	}
	
public boolean verifyuserName(){
		
		return userNameLabel.isDisplayed();
	}

	public ContactsPage clickonContactsLink(){
		contactsLink.click();
		
		return new ContactsPage();
	}
	
	public DealsPage clickonDealsLink(){
		dealsLink.click();
		
		return new DealsPage();
	}
	
	public TasksPage clickonTasksLink(){
		tasksLink.click();
		
		return new TasksPage();
	}
	
}
