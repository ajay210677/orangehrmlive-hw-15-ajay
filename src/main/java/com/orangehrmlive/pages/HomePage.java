package com.orangehrmlive.pages;


import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By searchField = By.id("small-searchterms");

    public void clickOnLoginLink(){
        Reporter .log("Clicking on login link"+loginLink.toString());

        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        Reporter .log("Clicking on RegisterLink"+ registerLink.toString());

        clickOnElement(registerLink);
    }

    public void enterTextToSearchField(String text){
        sendTextToElement(searchField, text);
    }
}
