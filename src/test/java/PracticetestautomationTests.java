import Steps.PracticetestautomationSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticetestautomationTests extends BaseTest{

    PracticetestautomationSteps practicetestautomationSteps=new PracticetestautomationSteps(myWebDriver);

   @Test
    public void PositiveLogIntest (){
        practicetestautomationSteps.abrirURL("https://practicetestautomation.com/practice-test-login/");
        practicetestautomationSteps.ingresarUsername("student");
        practicetestautomationSteps.ingresarPassword("Password123");
        practicetestautomationSteps.clickEnBotonSumit();
        Assert.assertEquals(practicetestautomationSteps.obtenerURLPagina("logged-in-successfully/"), true);
        Assert.assertEquals(practicetestautomationSteps.MessageLogInSuccessfull("Logged In Successfully"),true);
        Assert.assertTrue(practicetestautomationSteps.isButtonLogoutDisplayed(),"El boton no se esta mostrando");
        practicetestautomationSteps.cerrarNavegador();
    }

    @Test
    public void NegativeUsernameTest (){
        practicetestautomationSteps.abrirURL("https://practicetestautomation.com/practice-test-login/");
        practicetestautomationSteps.ingresarUsername("incorrectUser");
        practicetestautomationSteps.ingresarPassword("Password123");
        practicetestautomationSteps.clickEnBotonSumit();
        Assert.assertEquals(practicetestautomationSteps.isErrorMessageDisplayed(),true);
        Assert.assertEquals(practicetestautomationSteps.isErrorMessageCorrect("Your username is invalid!"),true);
        practicetestautomationSteps.cerrarNavegador();
    }

    @Test
    public void NegativePasswordTest (){
        practicetestautomationSteps.abrirURL("https://practicetestautomation.com/practice-test-login/");
        practicetestautomationSteps.ingresarUsername("student");
        practicetestautomationSteps.ingresarPassword("incorrectPassword");
        practicetestautomationSteps.clickEnBotonSumit();
        Assert.assertEquals(practicetestautomationSteps.isErrorMessageDisplayed(),true);
        Assert.assertEquals(practicetestautomationSteps.isErrorMessageCorrect("Your password is invalid!"),true);
        practicetestautomationSteps.cerrarNavegador();
    }
}
