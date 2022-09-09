package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{

    public PrimerSteps(WebDriver webDriverDeTest) {
        super(webDriverDeTest);
    }
String Url = "https://www.google.com";

    public void open() {
        myWebDriver.get(Url);
        System.out.println("Abriendo URL de Chrome");
    }

    public void getURL() {
        myWebDriver.getCurrentUrl();
        System.out.println("La URL abierta es: " + myWebDriver.getCurrentUrl());
    }

    public void getTituloPagina() {
        System.out.println("El título de la página es: " + myWebDriver.getTitle());
    }

    public void close() {
        myWebDriver.quit();
        System.out.println("Cierra Navegador");
    }
}
