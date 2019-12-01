package com.yoshallc.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

	private static Logger logger = LoggerFactory.getLogger(BaseTest.class);

	public WebDriver driver;

	@BeforeClass
	public void setup () {
		//Create a Chrome driver. All test classes use this.
		driver = new ChromeDriver();
		//Maximize Window
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teardown () {
		driver.quit();
	}


}
