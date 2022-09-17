import Steps.PracticeTestAutomationSteps;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PracticeTestAutomationTest extends BaseTest {

    PracticeTestAutomationSteps practiceTestAutomationSteps = new PracticeTestAutomationSteps(myWebDriver);
    int count=0;
    @Test
    public void positiveLoginTest(){
        //String successtxt = "Congratulations student. You successfully logged in!";
        practiceTestAutomationSteps.openURL();
        practiceTestAutomationSteps.inputUsername("student");
        practiceTestAutomationSteps.inputPassword("Password123");
        practiceTestAutomationSteps.clickLoginButton();
        //Verify new URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(practiceTestAutomationSteps.getActualURL().
                contains("practicetestautomation.com/logged-in-successfully/"));
        //Verify message returned by getSuccessMessage method contains Congratulations or successfully strings
        Assert.assertTrue((practiceTestAutomationSteps.getSuccessMessage().contains("Congratulations"))
                ||(practiceTestAutomationSteps.getSuccessMessage().contains("successfully")));
        //Assert.assertEquals(practiceTestAutomationSteps.getSuccessMessage(),successtxt);
        Assert.assertTrue(practiceTestAutomationSteps.isLogoutButtonDisplayed()==true);
        practiceTestAutomationSteps.clickLogoutButton();
        Assert.assertEquals(practiceTestAutomationSteps.getActualURL(),
                "https://practicetestautomation.com/practice-test-login/");
        System.out.println("positiveLoginTest completed");
    }

    @Test
    public void negativeUserErrorTest(){
        //String invalidmsg = "Your username is invalid!";
        practiceTestAutomationSteps.openURL();
        Assert.assertEquals(practiceTestAutomationSteps.getActualURL(),
                "https://practicetestautomation.com/practice-test-login/");
        practiceTestAutomationSteps.inputUsername("student43");
        practiceTestAutomationSteps.inputPassword("Password123");
        practiceTestAutomationSteps.clickLoginButton();
        //Verify text received on invalid user is "Your username is invalid!"
        Assert.assertTrue(practiceTestAutomationSteps.getErrorMessage().contains("Your username is invalid!"));
        //Assert.assertEquals(practiceTestAutomationSteps.getErrorMessage(),invalidmsg);
        System.out.println("negativeUserErrorTest completed");
    }

    @Test
    public void negativePasswordErrorTest(){
        //String invalidmsg = "Your password is invalid!";
        practiceTestAutomationSteps.openURL();
        Assert.assertEquals(practiceTestAutomationSteps.getActualURL(),
                "https://practicetestautomation.com/practice-test-login/");
        practiceTestAutomationSteps.inputUsername("student");
        practiceTestAutomationSteps.inputPassword("Passworsdds123");
        practiceTestAutomationSteps.clickLoginButton();
        //Verify text received on invalid user is "Your password is invalid!"
        Assert.assertTrue(practiceTestAutomationSteps.getErrorMessage().contains("Your password is invalid!"));
        //Assert.assertEquals(practiceTestAutomationSteps.getErrorMessage(),invalidmsg);
        System.out.println("negativePasswordErrorTest");
    }

    @AfterTest
    public void despuesDeLaPrueba(){
        System.out.println("Close Driver");
        myWebDriver.quit();
    }


}
