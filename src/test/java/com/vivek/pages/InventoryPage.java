package com.vivek.pages;

import com.vivek.config.ConfigReader;
import com.vivek.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    private final WebDriver driver = DriverFactory.getDriver();
    private final WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(ConfigReader.getInt("explicitWaitSeconds")));

    private final By pageTitle = By.cssSelector("[data-test='title']");
    private final By firstAddToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By cartBadge = By.cssSelector("[data-test='shopping-cart-badge']");
    private final By cartLink = By.className("shopping_cart_link");

    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }

    public void addBackpackToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(firstAddToCartButton)).click();
    }

    public String getCartCount() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cartBadge)).getText();
    }

    public void openCart() {
        driver.findElement(cartLink).click();
    }
}
