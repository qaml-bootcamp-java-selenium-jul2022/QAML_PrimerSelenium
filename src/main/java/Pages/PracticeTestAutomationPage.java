package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeTestAutomationPage extends BasePage {

    public PracticeTestAutomationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement usernameTextField() {
        return myWebDriver.findElement(By.id("username"));
    }

    public WebElement passwordTextField() {
        return myWebDriver.findElement(By.id("password"));
    }
    public WebElement submitButton() {
        return myWebDriver.findElement(By.id("submit"));
    }

    public WebElement loginSuccessHeader() {
        return myWebDriver.findElement(By.className("post-title"));
    }

    public WebElement loginSuccessMessage() {
        return myWebDriver.findElement(By.cssSelector("#loop-container > div > article > div.post-content > p.has-text-align-center"));
    }

    public WebElement logoutButton() {
        return myWebDriver.findElement(By.cssSelector("#loop-container > div > article > div.post-content > div > div > div > a"));
    }
    //Your username is invalid!
    //Your password is invalid!
    public WebElement loginError(){
        return myWebDriver.findElement(By.id("error"));
    }



}
