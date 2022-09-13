package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HTMLPages extends BasePage{
    public HTMLPages(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement searchUser(){
        return myWebdriver.findElement(By.id("username"));
    }

    public WebElement searchPass(){
        return myWebdriver.findElement(By.id("password"));
    }

    public WebElement seleccionarLogin(){
        return myWebdriver.findElement(By.name("login"));
    }
}
