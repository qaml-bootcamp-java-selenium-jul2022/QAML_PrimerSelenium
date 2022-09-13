package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFirstWebPage extends BasePage{

    public MyFirstWebPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getInputName(){
        return myWebDriver.findElement(By.name("username"));
    }

    public WebElement getInputPassword(){
        return myWebDriver.findElement(By.name("password"));
    }

    public WebElement getButton(){
        return myWebDriver.findElement(By.tagName("button"));
    }

}
