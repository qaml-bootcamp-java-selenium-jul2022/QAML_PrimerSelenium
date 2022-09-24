import Steps.DemoQASteps2;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQATests2 extends BaseTest{

    DemoQASteps2 toolQASteps = new DemoQASteps2(myWebDriver);

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
        toolQASteps.hacerClickElementsSquare();
    }
    @Test
    public void requerimiento2(){
        toolQASteps.hacerClickTextBoxMenu();
    }
    @Test
    public void requerimiento3(){
        String urlActual = myWebDriver.getCurrentUrl();
        toolQASteps.ingresarNombreUsuario("luis");
        toolQASteps.ingresarCorreo("correo");
        toolQASteps.ingresarDireccionAcuatl("direccion actual");
        toolQASteps.ingresarDireccionPermanente("direccion permanente");
        toolQASteps.obtenerUbicacionUltimoElemento();
        toolQASteps.hacerClickSubmitBoton();
        Assert.assertEquals(urlActual,"https://demoqa.com/text-box");
    }

    @Test
    public void requerimiento4(){
        myWebDriver.navigate().refresh();
        String expectedName = "Jane Doe";
        String expectedEmail =  "janedoe@mail.com";
        String expectedCurrentAddress= "Test Av 2020, Los Angeles";
        String expectedPermanentAddress= "Test Av 2020, San Diego";

        toolQASteps.ingresarNombreUsuario("Jane Doe");
        toolQASteps.ingresarCorreo("janedoe@mail.com");
        toolQASteps.ingresarDireccionAcuatl("Test Av 2020, Los Angeles");
        toolQASteps.ingresarDireccionPermanente("Test Av 2020, San Diego");

        toolQASteps.obtenerUbicacionUltimoElemento();

        toolQASteps.hacerClickSubmitBoton();
        Assert.assertEquals("Jane Doe",expectedName);
        Assert.assertEquals("janedoe@mail.com",expectedEmail);
        Assert.assertEquals("Test Av 2020, Los Angeles",expectedCurrentAddress);
        Assert.assertEquals("Test Av 2020, San Diego",expectedPermanentAddress);

    }


}
