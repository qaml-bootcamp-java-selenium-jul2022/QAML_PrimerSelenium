import Pages.DemoQAPage;
import Steps.DemoQASteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQATest extends BaseTest
{

DemoQASteps demoQASteps = new DemoQASteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba() {
        System.out.println("Método Before (Antes) Test");
        demoQASteps.abrirURL("https://demoqa.com/text-box");
    }
    @Test
    public void enviarDatosPersonales (){
        demoQASteps.enviarNombreCompleto("Luis Gerardo Muñoz Ortega");
        demoQASteps.enviarCorreo("luisgerardomzo@gmail.com");
        demoQASteps.enviarDireccionActual("CDMX");
        demoQASteps.enviarDireccionPermanente("OTRA 1234");
    }
    @AfterTest
    public void despuesDeLaPrueba (){
        demoQASteps.myWebDriver.quit();

}

}
