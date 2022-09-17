package Steps;

import Pages.DemoQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQASteps extends BaseSteps {

    DemoQAPage demoqa = new DemoQAPage(myWebDriver);
    public DemoQASteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    //PASO 1
    public void openURL(){
        myWebDriver.get("https://demoqa.com/text-box/");
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

    public void inputFullName(String text) {
        WebElement fullNameTextField = demoqa.fullNameTextField();
        fullNameTextField.sendKeys(text);
    }

    public void inputEmail(String text) {
        WebElement emailTextField = demoqa.emailTextField();
        emailTextField.sendKeys(text);
    }

    public void inputCurrentAddress(String text) {
        WebElement currentAddressField = demoqa.currentAddressTextField();
        currentAddressField.sendKeys(text);
    }

    public void inputPermanentAddress(String text) {
        WebElement permanentAddressField = demoqa.permanentAddressTextField();
        permanentAddressField.sendKeys(text);
    }

    public void clickSubmitButton() {
        WebElement LoginButton = demoqa.submitButton();
        LoginButton.click();
    }

    public boolean isNameOutPutDisplayed() {
        WebElement nameOutPutField = demoqa.nameOutPutField();
        return nameOutPutField.isDisplayed();
    }

    public String getNameOutPutText() {
        WebElement nameOutPutField = demoqa.nameOutPutField();
        return nameOutPutField.getText();
    }

    public boolean isEmailOutPutDisplayed() {
        WebElement emailOutPutField = demoqa.emailOutPutField();
        return emailOutPutField.isDisplayed();
    }

    public String getEmailOutPutText() {
        WebElement emailOutPutField = demoqa.emailOutPutField();
        return emailOutPutField.getText();
    }

    public boolean isCurrentAddressOutPutDisplayed() {
        WebElement currentAddressOutPutField = demoqa.currentAddressOutPutField();
        return currentAddressOutPutField.isDisplayed();
    }

    public String getCurrentAddressOutText() {
        WebElement currentAddressOutPutField = demoqa.currentAddressOutPutField();
        return currentAddressOutPutField.getText();
    }

    public boolean isPermanentAddressOutPutDisplayed() {
        WebElement currentAddressOutPutField = demoqa.permanentAddressOutPutField();
        return currentAddressOutPutField.isDisplayed();
    }

    public String getPermanentAddressOutText() {
        WebElement permanentAddressOutPutField = demoqa.permanentAddressOutPutField();
        return permanentAddressOutPutField.getText();
    }


}
