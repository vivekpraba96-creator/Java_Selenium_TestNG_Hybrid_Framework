# Java Selenium TestNG Hybrid Automation Framework

## Project Overview

This project is a UI test automation framework built using **Java, Selenium WebDriver, TestNG, and Maven**. It is designed to organize, execute, and maintain automated web application test cases in a reusable and structured way.

The framework serves as a practical demonstration of web UI automation, test organization, assertions, and Maven-based test execution.

## Tech Stack

- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Test Framework:** TestNG
- **Build and Dependency Management:** Maven
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub

## Key Features

- Reusable Selenium automation code
- Test execution and organization using TestNG
- Assertions to validate actual and expected results
- Maven dependency management and test execution
- Structured project organization for maintainability
- Version control and source code management using Git

*Add features such as Page Object Model, data-driven testing, screenshots on failure, or HTML reporting only after confirming they are implemented in the project.*

## Project Structure

The following is an illustrative structure. Update it to match the actual folders and files in your project.

```text
Java_Selenium_TestNG_Hybrid_Framework/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
├── pom.xml
├── testng.xml
├── README.md
└── .gitignore
```

## Prerequisites

Install the following before running the project:

- Java JDK compatible with the project configuration
- IntelliJ IDEA
- Git
- Maven, or IntelliJ's Maven integration
- A supported web browser

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/vivekpraba96-creator/Java_Selenium_TestNG_Hybrid_Framework.git
```

### 2. Open the Project

1. Open IntelliJ IDEA.
2. Select **Open** and choose the cloned project folder.
3. Allow IntelliJ IDEA to import the Maven project.
4. Configure a compatible JDK.

### 3. Load Maven Dependencies

Open the `pom.xml` file and reload the Maven project using the Maven tool window in IntelliJ IDEA.

### 4. Execute the Tests

If the project has a TestNG suite file named `testng.xml`, run the suite from IntelliJ IDEA.

Alternatively, from the project root, execute:

```bash
mvn test
```

This command runs tests according to the project's Maven and TestNG configuration.

## Test Execution and Validation

TestNG annotations and assertions can be used to organize test execution and validate application behavior. Test results depend on the test cases, browser configuration, and application under test.

## Version Control

This project uses Git for version control and GitHub for remote repository hosting.

```bash
git add .
git commit -m "Update automation framework documentation"
git push
```

## Future Enhancements

- Expand automated test coverage
- Improve reusable test utilities
- Introduce external test data management
- Add detailed test execution reports
- Integrate automated execution into a CI/CD pipeline

## Author

**Vivek V**

Java | Selenium WebDriver | TestNG | Maven | QA Automation

## Repository

[Java Selenium TestNG Hybrid Automation Framework](https://github.com/vivekpraba96-creator/Java_Selenium_TestNG_Hybrid_Framework)
