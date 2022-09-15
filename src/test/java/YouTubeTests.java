import Pages.YouTubePage;
import Steps.PrimerStep;
import Steps.YouTubeSteps;
import org.testng.annotations.Test;

public class YouTubeTests extends BaseTest{
    PrimerStep primerStep = new PrimerStep(myWebDriver);
    YouTubeSteps youTubeSteps = new YouTubeSteps(myWebDriver);

    @Test
    public void sendKeysToElement(){
        primerStep.visitarPagina("https://www.youtube.com/");
        youTubeSteps.sendTextToElement("hola");
        //primerStep.cerrarNavegador();
    }
}
