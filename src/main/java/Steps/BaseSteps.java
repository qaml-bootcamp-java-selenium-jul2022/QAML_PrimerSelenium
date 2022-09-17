package Steps;

import org.openqa.selenium.WebDriver;

import java.io.File;

public class BaseSteps {
    public WebDriver myWebDriver;
    public BaseSteps (WebDriver webDriverDeTests) {
        myWebDriver = webDriverDeTests;
    }
    //PASOS REPETITIVOS
    //
    public void abrirurlnueva(String url){
        myWebDriver.get(url);
    }
}
