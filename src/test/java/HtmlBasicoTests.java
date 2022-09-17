import Steps.HtmlBasicoSteps;
import Steps.PrimerSteps;
import org.testng.annotations.Test;

public class HtmlBasicoTests extends BaseTest{
    PrimerSteps ps = new PrimerSteps(myWebDriver);
    HtmlBasicoSteps htmls = new HtmlBasicoSteps(myWebDriver);


    @Test(priority = 1)
    public void abrirUrlPagina(){
        ps.abrirurlnueva("file:///C:/Users/luisb/Desktop/new%202.html");
    }

    @Test(priority = 2)
    public void imprimirEtiquetasWeb(){
        ps.imprimirURLActual();
        ps.imprimirTituloPagina();

    }

    @Test(priority = 3)
    public void imprimirContenidoPaginaWeb(){
        htmls.obtenerContenidoPaginaWeb();

    }

    @Test(priority = 4)
    public void probarLogin(){
        htmls.escribirUserName("luisbravo");
        htmls.escribirPassword("contra");
        htmls.makeClickButton();
        ps.imprimirURLActual();
    }
/*
    @Test(priority = 4)
    public void escribirUserNameTextBox(){
        htmls.escribirUserName("luisbravo");
    }

    @Test(priority = 5)
    public void escribirPasswordTextBox(){
        htmls.escribirPassword("cont");
    }

    @Test(priority = 6)
    public void hacerClickBoton(){
        htmls.makeClickButton();
    }*/
}
