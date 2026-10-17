package com.vivek.tests;

import com.vivek.base.BaseTest;
import com.vivek.pages.InventoryPage;
import com.vivek.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryTests extends BaseTest {

    private void loginAsStandardUser() {
        new LoginPage().login("standard_user", "secret_sauce");
    }

    @Test
    public void productPageIsDisplayedAfterLogin() {
        loginAsStandardUser();
        Assert.assertEquals(new InventoryPage().getPageTitle(), "Products");
    }

    @Test
    public void userCanAddBackpackToCart() {
        loginAsStandardUser();
        InventoryPage inventoryPage = new InventoryPage();

        inventoryPage.addBackpackToCart();
        Assert.assertEquals(inventoryPage.getCartCount(), "1",
                "Cart badge should show one item after adding a product.");
    }
}
