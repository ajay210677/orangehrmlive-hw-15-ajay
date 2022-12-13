package com.orangehrmlive.testsuite;


import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage ;

    public LoginPageTest() {
    }

    @BeforeMethod(
            alwaysRun = true
    )
    public void inIt() {
        this.loginPage = new LoginPage();
    }

    @Test(
            groups = {"sanity", "regression"}
    )
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        this.loginPage.enterUserName("Admin");
        this.loginPage.enterPassword("admin123");
        this.loginPage.clickOnLoginButton();
        Assert.assertEquals(this.loginPage.getAfterLoginText(), "Dashboard", "Text not found");
    }

    @Test(
            groups = {"smoke", "regression"}
    )
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        this.loginPage.clickOnForgotPasswordLink();
        Assert.assertEquals(this.loginPage.getResetText(), "Reset Password", "Text not found");
    }

}