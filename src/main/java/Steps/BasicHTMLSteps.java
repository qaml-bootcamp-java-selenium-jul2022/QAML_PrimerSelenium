package Steps;

import Pages.BasicHTMLPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicHTMLSteps extends BaseSteps{

    BasicHTMLPage basicHTMLPage = new BasicHTMLPage(myWebDriver);
    public BasicHTMLSteps(WebDriver webDriver) {
        super(webDriver);
    }
    public void escribirUsuario(String usuario) {
        WebElement usuarioTxt = basicHTMLPage.escribirUsuario();
        usuarioTxt.sendKeys(usuario);
    }

    public void escribirContrasena(String contrasena) {
        WebElement contrasenaTxt = basicHTMLPage.escribirContrasena();
        contrasenaTxt.sendKeys(contrasena);
    }

    public void login() {
        WebElement loginBtn = basicHTMLPage.login();
        loginBtn.click();
    }
}
