import Pages.TestLoginPage;
import Steps.PrimerSteps;
import Steps.TetsLoginSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestLoginTests extends BaseTest {
/*Equipo:
Monsse
Susana
Luis Bravo*/
TetsLoginSteps tetsLoginSteps = new TetsLoginSteps(myWebDriver);


    @BeforeTest
    public void abrirUrl() {
        myWebDriver.get("http://practicetestautomation.com/practice-test-login/");
    }
    @Test
    public void escribirUsuario() {
        tetsLoginSteps.escribirUsuario("student");
    }
    @Test
    public void escribirPassword() {
        tetsLoginSteps.escribirPassword("Password123");
    }

    @Test
    public void hacerClickBoton(){
        tetsLoginSteps.hacerClickBoton();
    }

    @Test
    public void verificarUrlSuccess(){
        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        //System.out.println("La url abierta es: "+myWebDriver.getCurrentUrl());
        Assert.assertEquals(tetsLoginSteps.imprimirURLActual(),expectedURL);
    }

    @Test
    public void verificarTexto(){
        String expectedText = "Congratulations student. You successfully logged in!";
        Assert.assertEquals(tetsLoginSteps.obtenerContenedor(),expectedText);
    }

    @Test
    public void verificarZSeMuestraBoton(){
        boolean expectedResult = true;
        Assert.assertEquals(tetsLoginSteps.verificarButtonIsDisplayed(),expectedResult);
    }
}
