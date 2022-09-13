import Steps.MyFirstWebSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstWebTest extends BaseTest{
    MyFirstWebSteps myFirstWebSteps = new MyFirstWebSteps(myWebDriver);
    private static final String URL = "C:\\Users\\allem\\OneDrive\\Escritorio\\SeleniumWebDriver\\basicHTML.html";

    @BeforeTest
    public void setup() {
        myFirstWebSteps.abrirURL(URL);
    }

    @AfterTest
    public void teardown() {
        myFirstWebSteps.quitarWebDriver();
    }

    @Test
    public void mandarNombreaInputName() {
        myFirstWebSteps.escribirNombreEnInputName("Monsse");
    }

    @Test
    public void mandarPaswordAInputPassword(){
        myFirstWebSteps.escribirPasswordEnInputPassword("estaEsMiPassword");
    }

    @Test
    public void darClickAlBotonDeLoging(){
        myFirstWebSteps.darClickAlBotonDeLogin();
    }

}
