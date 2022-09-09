import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Steps.*;

public class PrimerTest extends BaseTest{

    PrimerSteps primerSteps=new PrimerSteps(myWebDriver);

    @BeforeTest
    public void antesDelaPrueba(){
        System.out.println("Método Before (Antes) Test");
        primerSteps.abrirURLPagina();
    }

    @Test
    public void obtenerUrl(){
        String  expectedURL= "https://www.google.com/";
        primerSteps.obtenerURLPagina();
        Assert.assertEquals(myWebDriver.getCurrentUrl(),expectedURL);

    }
    @Test
    public void obtenerTituloPagina(){
        String expectedTitle="Google";
        primerSteps.obtenerTituloPaginaAbierta();
        Assert.assertEquals(myWebDriver.getTitle(),expectedTitle);
    }

    @AfterTest
    public void despuesDelaPrueba(){
        System.out.println("Método después de la prueba");
        primerSteps.cerrarPagina();
    }

}
