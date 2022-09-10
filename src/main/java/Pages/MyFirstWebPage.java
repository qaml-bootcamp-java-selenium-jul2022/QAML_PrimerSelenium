package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFirstWebPage extends BasePage{

    public MyFirstWebPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getUsernameTextBox(){
        return myWebDriver.findElement(By.id("username"));
    }

    public WebElement getPasswordTextBox(){
        return myWebDriver.findElement(By.id("password"));
    }

    public WebElement clickLoginButton(){
        return myWebDriver.findElement(By.name("login"));
    }
}
