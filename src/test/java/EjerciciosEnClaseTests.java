import Steps.PrimerSteps;
import org.testng.annotations.Test;

public class EjerciciosEnClaseTests extends BaseTest {

    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    @Test
    public void seleniumEjercicio2() {
        primerSteps.abrirGoogle();
        //primerSteps.imprimirTituloPagina();
       // primerSteps.imprimirURLActual();
        //primerSteps.imprimirCodigoFuente();
        //primerSteps.cerrarNavegador();
    }

    @Test
    public void seleniumEjercicio3() {

    }
}
