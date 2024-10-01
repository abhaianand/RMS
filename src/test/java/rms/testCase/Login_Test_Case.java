package com.rms.testCase;
import com.rms.pageObjects.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class Login_Test_Case  {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://rms-qa.2.mtlstaging.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
	@Test
    public void testMethod() throws InterruptedException
	{
        loginPage r = new loginPage(driver);
        r.sendusername("admin@gmail.com");
        r.sendPassword("Admin@123");
         r.click_login_button();
         Thread.sleep(8000);
        String actual_page_Title = driver.getTitle();
         String expected_Title = "NJ GROUP";
        Assert.assertEquals(driver.getTitle(),"NJ GROUP");
     
    }
}







