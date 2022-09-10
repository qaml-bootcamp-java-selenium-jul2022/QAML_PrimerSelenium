package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubePage extends BasePage{

    public YoutubePage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getYoutubeSearchBox(){
        return myWebDriver.findElement(By.name("search_query"));
    }
}
