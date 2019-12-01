package com.yoshallc.core;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

    protected WebDriverWait wait;
    protected WebDriver driver = null;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver,15);
    }


    //Wait Wrapper Method
    public void waitVisibility(WebElement elementBy) {
        wait.until(ExpectedConditions.visibilityOf(elementBy));
    }

    //Click Method
    public void click (WebElement elementBy) {
        waitVisibility(elementBy);
        elementBy.click();
    }

    //Write Text
    public void sendKeys (WebElement elementBy, String text) {
        waitVisibility(elementBy);
       elementBy.sendKeys(text);
    }

    //Read Text
    public String readText (WebElement elementBy) {
        waitVisibility(elementBy);
        return elementBy.getText();
    }

    //Assert
    public void assertEquals (WebElement elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(elementBy, expectedText);

    }
}