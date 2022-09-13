package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubePages extends BasePage {

    public YouTubePages(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getYouTubeSearchBox() {
        return myWebdriver.findElement(By.name("search_query"));

    }
    public WebElement clickEnter(){
         return myWebdriver.findElement(By.id("search-icon-legacy"));

    }
}