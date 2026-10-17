package com.vivek.utils;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "invalidLoginData")
    public static Object[][] invalidLoginData() {
        return new Object[][] {
                {"wrong_user", "secret_sauce"},
                {"standard_user", "wrong_password"},
                {"", ""}
        };
    }
}
