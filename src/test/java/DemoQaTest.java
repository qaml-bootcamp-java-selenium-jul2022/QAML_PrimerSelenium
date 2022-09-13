import Steps.DemoQaSteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class DemoQaTest extends BaseTest {

    DemoQaSteps demoQaSteps = new DemoQaSteps(myWebDriver);

    private static final String URL = "https://demoqa.com/text-box/";

    @BeforeTest
    public void setUp(){
        demoQaSteps.abrirURL(URL);
    }

    @AfterTest
    public  void tearDown(){
        demoQaSteps.quitarWebDriver();
    }

    @Test
    public void verificarLaUrl(){
        demoQaSteps.obtenerUrlActual();
    }

    @Test
    public void verificarFullNameTextBox(){
        demoQaSteps.verificandoFullNameTextBox();
    }

    @Test
    public  void verificarEmailTextBox(){
        demoQaSteps.verificandoEmailTextBox();
    }

    @Test
    public void verificarCurrentAddressTextBox(){
        demoQaSteps.verificandoCurrentAddressTextBox();
    }

    @Test
    public void verificarPermanentAddressTextBox(){
        demoQaSteps.verificandoPermanentAddressTextBox();
    }

    @Test
    public void verificarSubmitButton(){
        demoQaSteps.verificandoElBotonDeSubmit();
    }

}
