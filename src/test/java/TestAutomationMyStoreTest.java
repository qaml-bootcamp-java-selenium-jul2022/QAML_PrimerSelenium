
import Steps.TestAutomationMyStoreSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestAutomationMyStoreTest extends BaseTest {

    TestAutomationMyStoreSteps automationMyStoreTest = new TestAutomationMyStoreSteps(myWebDriver);
    @Test
    public void addToCartFadeShort(){

        String url = "http://automationpractice.com/index.php";

        automationMyStoreTest.openURL();
        Assert.assertEquals(automationMyStoreTest.getActualURL(), url);
        //Assert.assertFalse(automationMyStoreTest.displayBotonFadeShortAddToCart());
        automationMyStoreTest.hoverEnImagenFadeShort();
        Assert.assertTrue(automationMyStoreTest.displayBotonFadeShortAddToCart());
        automationMyStoreTest.clickBotonFadeShortAddToCart();
        System.out.println(automationMyStoreTest.getSuccesfullyAddToCartText());
        Assert.assertTrue(automationMyStoreTest.getSuccesfullyAddToCartText().contains("Product successfully added"));
        System.out.println("addToCartFadeShort");
    }

    @Test
    public void FadeShortMoreDetails(){
        String url = "http://automationpractice.com/index.php";
        String moreInfo = "Fashion has been creating well-designed collections since 2010.";
        automationMyStoreTest.openURL();
        Assert.assertEquals(automationMyStoreTest.getActualURL(), url);
        //Assert.assertFalse(automationMyStoreTest.displayBotonFadeShortMore());
        automationMyStoreTest.hoverEnImagenFadeShort();
        Assert.assertTrue(automationMyStoreTest.displayBotonFadeShortMore());
        automationMyStoreTest.clickBotonFadeShortMore();
        Assert.assertTrue(automationMyStoreTest.getMoreInfoText().contains(moreInfo));
        System.out.println("FadeShortMoreDetails");
    }

    @AfterTest
    public void despuesDeLaPrueba(){
        System.out.println("Close Driver");
        myWebDriver.quit();
    }


}
