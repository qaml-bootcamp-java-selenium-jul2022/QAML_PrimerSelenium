package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAPage extends BasePage {

    public DemoQAPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement fullNameTextField() {
        return myWebDriver.findElement(By.id("userName"));
    }

    public WebElement emailTextField() {
        return myWebDriver.findElement(By.id("userEmail"));
    }

    public WebElement currentAddressTextField() {
        return myWebDriver.findElement(By.id("currentAddress"));
    }

    public WebElement permanentAddressTextField() {
        return myWebDriver.findElement(By.id("permanentAddress"));
    }

    public WebElement submitButton() {
        return myWebDriver.findElement(By.cssSelector("#submit"));
    }

    public WebElement nameOutPutField() {
        return myWebDriver.findElement(By.id("name"));
    }

    public WebElement emailOutPutField() {
        return myWebDriver.findElement(By.cssSelector("#email"));
    }

    public WebElement currentAddressOutPutField() {
        return myWebDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[3]"));
    }

    public WebElement permanentAddressOutPutField() {
        return myWebDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[4]"));
    }
}
