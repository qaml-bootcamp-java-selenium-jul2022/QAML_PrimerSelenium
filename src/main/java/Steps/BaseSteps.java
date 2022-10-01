package Steps;

import org.openqa.selenium.WebDriver;

import java.io.File;

public class BaseSteps {
    public WebDriver myWebDriver;
    public BaseSteps (WebDriver webDriverDeTests) {
        myWebDriver = webDriverDeTests;
    }
    //PASOS REPETITIVOS
    //Parte de las primeras tareas
    public void abrirurlnueva(String url){
        myWebDriver.get(url);
    }
}
