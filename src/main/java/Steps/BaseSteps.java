package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Objects;

public class BaseSteps {
    public WebDriver myWebDriver;

    public BaseSteps (WebDriver webDriverDeTests) {
        myWebDriver = webDriverDeTests;
    }

    public void visitarPagina(String web) {
        myWebDriver.get(web);
    }

    public boolean verifyUrl(String url){
        if (Objects.equals(url, myWebDriver.getCurrentUrl())) {
            return true;
        }else {
            return false;
        }
    }
    public void checkIfElementIsEnabled (WebElement element){
        element.isEnabled();
        System.out.println("El elemento: " + element.getAttribute("id") + " esta activo");
    }
    public void checkIfElementIsDisplayed (WebElement element){
        element.isDisplayed();
        System.out.println("El elemento: " + element.getAttribute("id") + " es visible");
    }

    public void sendTextToElement (WebElement element,String texto){
        element.sendKeys(texto);
    }

    public void cerrarNavegador(){
        myWebDriver.quit();
    }
}
