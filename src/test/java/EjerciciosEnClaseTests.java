import Pages.DemoQaPage;
import Steps.DemoQaSteps;
import Steps.PrimerStep;
import org.testng.annotations.Test;

public class EjerciciosEnClaseTests extends BaseTest{
    PrimerStep primerStep = new PrimerStep(myWebDriver);


    @Test
    public void seleniumEjercicio2(){
        primerStep.abrirGoogle();
        primerStep.imprimirTituloPagina();
        primerStep.imprimirUrlActual();
        primerStep.imprimirCodigoFuente();
        primerStep.cerrarNavegador();
    }

    @Test
    public void seleniumEjercicio3(){
        primerStep.visitarPagina("https://www.google.com/");
        primerStep.imprimirUrlActual();
        primerStep.navegarAUrl("https://www.facebook.com/");
        primerStep.imprimirUrlActual();
        primerStep.navegarAUrl("https://espndeportes.espn.com/");
        primerStep.imprimirUrlActual();
        primerStep.moverAtras();
        primerStep.moverAtras();
        primerStep.imprimirUrlActual();
        primerStep.moverAdelante();
        primerStep.imprimirUrlActual();
        primerStep.refrescarUrl();
        primerStep.imprimirUrlActual();
        primerStep.cerrarNavegador();

    }


}
