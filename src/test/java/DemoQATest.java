import Steps.DemoQASteps;
import Steps.PracticeTestAutomationSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQATest extends BaseTest {

    DemoQASteps demoqa = new DemoQASteps(myWebDriver);

    @Test
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

    @AfterTest
    public void despuesDeLaPrueba(){

        System.out.println("Close Test ");
        myWebDriver.quit();
    }

}
