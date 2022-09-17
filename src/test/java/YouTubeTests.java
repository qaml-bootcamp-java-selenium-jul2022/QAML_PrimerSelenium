import Steps.PrimerSteps;
import Steps.YouTubeSteps;
import org.testng.annotations.Test;

public class YouTubeTests extends BaseTest {
    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);
    YouTubeSteps youTubeSteps = new YouTubeSteps(myWebDriver);

    @Test
    public void mandarTextoSearchBox(){
        primerSteps.abrirurlnueva("https://www.youtube.com/");
        youTubeSteps.escribirTextoSearchBox("qa minds lab");
    }

}
