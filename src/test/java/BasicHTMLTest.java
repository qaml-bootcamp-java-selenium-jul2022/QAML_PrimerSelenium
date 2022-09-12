import Steps.BasicHTMLSteps;
import org.testng.annotations.Test;

public class BasicHTMLTest extends BaseTest {

    BasicHTMLSteps basicHTMLSteps = new BasicHTMLSteps(myWebDriver);

    @Test
    public void basicHTML() {
        basicHTMLSteps.abrirURL("file:///C:/Users/elici/Desktop/basicHTML.html");
        basicHTMLSteps.escribirUsuario("elizabeth");
        basicHTMLSteps.escribirContrasena("Correa");
        basicHTMLSteps.login();
        basicHTMLSteps.quitarWebDriver();
    }
}
