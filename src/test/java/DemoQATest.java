import Steps.DemoQASteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQATest extends BaseTest{

    DemoQASteps demoQASteps = new DemoQASteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba(){
        demoQASteps.abrirURL("https://demoqa.com/text-box");
    }

    @Test
    public void enviarDatosPersonales(){
        demoQASteps.enviarNombreCompleto("miguel nunez");
        demoQASteps.enviarCorreo("pruebasselenium@hotmail.com");
        demoQASteps.enviarDireccionActual("calle abcd #123 ");
        demoQASteps.enviarDireccionPermanente("conocida");
    }

    @AfterTest
    public void despuesDeLaPrueba(){
        demoQASteps.myWebDriver.quit();
    }
}
