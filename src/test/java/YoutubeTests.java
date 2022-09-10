import Steps.PrimerSteps;
import Steps.YoutubeSteps;
import org.testng.annotations.Test;

public class YoutubeTests extends BaseTest{

    PrimerSteps primerSteps=new PrimerSteps(myWebDriver);
    YoutubeSteps youtubeTests=new YoutubeSteps(myWebDriver);

    @Test
    public void ingresarTextoSearchBox(){
        youtubeTests.abrirURL("https://www.youtube.com/");
        youtubeTests.escribirTexboxSearchBox("qa minds lab");
        youtubeTests.cerrarNavegador();
    }

    //Tarea,  en el archivo de html de basic HTMl crear, otro page, otro steps y otro test... Enviar usuario, contraseña y click en el boton
}
