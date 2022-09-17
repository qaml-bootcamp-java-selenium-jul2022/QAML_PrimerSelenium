package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*Equipo:
Monsse
Susana
Luis Bravo*/
public class TestLoginPage extends BasePage{
    public TestLoginPage(WebDriver webDriver) {
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

    public WebElement getContainer(){
        return myWebDriver.findElement(By.className("has-text-align-center"));
    }


    public WebElement getLogoutButton(){
        return myWebDriver.findElement(By.linkText("Log out"));
    }

    public WebElement getErrorMessage(){
        return myWebDriver.findElement(By.id("error"));
    }
}
