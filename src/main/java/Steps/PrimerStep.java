package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerStep extends BaseSteps{
    public PrimerStep(WebDriver myWebDriver) {
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
