package com.luojiahui.jenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class JenkinsTest {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("http://www.baidu.com");
	  Thread.sleep(5000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver =new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
