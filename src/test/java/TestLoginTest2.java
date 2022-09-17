import Steps.TetsLoginSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginTest2 extends BaseTest{
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
        tetsLoginSteps.escribirUsuario("usuario1");
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
    public void verificarMesajeErrorIsDisplay(){
        boolean expectedResult = true;
        Assert.assertEquals(tetsLoginSteps.verificarMensajeDeErrorIsDisplayed(),expectedResult);
    }
    @Test
    public void verificarMensajeError(){
        String expectedMessage = "Your username is invalid!";
        Assert.assertEquals(tetsLoginSteps.obtenerMensajeDeError(),expectedMessage);

    }
}
