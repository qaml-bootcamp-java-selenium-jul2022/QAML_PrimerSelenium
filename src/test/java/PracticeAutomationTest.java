import Steps.PracticeAutomationSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeAutomationTest extends BaseTest{

    PracticeAutomationSteps PASteps = new PracticeAutomationSteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba(){
        PASteps.abrirURL("https://practicetestautomation.com/practice-test-login/");
    }

    @Test (priority = 1)
    public void enviarLoginCasoPositivo(){
        PASteps.enviarUsuario("student");
        PASteps.enviarContraseña("Password123");
        PASteps.clickSubmit();

        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        String actualURL = PASteps.verificarURL();
        Assert.assertEquals(expectedURL,actualURL);
        String expectedMessage = "Logged In Successfully";
        String actualMessage = PASteps.verificarMensaje();
        Assert.assertEquals(expectedMessage,actualMessage);
        PASteps.verificarBotonLogOut();


    }

    @Test (priority = 2)
    public void verificarLoginCasoNegativoUsernameIncorrecto(){
        PASteps.enviarUsuario("incorrectUser");
        PASteps.enviarContraseña("Password123");
        PASteps.clickSubmit();

        String expectedErrorMessage = "Your username is invalid!";
        String actualErrorMessage = PASteps.verificarMensajeError();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }
    @Test (priority = 3)
    public void verificarLoginCasoNegativoPasswordIncorrecto(){
        PASteps.enviarUsuario("student");
        PASteps.enviarContraseña("incorrectPassword");
        PASteps.clickSubmit();

        String expectedErrorMessage = "Your password is invalid!";
        String actualErrorMessage = PASteps.verificarMensajeError();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }


    @AfterTest
    public void finalDeLaPrueba(){
        PASteps.myWebDriver.quit();
    }
}