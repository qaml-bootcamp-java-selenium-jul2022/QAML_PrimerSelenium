package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubePage extends BasePage{
    public YouTubePage(WebDriver webDriver){
        super(webDriver);
    }

    public WebElement getYouTubeSearchBox(){
        return myWebDriver.findElement(By.name("search_query"));
    }
}
