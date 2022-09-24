package Steps;

import Pages.ToolsQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ToolsQASteps extends BaseSteps{
    public ToolsQASteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    ToolsQAPage toolsQAPage = new ToolsQAPage(myWebDriver);

    public void seleccionarColor(String color){
        WebElement selectorDeColores = toolsQAPage.selectorColors();
        toolsQAPage.getSelect(selectorDeColores).selectByVisibleText(color);
        System.out.println("Se selecciono el color " + toolsQAPage.getSelect(selectorDeColores).getFirstSelectedOption().getText());
    }

    public List<WebElement> getAllSelectOptions(){
        WebElement selectorDeColores = toolsQAPage.selectorColors();
        return toolsQAPage.getSelect(selectorDeColores).getOptions();
    }

    public boolean isMultiple(){
        WebElement selectorDeColores = toolsQAPage.selectorColors();
        return toolsQAPage.getSelect(selectorDeColores).isMultiple();
    }

    public WebElement obtenerPrimerElementoSeleccionado(){
        WebElement selectorDeColores = toolsQAPage.selectorColors();
        return toolsQAPage.getSelect(selectorDeColores).getFirstSelectedOption();
    }

    public void obtenerOpcionPorValor(String valor){
        WebElement selectorDeColores = toolsQAPage.selectorColors();
        toolsQAPage.getSelect(selectorDeColores).selectByValue(valor);
    }
}
