import Steps.PracticeAutomationSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeAutomationTest extends BaseTest {

    PracticeAutomationSteps practiceAutomationSteps = new PracticeAutomationSteps(myWebDriver);


    @BeforeTest
    public void beforeTest()
    {
        practiceAutomationSteps.abrirURL("https://practicetestautomation.com/practice-test-login/");
        myWebDriver.manage().window().maximize();
    }

    @Test
    public void positiveLogIntest(){
        practiceAutomationSteps.ingresarUsuario("student");
        practiceAutomationSteps.ingresarcontrasena("Password123");
        practiceAutomationSteps.btnSubmit();
        Assert.assertEquals(practiceAutomationSteps.imprimirURLActual(),"https://practicetestautomation.com/logged-in-successfully/");
        Assert.assertEquals(practiceAutomationSteps.getTextLoginSuccessfull(),"Logged In Successfully");
        practiceAutomationSteps.btnLogout();
    }

    @Test
    public void negativeusernameTest(){
        practiceAutomationSteps.ingresarUsuario("incorrectUser");
        practiceAutomationSteps.ingresarcontrasena("Password123");
        practiceAutomationSteps.btnSubmit();
        practiceAutomationSteps.isDisplayedTextError();
        Assert.assertEquals(practiceAutomationSteps.getTxtError(),"Your username is invalid!");
    }

    @Test
    public void negativePasswordTest(){
        practiceAutomationSteps.ingresarUsuario("student");
        practiceAutomationSteps.ingresarcontrasena("incorrectPassword");
        practiceAutomationSteps.btnSubmit();
        practiceAutomationSteps.isDisplayedTextError();
        Assert.assertEquals(practiceAutomationSteps.getTxtError(),"Your password is invalid!");
    }

    @AfterTest
    public void afterTest()
    {
        practiceAutomationSteps.quitarWebDriver();
    }
}