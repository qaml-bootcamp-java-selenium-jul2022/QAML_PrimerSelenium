package Steps;

import Pages.MyStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreStep extends BaseSteps {
    public MyStoreStep(WebDriver webDriver) {
        super(webDriver);
    }

    MyStorePage myStorePage = new MyStorePage(myWebDriver);

    public void openURL(String url) {
        myWebDriver.get(url);
    }

    public boolean validarCategoriaWomen() {
        WebElement categoria = myStorePage.getCategoriaWomen();
        boolean res = categoria.isDisplayed();
        return res;
    }

    public boolean validarCategoriaDress() {
        WebElement categoria = myStorePage.getCategoriaDress();
        boolean res = categoria.isDisplayed();
        return res;
    }

    public boolean validarCategoriaTshirt() {
        WebElement categoria = myStorePage.getCategoriaTshirts();
        boolean res = categoria.isDisplayed();
        return res;
    }

    public void clickenCategoriaWomen() {
        WebElement categoria = myStorePage.getCategoriaWomen();
        categoria.click();
    }

    public void clickenCategoriaDresses() {
        WebElement categoria = myStorePage.getCategoriaDress();
        categoria.click();
    }

    public void clickenCategoriaTshirt() {
        WebElement categoria = myStorePage.getCategoriaTshirts();
        categoria.click();
    }

    public String validartitleWomen() {
        WebElement texto = myStorePage.getCategoriaTitleWomen();
        String res = texto.getAttribute("outerText");
        return res;

    }

    public String validartextoWomen() {
        WebElement texto1 = myStorePage.getCategoriaWomenText1();
        WebElement texto2 = myStorePage.getCategoriaWomenText2();
        String res1 = texto1.getAttribute("outerText").toString();
        String res2 = texto2.getAttribute("outerText").toString();
        return res1 + " " + res2;
    }

    public String validarCantidadArticulos(){
        WebElement cantidad= myStorePage.getCantidadWomen();
        String cantidad1 = cantidad.getAttribute("textContent").toString();
        return cantidad1;
    }

    public String validartitleDresses() {
        WebElement texto = myStorePage.getCategoriaTitleDress();
        String res = texto.getAttribute("outerText");
        return res;

    }

    public String validartextoDresses() {
        WebElement texto1 = myStorePage.getCategoriaDressesText1();
        WebElement texto2 = myStorePage.getCategoriaDressesText2();
        String res1 = texto1.getAttribute("outerText").toString();
        String res2 = texto2.getAttribute("outerText").toString();
        return res1 + " " + res2;
    }

    public String validarCantidadArticulosDresses(){
        WebElement cantidad= myStorePage.getCantidadDresses();
        String cantidad1 = cantidad.getAttribute("textContent").toString();
        return cantidad1;
    }

    public String validartitleTshirt() {
        WebElement texto = myStorePage.getCategoriaTitleShirt();
        String res = texto.getAttribute("outerText");
        return res;

    }

    public String validartextoTshirt() {
        WebElement texto1 = myStorePage.getCategoriaShirtText1();
        WebElement texto2 = myStorePage.getCategoriaShirtText2();
        String res1 = texto1.getAttribute("outerText").toString();
        String res2 = texto2.getAttribute("outerText").toString();
        return res1 + " " + res2;
    }

    public String validarCantidadArticulosTshirt(){
        WebElement cantidad= myStorePage.getCantidadShirt();
        String cantidad1 = cantidad.getAttribute("textContent").toString();
        return cantidad1;
    }
}
