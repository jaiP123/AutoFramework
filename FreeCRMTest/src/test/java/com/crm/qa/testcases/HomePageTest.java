package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
    LoginPage loginPage;
    HomePage homePage;
	public HomePageTest(){
		super();
	}
	@BeforeMethod
	public void SetUp(){
		initialization();
		loginPage =new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomeTitleTest(){
		String Hometitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(Hometitle, "CRMPRO :: 2.0");
	}
	
	@Test
	public void verifyuserNameTest(){
		boolean usr=homePage.verifyuserName();
		Assert.assertTrue(usr ,"Not valid userName");
	}
	
    @AfterMethod
	
	public void teardown(){
		driver.quit();
	}
	
}
