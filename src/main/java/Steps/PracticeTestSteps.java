package Steps;

import Pages.PracticeTestPage;
import org.openqa.selenium.WebDriver;

public class PracticeTestSteps extends BaseSteps{
    public PracticeTestSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    PracticeTestPage practiceTestPage = new PracticeTestPage(myWebDriver);
}
