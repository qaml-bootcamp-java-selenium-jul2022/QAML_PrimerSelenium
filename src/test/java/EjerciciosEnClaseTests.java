import Steps.PrimerSteps;
import org.testng.annotations.Test;

public class EjerciciosEnClaseTests extends BaseTest {

    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    @Test
    public void seleniumEjercicio2() {
        primerSteps.abrirURL("https://www.google.com/");
        primerSteps.imprimirTituloPagina();
        primerSteps.imprimirURLActual();
        primerSteps.imprimirCodigoFuente();
    }

    @Test
    public void seleniumEjercicio3() {
        primerSteps.abrirURL("https://www.google.com/");
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
        primerSteps.quitarWebDriver();
    }
}
