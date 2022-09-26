import Steps.PrimerSteps;
import Steps.YouTubeSteps;
import org.testng.annotations.Test;

public class YouTubeTest extends BaseTest{

    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);
    YouTubeSteps youTubeSteps = new YouTubeSteps(myWebDriver);

    @Test
    public void mandarTextoSearch(){
        youTubeSteps.abrirURL("https://www.youtube.com");
        youTubeSteps.escribirTextoSearch("Los Bunkers");
        youTubeSteps.enter();
        //youTubeSteps.cerrarNavegador();
    }
}
