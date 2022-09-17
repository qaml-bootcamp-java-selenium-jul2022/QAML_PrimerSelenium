import Steps.TetsLoginSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginTest3 extends BaseTest{
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
        tetsLoginSteps.escribirPassword("pass");
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
        String expectedMessage = "Your password is invalid!";
        Assert.assertEquals(tetsLoginSteps.obtenerMensajeDeError(),expectedMessage);
    }
}
