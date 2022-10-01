package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAutomationPage extends BasePage{
    public PracticeAutomationPage(WebDriver webDriver) {
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

    public WebElement getLogOutButton(){
        return myWebDriver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));

    }

    public WebElement getSuccessMessage(){
        return myWebDriver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));
    }

    public WebElement getErrorMessage(){
        return myWebDriver.findElement(By.id("error"));
    }
}