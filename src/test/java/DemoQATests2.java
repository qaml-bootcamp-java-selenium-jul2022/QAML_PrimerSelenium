import Steps.DemoQASteps2;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQATests2 extends BaseTest{

    DemoQASteps2 demoQASteps2 = new DemoQASteps2(myWebDriver);

    @BeforeTest
    public void abrirUrl() {
        myWebDriver.get("https://demoqa.com/");
        myWebDriver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        myWebDriver.quit();
    }

    @Test
    public void requerimiento1(){
        demoQASteps2.hacerClickElementsSquare();
        Assert.assertTrue(demoQASteps2.verificarTextBoxButtonVisible());
    }
    @Test
    public void requerimiento2(){
        demoQASteps2.hacerClickTextBoxMenu();
        Assert.assertTrue(demoQASteps2.verificarFormularioVisible());
    }
    @Test
    public void requerimiento3(){
        String urlActual = myWebDriver.getCurrentUrl();
        demoQASteps2.ingresarNombreUsuario("luis");
        demoQASteps2.ingresarCorreo("correo");
        demoQASteps2.ingresarDireccionAcuatl("direccion actual");
        demoQASteps2.ingresarDireccionPermanente("direccion permanente");

        demoQASteps2.obtenerUbicacionUltimoElemento();
        demoQASteps2.hacerClickSubmitBoton();

        Boolean emailValido = demoQASteps2.obtenerEmailClassAttribute();

        Assert.assertTrue(emailValido);
    }

    @Test
    public void requerimiento4(){
        myWebDriver.navigate().refresh();

        demoQASteps2.ingresarNombreUsuario("Jane Doe");
        demoQASteps2.ingresarCorreo("janedoe@mail.com");
        demoQASteps2.ingresarDireccionAcuatl("Test Av 2020, Los Angeles");
        demoQASteps2.ingresarDireccionPermanente("Test Av 2020, San Diego");

        demoQASteps2.obtenerUbicacionUltimoElemento();
        demoQASteps2.hacerClickSubmitBoton();

        Assert.assertTrue(demoQASteps2.obternerNombreCompletoResultado());
        Assert.assertTrue(demoQASteps2.obtenerCorreoResultado());
        Assert.assertTrue(demoQASteps2.obtenerDireccionActualResultado());
        Assert.assertTrue(demoQASteps2.obtenerDireccionPermanenteResultado());

    }


}
