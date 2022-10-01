package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{

    public PrimerSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void abrirGoogle() {
        myWebDriver.get("https://www.google.com/");
    }

    public String imprimirTituloPagina() {
        return  myWebDriver.getTitle();
    }

    public void imprimirCodigoFuente() {
        System.out.println(myWebDriver.getPageSource());
    }

    public void moverAPagina(String pagina){
        myWebDriver.navigate().to(pagina);
    }

    public void backPage(int veces){
        for(int i=0;i<veces;i++){
            myWebDriver.navigate().back();
        }
    }

    public void forwardPage(int veces){
        for(int i=0;i<veces;i++){
            myWebDriver.navigate().forward();
        }
    }

    public void actualizarPagina(){
        myWebDriver.navigate().refresh();
    }
}
