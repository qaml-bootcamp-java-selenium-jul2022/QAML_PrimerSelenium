import Steps.PrimerSteps;
import Steps.TranslatorSteps;
import org.testng.annotations.Test;

public class TranslatorTests extends BaseTest{
    PrimerSteps ps = new PrimerSteps(myWebDriver);
    TranslatorSteps tp = new TranslatorSteps(myWebDriver);

    @Test
    public void mandarTextoTextArea(){
        ps.abrirurlnueva("https://translate.google.com/");
        tp.escribirPalabraParaTraducir("hello");
    }
    @Test
    public void escucharPalabraEscrita() throws InterruptedException {
        myWebDriver.wait(2000);
        tp.escucharPronunciacionPalabra();
    }
}
