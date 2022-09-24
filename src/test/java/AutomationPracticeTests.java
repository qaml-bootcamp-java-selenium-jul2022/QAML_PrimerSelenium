import Steps.AutomationPracticeSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationPracticeTests extends BaseTest{
    AutomationPracticeSteps automationPracticeSteps = new AutomationPracticeSteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba(){
        automationPracticeSteps.abrirURL("http://automationpractice.com/index.php");
    }

    @Test
    public void requerimiento5(){
        Assert.assertEquals(automationPracticeSteps.womenMenuOptionIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.dressMenuOptionIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.tshirtMenuOptionIsDisplayed(),true);
    }

    @Test
    public void requerimiento6(){

        String expectedURL = "http://automationpractice.com/index.php?id_category=3&controller=category";
        automationPracticeSteps.clickOnWomenOption();
        Assert.assertEquals(automationPracticeSteps.womenCategoryIsDisplayed(),true);
        Assert.assertEquals(expectedURL,automationPracticeSteps.myWebDriver.getCurrentUrl());

        automationPracticeSteps.clickOnDressOption();
        Assert.assertEquals(automationPracticeSteps.dressCategoryIsDisplayed(),true);

        automationPracticeSteps.clickOnTshirtOption();
        Assert.assertEquals(automationPracticeSteps.tshirtCategoryIsDisplayed(),true);


    }

    @AfterTest
    public void despuesDeLaPrueba(){
        automationPracticeSteps.myWebDriver.quit();
    }
}
