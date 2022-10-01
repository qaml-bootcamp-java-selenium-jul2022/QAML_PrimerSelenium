package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoverPage extends BasePage{
    public HoverPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getHoverElement(){
        return myWebDriver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img"));
    }

    public WebElement getButtonElement(){
        return myWebDriver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]"));
    }
}
