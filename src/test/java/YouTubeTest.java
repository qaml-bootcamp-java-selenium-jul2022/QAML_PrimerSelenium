import Steps.YouTubeSteps;
import org.testng.annotations.Test;

public class YouTubeTest extends BaseTest {

    YouTubeSteps youTubeSteps = new YouTubeSteps(myWebDriver);

    @Test
    public void mandarTextoSearchBox() {
        youTubeSteps.abrirYouTube();
        youTubeSteps.escribirTextoSearchBox("qa minds lab");
        youTubeSteps.cerrarNavegador();
    }
}
