package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddtoCart {
	WebDriver wd;
  @Test
  public void AddCartTest() {
	  wd.get("https://cupsofmagik.com/");
	  wd.manage().window().maximize();
	  WebElement AddCartBut = wd.findElement(By.id("AddToCart-1602165198576"));
	  AddCartBut.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",  "C:\\Users\\srir7\\OneDrive\\Desktop\\chromedriver_win32/chromedriver.exe");
		wd = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(20000);
	  wd.close();
  }

}
