import Steps.DemoQAHomeSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.*;

public class DemoQAHomeTest extends BaseTest
{

    DemoQAHomeSteps demoQAHomeSteps = new DemoQAHomeSteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba() {
        System.out.println("Método Before (Antes) Test");
        demoQAHomeSteps.abrirURL("https://demoqa.com/");
        myWebDriver.manage().window().maximize();
        scrollDown();
    }

    @AfterTest
    public void afterSuite() {
        demoQAHomeSteps.quitarWebDriver();
    }

    //Ejercicio 1 - When clicking option Elements, new page must be openText Box option menu must be displayed on menu on left.
    @Test(priority = 1)
    public void selectElements() {
        scrollDown();
        demoQAHomeSteps.selectElements();
        Assert.assertEquals(demoQAHomeSteps.isDisplayedTextBox(), true);
    }

    //Ejercicio 2 - When clicking Text Box option on left menu, form with fields: Full Name, Email, Current Address,
    //Permanent Address and Submit button must be displayed
    @Test(priority = 2)
    public void verifyForm() {
        demoQAHomeSteps.selectTextBox();
        Assert.assertEquals(demoQAHomeSteps.isDisplayedFullName(), true);
        Assert.assertEquals(demoQAHomeSteps.isDisplayedEmail(), true);
        Assert.assertEquals(demoQAHomeSteps.isDisplayedCurrentAddress(), true);
        Assert.assertEquals(demoQAHomeSteps.isDisplayedPermanentAddress(), true);
        scrollDown();
        Assert.assertEquals(demoQAHomeSteps.isDisplayedbtnSubmit(), true);
    }

    //Ejercicio 3 - When invalid email is input in Text Box form and clicking submit button, form must not be submitted.
    @Test(priority = 3)
    public void invalidEmail() {
        demoQAHomeSteps.typeFullName("Jane Doe");
        demoQAHomeSteps.typeEmail("janedoe@mail");
        demoQAHomeSteps.typeCurrentAddress("Test Av 2020, Los Angeles");
        demoQAHomeSteps.typePermanentAddress("Test Av 2020, San Diego");
        scrollDown();
        demoQAHomeSteps.submit();
        Assert.assertEquals(demoQAHomeSteps.getEmailErrorClass(), "mr-sm-2 field-error form-control");
    }

    //Ejercicio 4 - When valid mail is input in Text Box form, clicking submit button will display information below form.
    //Example: Full Name: Jane Doe
    //Email: janedoe@mail.com
    //Current Address: Test Av 2020, Los Angeles
    //Permanent Address: Test Av 2020, San Diego
    @Test(priority = 4)
    public void validEmail() {
        myWebDriver.navigate().refresh();
        demoQAHomeSteps.typeFullName("Jane Doe");
        demoQAHomeSteps.typeEmail("janedoe@mail.com");
        demoQAHomeSteps.typeCurrentAddress("Test Av 2020, Los Angeles");
        demoQAHomeSteps.typePermanentAddress("Test Av 2020, San Diego");
        scrollDown();
        demoQAHomeSteps.submit();
        Assert.assertEquals(demoQAHomeSteps.containsName("Jane Doe"), true);
        Assert.assertEquals(demoQAHomeSteps.containsEmail("janedoe@mail.com"), true);
        Assert.assertEquals(demoQAHomeSteps.containsCurrentAddress("Test Av 2020, Los Angeles"), true);
        Assert.assertEquals(demoQAHomeSteps.containsPermanentAddress("Test Av 2020, San Diego"), true);
    }

    private void scrollDown() {
        System.setProperty("webdriver.gecko.driver", "D://Selenium    Environment//Drivers//geckodriver.exe");
        //myWebDriver.navigate().to("Website URL");
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) myWebDriver;
        js.executeScript("window.scrollBy(0,500)", "");
    }
}