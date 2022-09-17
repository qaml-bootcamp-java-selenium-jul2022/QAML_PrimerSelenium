package Steps;

import Pages.YouTubePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeSteps extends BaseSteps{

    public YouTubeSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }
    YouTubePage paginaYoTube = new YouTubePage(myWebDriver);
    public void escribirTextoSearchBox(String texto){
        WebElement searchBox = paginaYoTube.getYouTubeSearchBox();
        searchBox.sendKeys(texto);
    }


}
