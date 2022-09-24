import Steps.ToolsQASteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolsQATests extends BaseTest{

    ToolsQASteps toolsQASteps = new ToolsQASteps(myWebDriver);

    @BeforeTest
    public void beforeTest(){
        toolsQASteps.visitarPagina("http://demoqa.com/select-menu");
        myWebDriver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        toolsQASteps.cerrarNavegador();
    }

    @Test
    public void seleccionarColorVilet(){
        toolsQASteps.seleccionarColor("Voilet");
    }

    @Test
    public void printAllOptions(){
        System.out.println(toolsQASteps.getAllSelectOptions().size());
        var listaColores = toolsQASteps.getAllSelectOptions();
        for (int i = 0; i < toolsQASteps.getAllSelectOptions().size(); i++) {
            System.out.println(listaColores.get(i).getText());
        }
    }

    @Test
    public void isMultiple(){
        System.out.println("Multiple: "+toolsQASteps.isMultiple());
    }

    @Test
    public void obtenerPrimerElemento(){
        System.out.println(toolsQASteps.obtenerPrimerElementoSeleccionado().getText());
    }

    @Test
    public void inprimirIndex0(){
        var listaColores = toolsQASteps.getAllSelectOptions();
        System.out.println(listaColores.get(0).getText());
    }

    @Test
    public void imprimirOpcionPorValor() {
        toolsQASteps.obtenerOpcionPorValor("5");
    }

}
