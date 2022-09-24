import Steps.ToolsQASteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolsQATests extends BaseTest {

    ToolsQASteps toolsQASteps = new ToolsQASteps (myWebDriver);

    @BeforeTest
    public void beforeTest(){
        myWebDriver.get("https://demoqa.com/select-menu");
        myWebDriver.manage().window().maximize();
    }

    @Test
    public void seleccionarColorVoilet(){
        toolsQASteps.seleccionarColor("Voilet");
    }

    @Test
    public void seleccionarElementosDeSelect(){
        toolsQASteps.obtenerListaElementos();
    }

    @Test
    public void esMultiple(){
        Assert.assertEquals(toolsQASteps.listaEsMultiple(),false);
    }

    @Test
    public void primerValorSeleccionado(){
        toolsQASteps.seleccionarPrimerValor();
    }

    @Test
    public void seleccionarIndice0(){
        toolsQASteps.seleccionarIndice0();
    }

    @AfterTest
    public void tearDown(){
        myWebDriver.quit();
    }

}
