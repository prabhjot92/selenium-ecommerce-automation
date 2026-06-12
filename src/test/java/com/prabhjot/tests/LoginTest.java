package com.prabhjot.tests;
import com.prabhjot.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import com.prabhjot.utils.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        setup();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user");

        loginPage.enterPassword("secret_sauce");

        loginPage.clickLogin();

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "Swag Labs");

        System.out.println("Login Successful");

        driver.quit();
    }
}