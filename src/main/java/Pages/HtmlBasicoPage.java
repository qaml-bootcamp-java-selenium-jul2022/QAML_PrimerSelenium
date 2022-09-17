package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtmlBasicoPage extends BasePage{

    public HtmlBasicoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getUserNameTextBox(){
        return myWebDriver.findElement(By.name("username"));
    }

    public WebElement getPasswordTextBox(){
        return myWebDriver.findElement(By.id("password"));
    }

    public WebElement getButtonLogin(){
        return myWebDriver.findElement(By.name("login"));
    }
    public WebElement getLoginFormLogin(){
        return myWebDriver.findElement(By.xpath("//h4[1]"));
    }
   public WebElement getBodyText(){
        return myWebDriver.findElement(By.xpath("//*[contains(text(),'This is my')]"));
    }
    public WebElement getBodyTextB(){
        return myWebDriver.findElement(By.xpath("//*[contains(text(),'will be')]"));
    }
}
