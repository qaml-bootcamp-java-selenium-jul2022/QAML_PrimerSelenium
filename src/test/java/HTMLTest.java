import Steps.HtmlSteps;
import Steps.PrimerSteps;
import org.testng.annotations.Test;

public class HTMLTest extends BaseTest{


    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);
    HtmlSteps htmlsteps = new HtmlSteps(myWebDriver);

@Test
    public void seleccionarHtml (){

    htmlsteps.abrirURL("C:\\Users\\LuisGerardoMunozOrte\\OneDrive - Biometria Aplicada SA de CV\\Documentos\\Documentos Luis Gerardo\\Capacitaciones\\Cursos QA Minds\\basicHTML.html");
    htmlsteps.getUsuario();
    htmlsteps.getPass();
    htmlsteps.getLogin();

}

}
