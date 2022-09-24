package Steps;

import Pages.ToolsQAPage;
import Pages.DemoQAPage2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoQASteps2 extends BaseSteps{
    public DemoQASteps2(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }
    ToolsQAPage toolsQAPage = new ToolsQAPage(myWebDriver);
    DemoQAPage2 toolsQAPagePrincipal = new DemoQAPage2(myWebDriver);

    public void seleccionarColor(String color){
        WebElement selectorDeColores = toolsQAPage.selectorColors();
        toolsQAPage.getSelect(selectorDeColores).selectByVisibleText(color);
        System.out.println("Se selecciono el color "+ toolsQAPage.getSelect(selectorDeColores).getFirstSelectedOption().getText());
    }

    public List<WebElement> imprimirTodasLasOpciones(){
        WebElement selectorDeColores = toolsQAPage.selectorColors();
        return toolsQAPage.getSelect(selectorDeColores).getOptions();
    }

    public Boolean esListaMultiple(){
        WebElement selectorDeColores = toolsQAPage.selectorColors();
        System.out.println("Boolean esListaMultiple= "+ toolsQAPage.getSelect(selectorDeColores).isMultiple());
        return toolsQAPage.getSelect(selectorDeColores).isMultiple();

    }
    public String primeraOpcionSeleccionada(){
        WebElement selectorDeColores = toolsQAPage.selectorColors();
        System.out.println("Pirmer Elemento= "+ toolsQAPage.getSelect(selectorDeColores).getFirstSelectedOption().getText());
        return toolsQAPage.getSelect(selectorDeColores).getFirstSelectedOption().getText();

    }

    public void imprimirOpcionCero(){
        WebElement opcionCero = toolsQAPage.selectorColors();
        toolsQAPage.getSelect(opcionCero).selectByIndex(0);
    }

    public void imprimirOpcionAuto(){
        WebElement opcionAuto = toolsQAPage.selectorColors();
        toolsQAPage.getSelect(opcionAuto).selectByValue("10");
    }

    public void hacerClickElementsSquare(){
        WebElement elementsSquare = toolsQAPagePrincipal.getElementLink();
        elementsSquare.click();
    }

    public void hacerClickTextBoxMenu(){
        WebElement textBoxMenu = toolsQAPagePrincipal.getTextBoxLinkMenu();
        textBoxMenu.click();
    }

    public void ingresarNombreUsuario(String userName){
        WebElement userNameBox = toolsQAPagePrincipal.getUserName();
        userNameBox.sendKeys(userName);
    }

    public void ingresarCorreo(String correo){
        WebElement emailBox = toolsQAPagePrincipal.getEmail();
        emailBox.sendKeys(correo);
    }
    public void ingresarDireccionAcuatl(String direccionActual){
        WebElement direccionActualBox = toolsQAPagePrincipal.getCurrentAddress();
        direccionActualBox.sendKeys(direccionActual);
    }

    public void ingresarDireccionPermanente(String direccionPermanente){
        WebElement direccionPermanenteBox = toolsQAPagePrincipal.getPermanentAddress();
        direccionPermanenteBox.sendKeys(direccionPermanente);
    }

    public void obtenerUbicacionUltimoElemento(){
        int x = toolsQAPagePrincipal.getLastElementShowedLocation().getX();
        int y = toolsQAPagePrincipal.getLastElementShowedLocation().getY();
        JavascriptExecutor jse = (JavascriptExecutor)myWebDriver;
        jse.executeScript("window.scrollBy("+x+","+y+")");
    }

    public void hacerClickSubmitBoton(){
        WebElement botonSubmit = toolsQAPagePrincipal.getSubmitButton();
        botonSubmit.click();
    }

    public void limpiarCampos(){
        WebElement userNameBox = toolsQAPagePrincipal.getUserName();
        WebElement emailBox = toolsQAPagePrincipal.getEmail();
        WebElement direccionActualBox = toolsQAPagePrincipal.getCurrentAddress();
        WebElement direccionPermanenteBox = toolsQAPagePrincipal.getPermanentAddress();
        userNameBox.clear();
        emailBox.clear();
        direccionActualBox.clear();
        direccionPermanenteBox.clear();

    }

}
