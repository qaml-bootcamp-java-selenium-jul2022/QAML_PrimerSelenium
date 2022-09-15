package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQaPage extends BasePage{
    public DemoQaPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getFullNameTextBox(){
        return myWebDriver.findElement(By.id("userName"));
    }
    public WebElement getEmailTextBox(){
        return myWebDriver.findElement(By.id("userEmail"));
    }
    public WebElement getCurrentAddressTextBox(){
        return myWebDriver.findElement(By.id("currentAddress"));
    }
    public WebElement getPermanentAddressTextBox(){
        return myWebDriver.findElement(By.id("permanentAddress"));
    }
    public WebElement getSubmitButton(){
        return myWebDriver.findElement(By.id("submit"));
    }

}
