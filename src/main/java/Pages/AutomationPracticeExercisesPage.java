package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticeExercisesPage extends BasePage {

    public AutomationPracticeExercisesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement womenTab() {
        return myWebDriver.findElement(By.xpath("//a[@title='Dresses']"));
    }
    public WebElement dressesTab() {
        return myWebDriver.findElement(By.xpath("//a[@title='Dresses']"));
    }
    public WebElement tshirtsTab() {
        return myWebDriver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
    }

}
