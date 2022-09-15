package Pages;

import Steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAPage extends BasePage {
    public DemoQAPage(WebDriver webDriver) {
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

}
