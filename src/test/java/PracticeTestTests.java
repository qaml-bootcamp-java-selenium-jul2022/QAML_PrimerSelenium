import Pages.PracticeTestPage;
import Steps.PracticeTestSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTestTests extends BaseTest{

    PracticeTestPage practiceTestPage = new PracticeTestPage(myWebDriver);
    PracticeTestSteps practiceTestSteps = new PracticeTestSteps(myWebDriver);

    String baseURL = "https://practicetestautomation.com";

    @Test//TEST CASE 1
    public void seleniumHandsOn3(){
        practiceTestSteps.visitarPagina(baseURL+"/practice-test-login/");
        practiceTestSteps.sendTextToElement(practiceTestPage.getUserNameTextBox(),"student");
        practiceTestSteps.sendTextToElement(practiceTestPage.getPasswordTextBox(),"Password123");
        practiceTestPage.getSubmitButton().click();
        Assert.assertEquals(practiceTestSteps.verifyUrl(baseURL+"/logged-in-successfully/"),true);
        Assert.assertEquals(practiceTestPage.getLoggedInMessage().getText(),"Logged In Successfully");
        practiceTestSteps.checkIfElementIsDisplayed(practiceTestPage.getLoggedOutButton());
        practiceTestSteps.cerrarNavegador();
    }

    @Test//TEST CASE 2
    public void seleniumHandsOn4(){
        practiceTestSteps.visitarPagina(baseURL+"/practice-test-login/");
        practiceTestSteps.sendTextToElement(practiceTestPage.getUserNameTextBox(),"incorrectUser");
        practiceTestSteps.sendTextToElement(practiceTestPage.getPasswordTextBox(),"Password123");
        practiceTestPage.getSubmitButton().click();
        practiceTestSteps.checkIfElementIsDisplayed(practiceTestPage.getErrorMessage());
        Assert.assertEquals(practiceTestPage.getErrorMessage().getText(),"Your username is invalid!");
        practiceTestSteps.cerrarNavegador();
    }

    @Test//TEST CASE 3
    public void seleniumHandsOn5(){
        practiceTestSteps.visitarPagina(baseURL+"/practice-test-login/");
        practiceTestSteps.sendTextToElement(practiceTestPage.getUserNameTextBox(),"student");
        practiceTestSteps.sendTextToElement(practiceTestPage.getPasswordTextBox(),"incorrectPassword");
        practiceTestPage.getSubmitButton().click();
        practiceTestSteps.checkIfElementIsDisplayed(practiceTestPage.getErrorMessage());
        Assert.assertEquals(practiceTestPage.getErrorMessage().getText(),"Your password is invalid!");
        practiceTestSteps.cerrarNavegador();
    }
}
