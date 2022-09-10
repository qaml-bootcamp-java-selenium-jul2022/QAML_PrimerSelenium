package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{
    public PrimerSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }


    //PASO 1
    public void abrirGoogle(){
        myWebDriver.get("https://www.google.com/");
    }
    //PASO 2
    public void imprimirTituloPagina(){
        System.out.println(myWebDriver.getTitle());
    }
    //PASO 3
    public void imprimirURLActual(){
        System.out.println(myWebDriver.getCurrentUrl());
    }
    //PASO 4
    public void imprimirCodigoFuente(){
        System.out.println(myWebDriver.getPageSource());
    }
    //PASO 5
    public void cerrarNavegador(){
        myWebDriver.close();
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
