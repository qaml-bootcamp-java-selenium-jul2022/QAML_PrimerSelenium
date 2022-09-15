package Steps;

import Pages.DemoQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQASteps extends BaseSteps{
    public DemoQASteps(WebDriver webDriver) {
        super(webDriver);
    }
    DemoQAPage demoQAPage = new DemoQAPage(myWebDriver);

    public void abrirURL(String url){
        myWebDriver.get(url);
    }

    public void enviarNombreCompleto(String texto) {
        WebElement searchBox = demoQAPage.getFullNameTextBox();
        searchBox.sendKeys(texto);
    }
    public void enviarCorreo(String correo) {
        WebElement searchBox = demoQAPage.getEmailTextBox();
        searchBox.sendKeys(correo);
    }

    public void enviarDireccionActual(String direccionActual) {
        WebElement searchBox = demoQAPage.getCurrentAddressTextBox();
        searchBox.sendKeys(direccionActual);
    }

    public void enviarDireccionPermanente(String direccionPermanente) {
        WebElement searchBox = demoQAPage.getPermanentAddressTextBox();
        searchBox.sendKeys(direccionPermanente);
    }
}
