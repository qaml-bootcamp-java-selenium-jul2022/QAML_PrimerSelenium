import Pages.BasePage;
import Steps.ToolsQASteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolQAtest extends BaseTest {

    ToolsQASteps toolsQASteps=new ToolsQASteps(myWebDriver);

    @BeforeTest
    public void beforeTest(){
        myWebDriver.get("https://demoqa.com/select-menu");
        myWebDriver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        myWebDriver.quit();
    }

    @Test
    public void seleccionadorDeColores(){
    toolsQASteps.seleccionarColor("violet");
    }

    @Test
    public void SeleccionarElementos(){
        toolsQASteps.obtenerListaElementos();
    }

    @Test
    public void esMultiple(){
        Assert.assertEquals(toolsQASteps.listaEsMultiple(),false);
    }

    @Test
    public void primerValorSeleccionado(){
        toolsQASteps.primerValor();
    }

    @Test
    public void seleccionarIndiceCero(){
        toolsQASteps.seleccionarIndice0();
    }

}
