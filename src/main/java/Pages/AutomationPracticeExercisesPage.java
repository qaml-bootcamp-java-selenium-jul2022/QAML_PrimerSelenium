package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutomationPracticeExercisesPage extends BasePage {

    public AutomationPracticeExercisesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getWomenTab() {
        return myWebDriver.findElement(By.xpath("//a[@title='Women']"));
    }
    public WebElement getDressesTab() {
        return myWebDriver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='Dresses']"));
    }
    public WebElement getTshirtsTab() {
        return myWebDriver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='T-shirts']"));
    }
    public WebElement getCategoriesTab() {
        return myWebDriver.findElement(By.cssSelector("#block_top_menu > ul"));
    }

    public String getFirstTextFromWomenBanner(){
        return myWebDriver.findElement(By.xpath("//div[@id='center_column']//div[@class='rte']/p[contains(text(),'category')]")).getText();
    }
    public String getSecondTextFromWomenBanner(){
        return myWebDriver.findElement(By.xpath("//div[@id='center_column']//div[@class='rte']/p[contains(text(),'shoes')]")).getText();
    }
    public String getFirstTextFromDressesBanner(){
        return myWebDriver.findElement(By.xpath("//div[@id='center_column']//div[@class='rte']/p[contains(text(),'Find')]")).getText();
    }
    public String getSecondTextFromDressesBanner(){
        return myWebDriver.findElement(By.xpath("//div[@id='center_column']//div[@class='rte']/p[contains(text(),'We offer dresses')]")).getText();
    }
    public String getTshirtsBanner(){
        return myWebDriver.findElement(By.xpath("//div[@id='center_column']/div[1]")).getText();
    }
    public List<WebElement> getProductListResult(){
        return myWebDriver.findElements(By.xpath("//div[@id='center_column']/ul[@class='product_list grid row']/li"));
    }




}
