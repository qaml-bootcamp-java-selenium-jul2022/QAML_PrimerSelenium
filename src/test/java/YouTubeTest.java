import Steps.PrimerSteps;
import Steps.YouTubeSteps;
import org.testng.annotations.Test;

public class YouTubeTest extends BaseTest{

    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    YouTubeSteps youTubeSteps = new YouTubeSteps(myWebDriver);

    @Test
    public void mandarTextoSearchBox() {
        youTubeSteps.abrirURL("https://www.youtube.com/");
        youTubeSteps.escribirTextoSearchBox("qa minds lab");
        youTubeSteps.quitarWebDriver();
    }
}
