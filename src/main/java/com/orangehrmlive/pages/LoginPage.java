package com.orangehrmlive.pages;


import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;


public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication() {
        //  enterEmailId(username);
        // enterPassword(password);
        clickOnLoginButton();
    }

    public void enterUsernameToUserNameField(String tomsmith) {
    }

    public void enterUserName(String admin) {
    }


    public byte[] getAfterLoginText() {

        return new byte[0];
    }

    public void clickOnForgotPasswordLink() {
    }

    public byte[] getResetText() {
        return new byte[0];
    }
}
