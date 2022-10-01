import Steps.TestAutomationMyStoreSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestAutomationMyStoreTest extends BaseTest {

    TestAutomationMyStoreSteps automationMyStoreTest = new TestAutomationMyStoreSteps(myWebDriver);
    @Test(description = "Ver boton Add")
    public void addToCartFadeShort(){
        String url = "http://automationpractice.com/index.php";
        automationMyStoreTest.openURL();
        Assert.assertEquals(automationMyStoreTest.getActualURL(), url);
        automationMyStoreTest.hoverEnImagenFadeShort();
        Assert.assertTrue(automationMyStoreTest.isDisplayedAddToCart());
    }

    @Test(description = "Ver boton More")
    public void FadeShortMoreDetails(){
        String url = "http://automationpractice.com/index.php";
        automationMyStoreTest.openURL();
        Assert.assertEquals(automationMyStoreTest.getActualURL(), url);
        automationMyStoreTest.hoverEnImagenFadeShort();
        Assert.assertTrue(automationMyStoreTest.isDisplayedMore());
    }

    @AfterTest
    public void despuesDeLaPrueba(){
        System.out.println("Close Driver");
        myWebDriver.quit();
    }
}