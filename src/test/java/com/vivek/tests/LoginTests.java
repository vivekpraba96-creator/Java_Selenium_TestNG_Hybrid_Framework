package com.vivek.tests;

import com.vivek.base.BaseTest;
import com.vivek.driver.DriverFactory;
import com.vivek.pages.InventoryPage;
import com.vivek.pages.LoginPage;
import com.vivek.utils.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void validUserCanLogin() {
        new LoginPage().login("standard_user", "secret_sauce");

        Assert.assertEquals(new InventoryPage().getPageTitle(), "Products",
                "Successful login should open the Products page.");
    }

    @Test(dataProvider = "invalidLoginData", dataProviderClass = TestData.class)
    public void invalidCredentialsShowError(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

        Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface"),
                "An error message should be displayed for invalid credentials.");
        Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("saucedemo.com"),
                "User should remain on the login site.");
    }
}
