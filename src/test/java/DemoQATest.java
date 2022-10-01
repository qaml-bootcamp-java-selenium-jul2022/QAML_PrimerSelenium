import Steps.DemoQASteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQATest extends BaseTest {

    DemoQASteps demoqa = new DemoQASteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba(){
        demoqa.abrirURL("https://demoqa.com/");
    }
    @Test(description = "Send keys in DemoQA page")
    public void sendkeysDemoQA(){
        String fullName = "Gilberto Lizarraga";
        String email = "gilberto.lizbar@gmail.com";
        String currentAddress = "123 st";
        String permanentAddress ="1789 st";
        demoqa.openURL();
        Assert.assertEquals(demoqa.getActualURL(),
                "https://demoqa.com/text-box/");
        demoqa.inputFullName(fullName);
        demoqa.inputEmail(email);
        demoqa.inputCurrentAddress(currentAddress);
        demoqa.inputPermanentAddress(permanentAddress);
        /*the next elements are not visible on the page and need to make an scroll
        for now  scrolled page manually and added a break point to test in click submit step*/
        demoqa.clickSubmitButton();
        Assert.assertTrue(demoqa.isNameOutPutDisplayed()==true);
        Assert.assertTrue(demoqa.isEmailOutPutDisplayed()==true);
        Assert.assertTrue(demoqa.isCurrentAddressOutPutDisplayed()==true);
        Assert.assertTrue(demoqa.isPermanentAddressOutPutDisplayed()==true);
        Assert.assertTrue(demoqa.getNameOutPutText().contains(fullName));
        Assert.assertTrue(demoqa.getEmailOutPutText().contains(email));
        Assert.assertTrue(demoqa.getCurrentAddressOutText().contains(currentAddress));
        Assert.assertTrue(demoqa.getPermanentAddressOutText().contains(permanentAddress));

    }

    @Test
    public void requerimiento1(){
        demoqa.clickElements();

        Assert.assertEquals(demoqa.textBoxIsDisplayed(),true);
    }

    @Test
    public void requerimiento2(){

        demoqa.clickTextBoxOption();
        Assert.assertEquals(demoqa.enviarNombreCompletoisDisplayed(),true);
        Assert.assertEquals(demoqa.enviarCorreoIsDisplayed(),true);
        Assert.assertEquals(demoqa.enviarDireccionActualIsDisplayed(),true);
        Assert.assertEquals(demoqa.enviarDireccionPermanenteIsDisplayed(),true);
        Assert.assertEquals(demoqa.submitButtonIsDisplayed(),true);
    }
    @Test
    public void requerimiento3(){
        demoqa.enviarNombreCompleto("test1");
        demoqa.enviarCorreo("asdasd");
        demoqa.enviarDireccionActual("alkjsdblhbakjsdb test2");
        demoqa.enviarDireccionPermanente("dir permanente");
        demoqa.clickSubmitButton();
        Assert.assertEquals(demoqa.outputFormIsDisplayed(),false);
    }

    @Test
    public void requerimiento4(){
        demoqa.enviarNombreCompleto("test1");
        demoqa.enviarCorreo("asdada@test.com");
        demoqa.enviarDireccionActual("alkjsdblhbakjsdb test2");
        demoqa.enviarDireccionPermanente("dir permanente");

        demoqa.clickSubmitButton();
        Assert.assertEquals(demoqa.outputFormIsDisplayed(),true);
    }

    @AfterTest
    public void despuesDeLaPrueba(){

        System.out.println("Close Test ");
        myWebDriver.quit();
    }

}
