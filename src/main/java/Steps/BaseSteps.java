package Steps;

import org.openqa.selenium.WebDriver;

public class BaseSteps {
    public WebDriver myWebDriver;

    public BaseSteps(WebDriver myWebDriverDeTests){
        myWebDriver = myWebDriverDeTests;
    }
}
