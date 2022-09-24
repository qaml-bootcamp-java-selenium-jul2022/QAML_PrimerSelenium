package Steps;

import Pages.MyFirstWebPage;
import Pages.PracticeTestAutomationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeTestAutomationSteps extends BaseSteps {

    PracticeTestAutomationPage automationPage = new PracticeTestAutomationPage(myWebDriver);
    public PracticeTestAutomationSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    //PASO 1
    public void openURL(){
        myWebDriver.get("https://practicetestautomation.com/practice-test-login/");
    }
    //PASO 2
    public void printPageTitle(){
        System.out.println(myWebDriver.getTitle());
    }

    public String getPageTitle(){
        return myWebDriver.getTitle();
    }
    //PASO 3
    public void printActualURL(){
        System.out.println(myWebDriver.getCurrentUrl());
    }

    public String getActualURL(){
        return myWebDriver.getCurrentUrl();
    }

    public void inputUsername(String texto) {
        WebElement usernameField = automationPage.usernameTextField();
        usernameField.sendKeys(texto);
    }

    public void inputPassword(String texto) {
        WebElement passwordField = automationPage.passwordTextField();
        passwordField.sendKeys(texto);
    }

    public void clickLoginButton() {
        WebElement LoginButton = automationPage.submitButton();
        LoginButton.click();
    }

    public boolean isLogoutButtonDisplayed() {
        WebElement LogoutButton = automationPage.logoutButton();
        return LogoutButton.isDisplayed();
    }

    public void clickLogoutButton() {
        WebElement LoginButton = automationPage.logoutButton();
        LoginButton.click();
    }

    public String getSuccessMessage() {
        WebElement message = automationPage.loginSuccessMessage();
        String text = message.getText();
        return text;
    }

    public String getErrorMessage() {
        WebElement message = automationPage.loginError();
        String text = message.getText();
        return text;
    }

}
