package Steps;

import Pages.HtmlBasicoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtmlBasicoSteps extends BaseSteps{
    //Tareas HTML Local
    public HtmlBasicoSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    HtmlBasicoPage hbp = new HtmlBasicoPage(myWebDriver);

    public void escribirUserName(String username){
        WebElement userNameTextBox = hbp.getUserNameTextBox();
        userNameTextBox.sendKeys(username);
    }

    public void escribirPassword(String password){
        WebElement passwordTextBox = hbp.getPasswordTextBox();
        passwordTextBox.sendKeys(password);
    }

    public void makeClickButton(){
        WebElement makeClick = hbp.getButtonLogin();
        makeClick.click();
    }

    public void obtenerContenidoPaginaWeb(){
       WebElement contenidoWeb = hbp.getBodyText();
        WebElement contenidoWebB = hbp.getBodyTextB();
        WebElement tituloFormularioLogin = hbp.getLoginFormLogin();
        contenidoWeb.getText();
        contenidoWebB.getText();
        tituloFormularioLogin.getText();
        System.out.println(contenidoWebB.getText()+" "+contenidoWebB.getText());
        System.out.println(tituloFormularioLogin.getText());
    }
}
