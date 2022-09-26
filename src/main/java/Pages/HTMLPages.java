package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HTMLPages extends BasePage{
    public HTMLPages(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement searchUser(){
        return myWebDriver.findElement(By.id("username"));
    }

    public WebElement searchPass(){
        return myWebDriver.findElement(By.id("password"));
    }

    public WebElement seleccionarLogin(){
        return myWebDriver.findElement(By.name("login"));
    }
}
