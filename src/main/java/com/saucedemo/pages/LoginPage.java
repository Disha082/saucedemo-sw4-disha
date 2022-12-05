package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.name("user-name");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@name = 'login-button']");

    public void enterUsername (String username){
        sendTextToElement(userNameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }



}
