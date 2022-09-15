package Steps;

import Pages.YouTubePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeSteps extends BaseSteps{
    public YouTubeSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    YouTubePage paginaYouTube = new YouTubePage(myWebDriver);

    public void sendTextToElement (String texto){
        WebElement searchBox = paginaYouTube.getYouTubeSearchBox();
        searchBox.sendKeys(texto);
        WebElement searchButton = paginaYouTube.getYouTubeSearchButton();
        searchButton.click();
    }
}
