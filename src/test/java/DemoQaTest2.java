import Steps.DemoQaSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQaTest2 extends BaseTest {
    DemoQaSteps demoQaSteps = new DemoQaSteps(myWebDriver);

    private static final String URL = "https://demoqa.com/text-box/";

    @BeforeTest
    public void setUp(){
        demoQaSteps.abrirURL(URL);
    }

    @AfterTest
    public  void tearDown(){
        demoQaSteps.quitarWebDriver();
    }

    @Test
    public void settearFullName(){
        demoQaSteps.settearFullName("Monsse Vargas");
    }

    @Test
    public void settearEmail(){
        demoQaSteps.settearEmail("example@test.com");
    }

    @Test
    public void settearCurrentAddress(){
        demoQaSteps.settearCurrentAddress("Guadalajara 123, Jalisco");
    }

    @Test
    public void settearPermanentAddres(){
        demoQaSteps.settearPermanentAddress("Rinconada del camichin, Zapopan, Jalisco");
    }
    
}
