package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticeExercisesPage extends BasePage {

    public AutomationPracticeExercisesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement fullNameTextField() {
        return myWebDriver.findElement(By.id("userName"));
    }

}
