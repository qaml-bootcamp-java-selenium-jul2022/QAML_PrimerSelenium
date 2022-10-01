package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAutomationPage extends BasePage{

    public PracticeAutomationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement escribirUserName() {
        return myWebDriver.findElement(By.id("username"));
    }

    public WebElement escribirPassword(){
        return myWebDriver.findElement(By.id("password"));
    }

    public WebElement submit(){
        return myWebDriver.findElement(By.id("submit"));
    }

    public WebElement getTxtError(){
        return myWebDriver.findElement(By.id("error"));
    }

    public WebElement getTxtloginSuccessfull(){
        return myWebDriver.findElement(By.className("post-title"));
    }

    public WebElement logout(){
        return myWebDriver.findElement(By.className("has-very-dark-gray-background-color"));
    }
}
