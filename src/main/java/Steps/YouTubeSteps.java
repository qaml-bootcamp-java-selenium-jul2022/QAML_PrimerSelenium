package Steps;

import Pages.YouTubePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeSteps extends BaseSteps{
    public YouTubeSteps(WebDriver webDriver) {
        super(webDriver);
    }

    YouTubePage paginaYouTube = new YouTubePage(myWebDriver);

    public void escribirTextoSearchBox(String texto) {
        WebElement searchBox = paginaYouTube.getYouTubeSearchBox();
        searchBox.sendKeys(texto);
    }

    public void elSearchBoxIsDisplayed(){

    }
}
