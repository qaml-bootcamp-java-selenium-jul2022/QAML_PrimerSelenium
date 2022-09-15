package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubePage extends BasePage{
    public YouTubePage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getYouTubeSearchBox(){
        return myWebDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
    }

    public WebElement getYouTubeSearchButton(){
        return myWebDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button"));
    }
}
