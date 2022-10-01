package Steps;

import Pages.ToolsQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQASteps extends BaseSteps {
    public ToolsQASteps(WebDriver webDriverTest) {
        super(webDriverTest);
    }
    ToolsQAPage paginaSelects = new ToolsQAPage(myWebDriver);

    public void seleccionarColor(String color) {
        WebElement selectorDeColores = paginaSelects.selectorColors();
        paginaSelects.getSelect(selectorDeColores).selectByVisibleText(color);
        System.out.println("Se seleccionó el color "
                + paginaSelects.getSelect(selectorDeColores).getFirstSelectedOption().getText());
    }

    public void seleccionarPorValor(String value) {
        WebElement selectorDeColores = paginaSelects.selectorColors();
        paginaSelects.getSelect(selectorDeColores).selectByValue(value);
        System.out.println("Se seleccionó el color "
                + paginaSelects.getSelect(selectorDeColores).getFirstSelectedOption().getText());
    }

    public boolean listaEsMultiple() {
        WebElement selectorDeColores = paginaSelects.selectorColors();
        return paginaSelects.getSelect(selectorDeColores).isMultiple();
    }
}
