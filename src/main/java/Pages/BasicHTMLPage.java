package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicHTMLPage extends BasePage {
    public BasicHTMLPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement escribirUsuario() {
        return myWebDriver.findElement(By.id("username"));
    }

    public WebElement escribirContrasena() {
        return myWebDriver.findElement(By.id("password"));
    }

    public WebElement login() {
        return myWebDriver.findElement(By.name("login"));
    }
}
