package Steps;

import Pages.BasePage;
import Pages.HTMLPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtmlSteps extends BasePage {


    public HtmlSteps(WebDriver webDriver) {
        super(webDriver);
    }

    HTMLPages htmlpages = new HTMLPages(myWebDriver);


    public void abrirURL(String url) {
        myWebDriver.get(url);

    }

    public void getUsuario (){
        WebElement searchUser = htmlpages.searchUser();
        searchUser.sendKeys("luisgerardomzo");
    }

    public void getPass (){
        WebElement searchPass = htmlpages.searchPass();
        searchPass.sendKeys("Qwerty123.");
    }
public void getLogin (){
        WebElement getLogin = htmlpages.seleccionarLogin();
        getLogin.click();
}
}
