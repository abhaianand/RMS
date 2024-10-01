package com.rms.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends BaseClass{
    public loginPage(WebDriver driver)
    {
       super(driver);
    }

    String input_name_xpath = "//*[@id=\"root\"]/div/div[3]/div/div[1]/div[1]/form/div[2]/div[1]/input";
    String iput_password_xpath = "//*[@id=\"root\"]/div/div[3]/div/div[1]/div[1]/form/div[2]/div[2]/input";

    String button_continue_xpath ="//button[contains(text(),'Continue')]";
    public void sendusername(String username1) {

        driver.findElement(By.xpath(input_name_xpath)).sendKeys(username1);

    }
    public  void sendPassword(String password1) {

        driver.findElement(By.xpath(iput_password_xpath)).sendKeys(password1);
    }
    public  void click_login_button()
    {
            driver.findElement(By.xpath(button_continue_xpath)).click();

     }
}
