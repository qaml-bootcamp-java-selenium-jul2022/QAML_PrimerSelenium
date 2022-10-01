import Steps.HoverSteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HoverTests extends BaseTest {

    HoverSteps hoverSteps = new HoverSteps(myWebDriver);

    @BeforeTest
    public void abrirUrl(){
        hoverSteps.abrirURL("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void TurnDown(){
        hoverSteps.quitarWebDriver();
    }

    @Test (priority = 1)
    public void crearHover(){
        hoverSteps.crearHover();
    }

    @Test (priority = 2)
    void clickInButton(){
        hoverSteps.clickInToButton();
    }
}
