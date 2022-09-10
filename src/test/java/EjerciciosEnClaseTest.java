import Steps.PrimerSteps;
import org.testng.annotations.Test;

public class EjerciciosEnClaseTest extends BaseTest{

    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    @Test
    public void SeleniumEjercicio2(){
        primerSteps.abrirGoogle();
        primerSteps.imprimirTituloPagina();
        primerSteps.imprimirURLActual();
        primerSteps.imprimirCodigoFuente();
        primerSteps.cerrarNavegador();
    }

    @Test
    public void SeleniumEjercicio3(){
        primerSteps.abrirGoogle();
        primerSteps.imprimirURLActual();
        primerSteps.moverAPagina("https://www.facebook.com/");
        primerSteps.imprimirURLActual();
        primerSteps.moverAPagina("https://www.espn.com.co/");
        primerSteps.imprimirURLActual();
        primerSteps.backPage(2);
        primerSteps.imprimirURLActual();
        primerSteps.forwardPage(1);
        primerSteps.imprimirURLActual();
        primerSteps.actualizarPagina();
        primerSteps.imprimirURLActual();
        primerSteps.cerrarNavegador();

    }

}
