import Steps.AutomationPracticeExercisesSteps;
import Steps.AutomationPracticeExercisesSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationPracticeExercisesTest extends BaseTest{
    AutomationPracticeExercisesSteps automationPracticeSteps = new AutomationPracticeExercisesSteps(myWebDriver);

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
        Assert.assertNotEquals(expectedURL,automationPracticeSteps.myWebDriver.getCurrentUrl());

        automationPracticeSteps.clickOnTshirtOption();
        Assert.assertNotEquals(expectedURL,automationPracticeSteps.myWebDriver.getCurrentUrl());

    }
    @Test
    public void requerimiento7(){
        String expectedURL = "http://automationpractice.com/index.php?id_category=3&controller=category";
        automationPracticeSteps.clickOnWomenOption();
        Assert.assertEquals(automationPracticeSteps.myWebDriver.getCurrentUrl(),expectedURL);
        Assert.assertEquals(automationPracticeSteps.bannerIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.secondSentenceFromBannerIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.thirdSentenceFromBannerIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.totalProductsIsDisplayed(),true);

    }

    @Test
    public void requerimiento8(){
        String expectedURL = "http://automationpractice.com/index.php?id_category=8&controller=category";
        automationPracticeSteps.clickOnDressOption();
        Assert.assertEquals(automationPracticeSteps.myWebDriver.getCurrentUrl(),expectedURL);
        Assert.assertEquals(automationPracticeSteps.bannerIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.firstSentenceFromBannerIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.secondSentenceFromBannerIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.totalProductsIsDisplayed(),true);
    }

    @Test
    public void requerimiento9(){
        String expectedURL = "http://automationpractice.com/index.php?id_category=5&controller=category";
        automationPracticeSteps.clickOnTshirtOption();
        Assert.assertEquals(automationPracticeSteps.myWebDriver.getCurrentUrl(),expectedURL);
        Assert.assertEquals(automationPracticeSteps.bannerIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.firstSentenceFromBannerIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.secondSentenceFromBannerIsDisplayed(),true);
        Assert.assertEquals(automationPracticeSteps.totalProductsIsDisplayed(),true);
    }

    @AfterTest
    public void despuesDeLaPrueba(){
        automationPracticeSteps.myWebDriver.quit();
    }
}
