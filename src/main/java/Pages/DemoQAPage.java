package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAPage extends BasePage{


    public DemoQAPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getFullName (){
       return myWebdriver.findElement(By.id("userName"));
    }

    public WebElement getEmail (){
        return myWebdriver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress (){
        return myWebdriver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress (){
        return myWebdriver.findElement(By.id("permanentAddress"));
    }
}
