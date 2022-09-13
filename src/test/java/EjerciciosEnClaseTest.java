import Steps.PrimerSteps;
import org.testng.annotations.Test;

public class EjerciciosEnClaseTest  extends BaseTest{

    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    @Test
    public void seleniumEjercicio2(){
        primerSteps.abrirGoogle();
        primerSteps.imprimirTitulo();
        primerSteps.imprimirURLActual();
        primerSteps.imprimirCodigoFuente();
        primerSteps.cerrarNavegador();
    }
    @Test
    public void seleniumEjercicio3(){
        primerSteps.abrirGoogle();
        primerSteps.imprimirURLActual();
        primerSteps.navegarAFacebook();
        primerSteps.navegarAESPN();
        primerSteps.retrocederEnNavegador();
        primerSteps.retrocederEnNavegador();
        primerSteps.avanzarEnNavegador();
        primerSteps.refrescarNavegador();
        primerSteps.cerrarNavegador();
    }

}
