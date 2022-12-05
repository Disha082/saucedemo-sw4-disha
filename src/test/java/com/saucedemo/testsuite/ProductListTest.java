package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductListTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        productPage.getListFromProductListField();
        int expectedText = 6;
        int actualText = productPage.getListFromProductListField();
        Assert.assertEquals(actualText,expectedText,"Verify Producy");

    }

}
