package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeTestPage extends BasePage{
    public PracticeTestPage(WebDriver webDriver) {
        super(webDriver);
    }
    public WebElement getUserNameTextBox(){
        return myWebDriver.findElement(By.id("username"));
    }

    public WebElement getPasswordTextBox(){
        return myWebDriver.findElement(By.id("password"));
    }
    public WebElement getSubmitButton(){
        return myWebDriver.findElement(By.id("submit"));
    }
    public WebElement getLoggedInMessage(){
        return myWebDriver.findElement(By.className("post-title"));
    }
    public WebElement getLoggedOutButton(){
        return myWebDriver.findElement(By.className("wp-block-button__link"));
    }
    public WebElement getErrorMessage(){
        return myWebDriver.findElement(By.id("error"));
    }

}
