package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {
	WebDriver wd;
  @Test
  public void SearchTest() {
	  wd.get("https://google.com");
	  wd.manage().window().maximize();
	  wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  WebElement textField = wd.findElement(By.name("q"));
	  textField.sendKeys("What is Testing?");
	  WebElement btnRef = wd.findElement(By.name("btnK"));
	  btnRef.sendKeys(Keys.ENTER);
	  try {
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",  "C:\\Users\\srir7\\OneDrive\\Desktop\\chromedriver_win32/chromedriver.exe");
		wd = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  wd.navigate().back();
	  Thread.sleep(20000);
	  wd.close();
  }

}
