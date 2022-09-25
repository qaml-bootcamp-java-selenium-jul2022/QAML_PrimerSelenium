package Steps;

import Pages.AutomationPracticeExercisesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticeExercisesSteps extends BaseSteps{
    public AutomationPracticeExercisesSteps(WebDriver myWebDriverDeTests) {
        super(myWebDriverDeTests);
    }

    AutomationPracticeExercisesPage automationPracticeExercisesPage = new AutomationPracticeExercisesPage(myWebDriver);

    public Boolean verificarCategoriasTabActivo(){
        return automationPracticeExercisesPage.getCategoriesTab().isEnabled();
    }

    public void clicWomenCategoryTab(){
        WebElement categoryTab = automationPracticeExercisesPage.getWomenTab();
        categoryTab.click();
    }
    public void clicDressesCategoryTab(){
        WebElement categoryTab = automationPracticeExercisesPage.getDressesTab();
        categoryTab.click();
    }
    public void clicTshirtCategoryTab(){
        WebElement categoryTab = automationPracticeExercisesPage.getTshirtsTab();
        categoryTab.click();
    }

    public Integer resultadoBusquedaPorCategoria(){
        int cantidadProductos = automationPracticeExercisesPage.getProductListResult().size();
        return cantidadProductos;
    }

    public String getFirstTextFromWomenBanner(){
        String firstText = automationPracticeExercisesPage.getFirstTextFromWomenBanner();
        return firstText;
    }
    public String getSecondTextFromWomenBanner(){
        String secondText = automationPracticeExercisesPage.getSecondTextFromWomenBanner();
        return secondText;
    }
    public String getFirstTextFromDressesBanner(){
        String firstText = automationPracticeExercisesPage.getFirstTextFromDressesBanner();
        return firstText;
    }
    public String getSecondTextFromDressesBanner(){
        String secondText = automationPracticeExercisesPage.getSecondTextFromDressesBanner();
        return secondText;
    }
    public Boolean verifyContentFromCategoryBanner(String content){
        Boolean contentText = automationPracticeExercisesPage.getTshirtsBanner().contains(content);
        return contentText;
    }
    public String getSecondTextFromTshirtsBanner(){
        String secondText = automationPracticeExercisesPage.getSecondTextFromDressesBanner();
        return secondText;
    }
}
