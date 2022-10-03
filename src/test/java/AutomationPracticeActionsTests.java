import Steps.AutomationPracticeSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationPracticeActionsTests extends  BaseTest{
    AutomationPracticeSteps automationPracticeSteps = new AutomationPracticeSteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba(){
        automationPracticeSteps.abrirURL("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void despuesDeLaPrueba(){
        automationPracticeSteps.myWebDriver.quit();
    }


    @Test
    public void hoverSobreImagen(){
        automationPracticeSteps.encontrarImagen();
    }

    @Test
    public void encontrarElementosDespuesDeHover(){
        Assert.assertEquals(automationPracticeSteps.isDisplayedAdd(),true);
        Assert.assertEquals(automationPracticeSteps.isDisplayedMore(),true);
    }
}
