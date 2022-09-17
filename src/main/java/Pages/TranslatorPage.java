package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TranslatorPage extends BasePage {
    public TranslatorPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getTranslatorText(){
        return myWebDriver.findElement(By.xpath("//*[@id=\'yDmH0d\']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea"));
    }

    public WebElement getAltavozButton(){
        return myWebDriver.findElement(By.xpath("//*[@id=\'ow87\']/div/span/button"));
    }
}
