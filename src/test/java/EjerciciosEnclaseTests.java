import Steps.PrimerSteps;
import org.testng.annotations.Test;

public class EjerciciosEnclaseTests extends BaseTest{

 PrimerSteps primerSteps=new PrimerSteps(myWebDriver);

 @Test
    public  void seleniumEjercicio2(){
     primerSteps.abrirURLGoogle();
     primerSteps.obtenerURLPagina();
     primerSteps.obtenerTituloPaginaAbierta();
     primerSteps.imprimirCodigoFuente();
     primerSteps.cerrarNavegador();
 }

 @Test
    public void seleniumEjericio3(){
     primerSteps.abrirURLGoogle();
     primerSteps.obtenerURLPagina();
     primerSteps.navegarAFacebook();
     primerSteps.navegarAESPN();
     primerSteps.retrocederPaginaEnNavegador();
     primerSteps.retrocederPaginaEnNavegador();
     primerSteps.avanzarPaginaNavegador();
     primerSteps.refrescarPagina();
     primerSteps.cerrarNavegador();

 }
}
