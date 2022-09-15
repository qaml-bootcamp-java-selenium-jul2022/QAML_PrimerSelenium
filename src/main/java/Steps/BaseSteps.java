package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseSteps {
    public WebDriver myWebDriver;
    public BaseSteps (WebDriver webDriver) {
        myWebDriver = webDriver;
    }

    public void clickElement(WebElement webElement){
        System.out.println("clicking element");
        webElement.click();
    }
}
