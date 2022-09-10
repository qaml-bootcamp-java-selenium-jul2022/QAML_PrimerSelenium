package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{
    public PrimerSteps(WebDriver webDriver) {
        super(webDriver);
    }


        public void abrirURLGoogle(){
            myWebDriver.get("https:www.google.com");
        }

        public void navegarAFacebook(){
            myWebDriver.navigate().to("https://es-la.facebook.com/");
            System.out.println(myWebDriver.getCurrentUrl());
        }
        public void navegarAESPN(){
            myWebDriver.navigate().to("https://www.espn.com.co/");
            System.out.println(myWebDriver.getCurrentUrl());
        }

        public void retrocederPaginaEnNavegador(){
            myWebDriver.navigate().back();
            System.out.println(myWebDriver.getCurrentUrl());
        }

        public void avanzarPaginaNavegador(){
           myWebDriver.navigate().forward();
            System.out.println(myWebDriver.getCurrentUrl());
        }

        public void refrescarPagina(){
            myWebDriver.navigate().refresh();
            System.out.println(myWebDriver.getCurrentUrl());
        }

        public void obtenerURLPagina(){
            System.out.println("la url abierta es "+myWebDriver.getCurrentUrl());
        }

        public void obtenerTituloPaginaAbierta(){
            System.out.println("El título de la página es "+ myWebDriver.getTitle());
        }
        public  void imprimirCodigoFuente(){
            System.out.println(myWebDriver.getPageSource());
        }
        public void cerrarNavegador(){
            myWebDriver.quit();
        }

}
