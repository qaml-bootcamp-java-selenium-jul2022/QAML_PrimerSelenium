package Steps;

import Pages.DemoQaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DemoQaSteps extends BaseSteps{
    public DemoQaSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    DemoQaPage demoQaPage = new DemoQaPage(myWebDriver);


}
