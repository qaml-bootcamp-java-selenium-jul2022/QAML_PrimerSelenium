import Steps.MyFirstWebSteps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstWebTest extends BaseTest {

    MyFirstWebSteps myFirstWebSteps = new MyFirstWebSteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba(){
        myFirstWebSteps.abrirHTML();
    }

    @Test
    public void loginMyFirstWebPage(){
        String username = "Gilberto";
        String password = "1234";

        System.out.println("La url abierta es " + myWebDriver.getCurrentUrl());
        myFirstWebSteps.escribirTextoUsername(username);
        System.out.println("Se ingreso username "+username);
        myFirstWebSteps.escribirTextoPassword(password);
        System.out.println("Se ingreso password "+password);
        myFirstWebSteps.clickLoginButton();
        System.out.println("click en login");


    }

    @AfterTest
    public void despuessDeLaPrueba(){
        myFirstWebSteps.myWebDriver.quit();
    }

}
