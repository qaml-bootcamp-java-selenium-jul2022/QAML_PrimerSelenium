package Steps;

import Pages.ToolsQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ToolsQASteps extends BaseSteps{
    public ToolsQASteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    ToolsQAPage paginaSelects = new ToolsQAPage(myWebDriver);

    public void seleccionarColor(String color){
        WebElement selectorDeColores = paginaSelects.selectorColors();
        paginaSelects.getSelect(selectorDeColores).selectByVisibleText(color);
        System.out.println("Se selecciono el color "+
                paginaSelects.getSelect(selectorDeColores).getFirstSelectedOption().getText());
    }

    public void seleccionarPorValor(String value){
        WebElement selectorDeColores = paginaSelects.selectorColors();
        paginaSelects.getSelect(selectorDeColores).selectByValue(value);
        System.out.println("Se selecciono el color "+
                paginaSelects.getSelect(selectorDeColores).getFirstSelectedOption().getText());
    }

    public boolean listaEsMultiple(){
        WebElement selectorDeColores = paginaSelects.selectorColors();
        return paginaSelects.getSelect(selectorDeColores).isMultiple();
    }

    public void obtenerListaElementos(){
        WebElement selectorDeColores = paginaSelects.selectorColors();
        List<WebElement> listaOpciones = paginaSelects.getSelect(selectorDeColores).getOptions();
        System.out.println("Elementos del Select");
        for (WebElement opcion : listaOpciones) {
            System.out.println("Opcion ="+opcion.getText());
        }
    }

    public void seleccionarPrimerValor(){
        WebElement selectorDeColores = paginaSelects.selectorColors();
        System.out.println("El primer valor seleccionado es "+
                paginaSelects.getSelect(selectorDeColores).getFirstSelectedOption().getText());
    }

    public void seleccionarIndice0(){
        WebElement selectorDeColores = paginaSelects.selectorColors();
        paginaSelects.getSelect(selectorDeColores).selectByIndex(0);
        System.out.println("El color con indice 0 es "+
                paginaSelects.getSelect(selectorDeColores).getFirstSelectedOption().getText());
    }

    public void seleccionarAuto(){
        WebElement selectorDeColores = paginaSelects.selectorColors();
        paginaSelects.getSelect(selectorDeColores).selectByValue("auto");
        System.out.println("El color con valor Auto es "+
                paginaSelects.getSelect(selectorDeColores).getFirstSelectedOption().getText());
    }
}
