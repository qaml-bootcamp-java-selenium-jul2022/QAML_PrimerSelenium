package Steps;

import Pages.DemoQAPage2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DemoQASteps2 extends BaseSteps{
    public DemoQASteps2(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }
    DemoQAPage2 demoQAPage2 = new DemoQAPage2(myWebDriver);


    public void hacerClickElementsSquare(){
        WebElement elementsSquare = demoQAPage2.getElementLink();
        elementsSquare.click();
    }

    public void hacerClickTextBoxMenu(){
        WebElement textBoxMenu = demoQAPage2.getTextBoxLinkMenu();
        textBoxMenu.click();
    }

    public void ingresarNombreUsuario(String userName){
        WebElement userNameBox = demoQAPage2.getUserName();
        userNameBox.sendKeys(userName);
    }

    public void ingresarCorreo(String correo){
        WebElement emailBox = demoQAPage2.getEmail();
        emailBox.sendKeys(correo);
    }
    public void ingresarDireccionAcuatl(String direccionActual){
        WebElement direccionActualBox = demoQAPage2.getCurrentAddress();
        direccionActualBox.sendKeys(direccionActual);
    }

    public void ingresarDireccionPermanente(String direccionPermanente){
        WebElement direccionPermanenteBox = demoQAPage2.getPermanentAddress();
        direccionPermanenteBox.sendKeys(direccionPermanente);
    }

    public void obtenerUbicacionUltimoElemento(){
        int x = demoQAPage2.getLastElementShowedLocation().getX();
        int y = demoQAPage2.getLastElementShowedLocation().getY();
        JavascriptExecutor jse = (JavascriptExecutor)myWebDriver;
        jse.executeScript("window.scrollBy("+x+","+y+")");
    }

    public void hacerClickSubmitBoton(){
        WebElement botonSubmit = demoQAPage2.getSubmitButton();
        botonSubmit.click();
    }

    public Boolean obternerNombreCompletoResultado(){
        return demoQAPage2.getNameOutput().isDisplayed();
    }
    public Boolean obtenerCorreoResultado(){
        return demoQAPage2.getEmailOutput().isDisplayed();
    }
    public Boolean obtenerDireccionActualResultado(){
        return demoQAPage2.getCurrentAddressOutput().isDisplayed();
    }
    public Boolean obtenerDireccionPermanenteResultado(){
        return demoQAPage2.getPermanentAddressOutput().isDisplayed();
    }

    public Boolean verificarFormularioVisible(){
        return demoQAPage2.getForm().isDisplayed();
    }

    public boolean obtenerEmailClassAttribute() {
        return demoQAPage2.getEmail().getAttribute("class").contains("field-error");
    }

    public Boolean verificarTextBoxButtonVisible(){
        return demoQAPage2.getTextBoxLinkMenu().isDisplayed();
    }

}
