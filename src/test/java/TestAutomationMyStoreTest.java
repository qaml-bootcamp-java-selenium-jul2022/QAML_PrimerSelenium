import Steps.MyStoreStep;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

    public class TestAutomationMyStoreTest extends BaseTest {

        MyStoreStep automationMyStoreTest = new MyStoreStep(myWebDriver);
        @Test
        public void addToCartFadeShort(){

            String url = "http://automationpractice.com/index.php";

            automationMyStoreTest.openURL();
            Assert.assertEquals(automationMyStoreTest.getActualURL(), url);
            automationMyStoreTest.hoverEnImagenFadeShort();
            Assert.assertTrue(automationMyStoreTest.displayBotonFadeShortAddToCart());
            automationMyStoreTest.clickBotonFadeShortAddToCart();
            System.out.println(automationMyStoreTest.getSuccesfullyAddToCartText());
            Assert.assertFalse(automationMyStoreTest.getSuccesfullyAddToCartText().contains("Product successfully added"));
            System.out.println("addToCartFadeShort");
        }

        @Test
        public void FadeShortMoreDetails(){
            String url = "http://automationpractice.com/index.php";
            String moreInfo = "Fashion has been creating well-designed collections since 2010.";
            automationMyStoreTest.openURL();
            Assert.assertEquals(automationMyStoreTest.getActualURL(), url);
            automationMyStoreTest.hoverEnImagenFadeShort();
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

