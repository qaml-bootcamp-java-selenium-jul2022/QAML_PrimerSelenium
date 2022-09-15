import Pages.DemoQaPage;
import Steps.DemoQaSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQaTests extends BaseTest{
    DemoQaSteps demoQaSteps = new DemoQaSteps(myWebDriver);
    DemoQaPage demoQaPage = new DemoQaPage(myWebDriver);

    String URL = "https://demoqa.com/text-box/";

    @Test
    public void seleniumHandsOn1(){
        demoQaSteps.visitarPagina(URL);
        Assert.assertEquals(demoQaSteps.verifyUrl(URL),true);
        demoQaSteps.checkIfElementIsDisplayed(demoQaPage.getFullNameTextBox());
        demoQaSteps.checkIfElementIsDisplayed(demoQaPage.getEmailTextBox());
        demoQaSteps.checkIfElementIsDisplayed(demoQaPage.getCurrentAddressTextBox());
        demoQaSteps.checkIfElementIsDisplayed(demoQaPage.getPermanentAddressTextBox());
        demoQaSteps.checkIfElementIsEnabled(demoQaPage.getSubmitButton());
        demoQaSteps.cerrarNavegador();
    }

    @Test
    public void seleniumHandsOn2(){
        demoQaSteps.visitarPagina(URL);
        Assert.assertEquals(demoQaSteps.verifyUrl(URL),true);
        demoQaSteps.sendTextToElement(demoQaPage.getFullNameTextBox(),"Pedro Mendoza Coronado");
        demoQaSteps.sendTextToElement(demoQaPage.getEmailTextBox(),"pedromendoza@gmail.com");
        demoQaSteps.sendTextToElement(demoQaPage.getCurrentAddressTextBox(),"Santa Cruz Bolivia");
        demoQaSteps.sendTextToElement(demoQaPage.getPermanentAddressTextBox(),"Santa Cruz Bolivia");
        demoQaPage.getSubmitButton().click();
        demoQaSteps.cerrarNavegador();
    }


}
