import Steps.ToolsQASteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolsQATests extends BaseTest {
    ToolsQASteps toolsQASteps = new ToolsQASteps(myWebDriver);

    @BeforeTest
    public void beforeTest() {
        myWebDriver.get("https://demoqa.com/select-menu");
        myWebDriver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        myWebDriver.quit();
    }

    @Test
    public void seleccionarColorVoilet() {
        toolsQASteps.seleccionarColor("Voilet");
    }
}
