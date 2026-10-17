# Java + Selenium + TestNG Hybrid Automation Framework

A beginner-friendly Maven framework that combines:
- **Page Object Model (POM):** page locators and page actions are separated from tests.
- **Data-driven testing:** invalid-login test data is supplied by a TestNG `@DataProvider`.
- **Reusable base test:** browser setup and teardown are centralized.
- **Configuration file:** base URL, browser and explicit wait are in `config.properties`.
- **Assertions:** TestNG validates expected results.
- **Driver management:** WebDriverManager downloads/sets up ChromeDriver.

## Included test coverage

1. Valid login succeeds.
2. Invalid username shows an error.
3. Invalid password shows an error.
4. Empty credentials show an error.
5. Products page title is displayed after login.
6. Backpack can be added to the cart and the cart badge becomes `1`.

The tests use the public demo site https://www.saucedemo.com/ and its standard demo credentials:
- Username: `standard_user`
- Password: `secret_sauce`

## Requirements

- JDK 17 or later
- IntelliJ IDEA
- Maven (or use IntelliJ's Maven integration)
- Google Chrome
- Internet access for Maven dependencies and the demo site

## Import into IntelliJ IDEA

1. Download and extract this ZIP file.
2. Open IntelliJ IDEA.
3. Choose **File → Open** and select the extracted `Java_Selenium_TestNG_Hybrid_Framework` folder (the folder containing `pom.xml`).
4. If prompted, choose **Load Maven Project** / **Trust Project**.
5. Set the Project SDK to JDK 17 or later: **File → Project Structure → Project SDK**.
6. Wait for Maven to download dependencies.
7. Open `testng.xml`, then click the green run icon beside the suite, or run the tests using Maven.

## Run tests

From the project root in the IntelliJ Terminal:

```bash
mvn clean test
```

If PowerShell says `mvn` is not recognized, Maven is not installed or its `bin` folder is not on PATH. You can still run the suite from IntelliJ's Maven tool window:
**View → Tool Windows → Maven → Lifecycle → test**.

## Project structure

```text
Java_Selenium_TestNG_Hybrid_Framework/
├── pom.xml
├── testng.xml
├── README.md
└── src/
    └── test/
        ├── java/com/vivek/
        │   ├── base/BaseTest.java
        │   ├── config/ConfigReader.java
        │   ├── driver/DriverFactory.java
        │   ├── pages/LoginPage.java
        │   ├── pages/InventoryPage.java
        │   ├── tests/LoginTests.java
        │   ├── tests/InventoryTests.java
        │   └── utils/TestData.java
        └── resources/config.properties
```

## Change settings

Edit `src/test/resources/config.properties`:

```properties
baseUrl=https://www.saucedemo.com/
browser=chrome
explicitWaitSeconds=10
```

Java system properties can override config values, for example:

```bash
mvn clean test -DbaseUrl=https://www.saucedemo.com/ -Dbrowser=chrome
```

## Troubleshooting

- **JDK error:** configure JDK 17+ in IntelliJ.
- **Maven dependencies not loading:** open the Maven tool window and click Reload All Maven Projects.
- **ChromeDriver/browser issue:** update Chrome and retry; WebDriverManager will attempt to set up a compatible driver.
- **Site or network issue:** check that `https://www.saucedemo.com/` opens in Chrome.
- **Tests fail on first run:** check the error details in the TestNG/Maven output before changing locators.

This is a starter framework. It intentionally uses a small set of classes so you can learn how the pieces work before adding Excel files, screenshots, reporting, logging, parallel execution, or CI/CD.
