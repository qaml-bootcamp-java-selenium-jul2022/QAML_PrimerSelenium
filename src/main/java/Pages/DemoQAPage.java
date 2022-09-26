package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAPage extends BasePage{


    public DemoQAPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getFullName (){
       return myWebDriver.findElement(By.id("userName"));
    }

    public WebElement getEmail (){
        return myWebDriver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress (){
        return myWebDriver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress (){
        return myWebDriver.findElement(By.id("permanentAddress"));
    }
}
