package Steps;

<<<<<<< HEAD
import Pages.YouTubePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeSteps extends BaseSteps{
=======
import Pages.YouTubePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeSteps extends BaseSteps {

>>>>>>> LuisGerardo
    public YouTubeSteps(WebDriver webDriver) {
        super(webDriver);
    }

<<<<<<< HEAD
    YouTubePage paginaYouTube = new YouTubePage(myWebDriver);

    public void escribirTextoSearchBox(String texto) {
        WebElement searchBox = paginaYouTube.getYouTubeSearchBox();
        searchBox.sendKeys(texto);
    }

=======
    YouTubePages paginaYouTube = new YouTubePages(myWebDriver);

    public void escribirTextoSearch(String texto) {
        WebElement searchBox = paginaYouTube.getYouTubeSearchBox();
        searchBox.sendKeys(texto);
    }
    public void abrirURL(String url) {
        myWebDriver.get(url);

    }

    public void cerrarNavegador(){
        myWebDriver.close();
    }

    public void enter(){
        WebElement buttonEnter = paginaYouTube.clickEnter();
        buttonEnter.click();

    }
>>>>>>> LuisGerardo
}
