package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticetestautomationPage extends BasePage{

    public PracticetestautomationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getUsernameTextbox(){
        return myWebDriver.findElement(By.id("username"));
    }

    public WebElement getPasswordTextbox(){
        return myWebDriver.findElement(By.id("password"));
    }

    public WebElement clickBotonSubmit(){
        return myWebDriver.findElement(By.id("submit"));
    }

    public WebElement messageSuccessfully(){
        return myWebDriver.findElement(By.className("post-title"));
    }

    public WebElement buttonOut(){
        return myWebDriver.findElement(By.cssSelector(".wp-block-button__link has-text-color.has-background.has-very-dark-gray-background-color"));
    }

    public WebElement errorMessage(){
        return myWebDriver.findElement(By.id("error"));
    }
}
