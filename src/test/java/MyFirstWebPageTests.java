import Pages.MyFirstWebPage;
import Steps.MyFirstWebPageSteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstWebPageTests extends BaseTest{
    MyFirstWebPageSteps myFirstWebPage = new MyFirstWebPageSteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba(){
        myFirstWebPage.abrirURL("file:///C:/Users/ALV/Documents/Bootcamp/basicHTML.html");
    }

    @Test
    public void llenarFormularioLogin(){
        myFirstWebPage.enviarUsername("alvarom");
        myFirstWebPage.enviarPassword("Pwd1234");
        myFirstWebPage.clickLoginButton();
    }

    @AfterTest
    public void cerrarBrowser(){
        myFirstWebPage.myWebDriver.quit();
    }
}
