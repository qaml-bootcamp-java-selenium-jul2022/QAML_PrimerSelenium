package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver myWebDriver;

    public BasePage(WebDriver webDriver) {
        myWebDriver = webDriver;
    }
}
