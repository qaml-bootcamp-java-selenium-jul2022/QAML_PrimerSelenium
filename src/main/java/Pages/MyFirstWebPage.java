package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFirstWebPage extends BasePage{

    public MyFirstWebPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getUsername(){
        return myWebDriver.findElement(By.cssSelector("#username"));
    }

    public WebElement getPassword() {
        return myWebDriver.findElement(By.cssSelector("#password"));
    }

    public WebElement getLoginButton() {
        //return myWebDriver.findElement(By.cssSelector("body > form > p > button"));
        return myWebDriver.findElement(By.name("login"));
    }



}
