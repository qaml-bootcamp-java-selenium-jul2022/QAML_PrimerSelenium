package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicHtmlPage extends BasePage{
    public BasicHtmlPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getUsername (){
        return myWebDriver.findElement(By.id("username"));
    }

    public WebElement getPassword (){
        return myWebDriver.findElement(By.id("password"));
    }

    public WebElement getSubmitButton (){
        return myWebDriver.findElement(By.cssSelector("button.btn.btn-lg.btn-primary.btn-block.radius"));
    }
}
