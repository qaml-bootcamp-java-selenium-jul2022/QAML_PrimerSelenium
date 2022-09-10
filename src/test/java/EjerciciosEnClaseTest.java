import Steps.BaseSteps;
import Steps.PrimerSteps;
import org.testng.annotations.Test;

public class EjerciciosEnClaseTest extends BaseTest {
    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    @Test
    public void seleniumEjercicio2(){
        primerSteps.abrirURLEnBrowser();
        primerSteps.obtenerTituloPagina();
        primerSteps.obtenerURLActual();
        primerSteps.imprimirCodigoFuente();
        primerSteps.cerrarNavegador();
    }
}
