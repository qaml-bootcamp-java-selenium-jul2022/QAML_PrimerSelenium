package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{
    public PrimerSteps(WebDriver webDriver) {
        super(webDriver);
    }


        public void abrirURLGoogle(){
            myWebDriver.get("https:www.google.com");
        }


        public void navegarEnLaPagina(String url){
            myWebDriver.navigate().to(url);
            obtenerURLPagina();
        }

        public void retrocederPaginaEnNavegador(int n){
            for (int i=1; i<=n; i++) {
                    myWebDriver.navigate().back();
                    obtenerURLPagina();
                }
            }

        public void avanzarPaginaNavegador(){
           myWebDriver.navigate().forward();
            obtenerURLPagina();
        }

        public void refrescarPagina(){
            myWebDriver.navigate().refresh();
            obtenerURLPagina();
        }

        public void obtenerURLPagina(){
            System.out.println("la url Actual es "+myWebDriver.getCurrentUrl());
        }

        public void obtenerTituloPaginaAbierta(){
            System.out.println("El título de la página es "+ myWebDriver.getTitle());
        }
        public  void imprimirCodigoFuente(){
            System.out.println(myWebDriver.getPageSource());
        }


}
