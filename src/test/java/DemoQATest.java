import Steps.DemoQASteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQATest extends BaseTest{

    DemoQASteps demoQASteps = new DemoQASteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba(){
        demoQASteps.abrirURL("https://demoqa.com/");
    }

    /*@Test
    public void enviarDatosPersonales(){
        demoQASteps.clickElements();
        demoQASteps.enviarNombreCompleto("miguel nunez");
        demoQASteps.enviarCorreo("pruebasselenium@hotmail.com");
        demoQASteps.enviarDireccionActual("calle abcd #123 ");
        demoQASteps.enviarDireccionPermanente("conocida");
    }*/

    @Test
    public void requerimiento1(){
        demoQASteps.clickElements();

        Assert.assertEquals(demoQASteps.textBoxIsDisplayed(),true);
    }

    @Test
    public void requerimiento2(){

        demoQASteps.clickTextBoxOption();
        Assert.assertEquals(demoQASteps.enviarNombreCompletoisDisplayed(),true);
        Assert.assertEquals(demoQASteps.enviarCorreoIsDisplayed(),true);
        Assert.assertEquals(demoQASteps.enviarDireccionActualIsDisplayed(),true);
        Assert.assertEquals(demoQASteps.enviarDireccionPermanenteIsDisplayed(),true);
        Assert.assertEquals(demoQASteps.submitButtonIsDisplayed(),true);
    }
    @Test
    public void requerimiento3(){
        demoQASteps.enviarNombreCompleto("test1");
        demoQASteps.enviarCorreo("asdasd");
        demoQASteps.enviarDireccionActual("alkjsdblhbakjsdb test2");
        demoQASteps.enviarDireccionPermanente("dir permanente");
        demoQASteps.clickSubmitButton();
        Assert.assertEquals(demoQASteps.outputFormIsDisplayed(),false);
    }

    @Test
    public void requerimiento4(){
        demoQASteps.enviarNombreCompleto("test1");
        demoQASteps.enviarCorreo("asdada@test.com");
        demoQASteps.enviarDireccionActual("alkjsdblhbakjsdb test2");
        demoQASteps.enviarDireccionPermanente("dir permanente");

        demoQASteps.clickSubmitButton();
        Assert.assertEquals(demoQASteps.outputFormIsDisplayed(),true);
    }
    @AfterTest
    public void despuesDeLaPrueba(){
        demoQASteps.myWebDriver.quit();
    }
}
