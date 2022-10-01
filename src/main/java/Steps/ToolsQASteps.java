package Steps;

import Pages.ToolsQAPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQASteps extends BaseSteps {
    public ToolsQASteps(WebDriver webDriverTest) {
        super(webDriverTest);
    }

    ToolsQAPage toolsQAPage = new ToolsQAPage(myWebDriver);
    public void escribirFullName(String fullName) {
        WebElement fullNameTxt = toolsQAPage.fillFullName();
        fullNameTxt.sendKeys(fullName);
    }

    public void escribirContrasena(String contrasena) {
    }

    public void login() {
    }

    public void seleccionarColor(String color){
       WebElement selectorDeColores = toolsQAPage.selectorColors();
       toolsQAPage.getSelect(selectorDeColores).selectByVisibleText(color);
       System.out.printf("Se seleccionó el color " + toolsQAPage.getSelect(selectorDeColores).getFirstSelectedOption());
    }
}
