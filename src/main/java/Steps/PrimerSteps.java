package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{
    public PrimerSteps(WebDriver myWebDriver) {
        super(myWebDriver);
    }
    public void abrirURL(String URL) {
        myWebDriver.get(URL);
    }

    public String obtenerURL() {
        return myWebDriver.getCurrentUrl();
    }

    public String obtenerTituloPagina() {
        return myWebDriver.getTitle();
    }

    public void cerrarURL() {
        myWebDriver.quit();
    }
}
