package Steps;

import Pages.DemoQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQASteps extends BaseSteps{

    public DemoQASteps(WebDriver webDriver) {
        super(webDriver);
    }
    DemoQAPage demoQAPage = new DemoQAPage(myWebDriver);

    public void abrirURL(String url) {
        myWebDriver.get(url);

    }
    public void enviarNombreCompleto (String name){
        WebElement fullName = demoQAPage.getFullName();
        fullName.sendKeys(name);
    }
    public void enviarCorreo (String correo){
        WebElement email = demoQAPage.getEmail();
        email.sendKeys(correo);
    }
    public void enviarDireccionActual (String direccion){
        WebElement address = demoQAPage.getCurrentAddress();
        address.sendKeys(direccion);
    }
    public void enviarDireccionPermanente (String direccionP){
        WebElement address = demoQAPage.getPermanentAddress();
        address.sendKeys(direccionP);
    }

}


