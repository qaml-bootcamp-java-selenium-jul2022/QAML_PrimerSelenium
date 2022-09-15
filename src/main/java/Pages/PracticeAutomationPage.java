package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAutomationPage extends BasePage{
    public PracticeAutomationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getUserNameTextBox(){
        return myWebdriver.findElement(By.id("username"));
    }

    public WebElement getPasswordTextBox(){
        return myWebdriver.findElement(By.id("password"));
    }

    public WebElement getSubmitButton(){
        return myWebdriver.findElement(By.id("submit"));
    }

    public WebElement getLogOutButton(){
        return myWebdriver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));

    }

    public WebElement getSuccessMessage(){
        return myWebdriver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));
    }

    public WebElement getErrorMessage(){
        return myWebdriver.findElement(By.id("error"));
    }

}