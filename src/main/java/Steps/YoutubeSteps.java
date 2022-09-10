package Steps;

import Pages.YoutubePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeSteps extends BaseSteps{

    public YoutubeSteps(WebDriver webDriver) {
        super(webDriver);
    }

    YoutubePage paginaYoutube=new YoutubePage(myWebDriver);

    public void escribirTexboxSearchBox(String texto){
        WebElement searchBox= paginaYoutube.getYoutubeSearchBox();
        searchBox.sendKeys(texto);
    }
}
