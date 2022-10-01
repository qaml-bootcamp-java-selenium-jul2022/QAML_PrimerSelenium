import Steps.ToolsQASteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolsQATest extends BaseTest {

    ToolsQASteps toolsQASteps = new ToolsQASteps(myWebDriver);

      @BeforeTest
      public void beforeTest()
      {
          toolsQASteps.abrirURL("https://demoqa.com/select-menu");
          myWebDriver.manage().window().maximize();
      }

    @Test
    public void seleccionarColor() {
        toolsQASteps.seleccionarColor("Voilet");
    }

    @AfterTest
    public void afterTest()
    {
        toolsQASteps.quitarWebDriver();
    }
}
