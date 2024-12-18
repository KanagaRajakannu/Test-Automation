# UI Automation Testing with Selenium

## Overview
This project demonstrates UI automation testing using Selenium WebDriver. The tests are designed to verify the functionality of the login feature. It includes test cases for both valid and invalid credentials.

## Tools & Technologies
- **Programming Language**: Java
- **Automation Framework**: Selenium WebDriver
- **Build Tool**: Maven
- **Browser**: Google Chrome
- **Testing Tool**: JUnit/TestNG

## Approach
1. **Test Scenarios**:
   - **Valid Credentials**:
     - Open the login page.
     - Enter valid username and password.
     - Click on the login button.
     - Verify if the username is displayed after a successful login.
   - **Invalid Credentials**:
     - Open the login page.
     - Enter invalid username or password.
     - Click on the login button.
     - Verify if an error message is displayed.

2. **Assertions**:
   - For valid credentials, the test checks for the presence of the username element after login.
   - For invalid credentials, the test checks for the visibility of an error message.

## How to Execute Tests

### Prerequisites
1. **Install JDK**:
   - Ensure you have JDK latest version.
   - Set `JAVA_HOME` in your environment variables.

2. **Install Maven**:
   - Maven is required for dependency management.
   - Download Maven.
3. **Download Browser Driver**:
   - Download the ChromeDriver version that matches your browser version .
   - Place the driver in a directory included in your `PATH`.
     
### Run the Tests
1. **Using an IDE (Eclipse/IntelliJ)**:
   - Open the project in your preferred IDE.
   - Add the ChromeDriver executable to your system's PATH.
   - Run the `LoginTests.java` file as a Java application.

2. **Using Maven**:
   - Open a terminal in the project root directory.
   - Execute the following command:
     ```bash
     mvn clean test
     ```
