import Steps.BasicHtmlSteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicHtmlTest extends BaseTest{

    BasicHtmlSteps basicHtmlSteps = new BasicHtmlSteps(myWebDriver);

    String propertiesFileNameLocalConfig = "qaml_primerselenium_local.properties";
    String BasicHtmlPath = getProperty(propertiesFileNameLocalConfig, "BASIC_HTML_PATH");

    @BeforeTest
    public void antesDeLaPrueba() {
        System.out.println("Método Before (Antes) Test");
        basicHtmlSteps.abrirURL(BasicHtmlPath);
    }

    @AfterTest
    public void afterSuite() {
        basicHtmlSteps.quitarWebDriver();
    }

    @Test
    public void SubmitUser(){
        basicHtmlSteps.sendUsername("judlizzy");
        basicHtmlSteps.sendPassword("password123");
        basicHtmlSteps.clickButton();
    }
}
