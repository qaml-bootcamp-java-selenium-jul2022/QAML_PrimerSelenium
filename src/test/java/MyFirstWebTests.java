import Steps.BaseSteps;
import Steps.MyFirstWebSteps;
import org.testng.annotations.Test;

public class MyFirstWebTests extends BaseTest {

    MyFirstWebSteps myFirstWebSteps=new MyFirstWebSteps(myWebDriver);

    @Test
    public void iniciarSesionEnMyFirstWeb(){
        myFirstWebSteps.abrirURL("file:///Users/monica.hoyos/IdeaProjects/SeleniumWebDriverQAminds/basicHTML_localizadoresCSS.html");
        myFirstWebSteps.escribirUsernameEnTextbox("usuario123");
        myFirstWebSteps.escribirPasswrordEnTextBox("password123");
        myFirstWebSteps.clickEnBotonLogin();
        myFirstWebSteps.cerrarNavegador();
    }

}
